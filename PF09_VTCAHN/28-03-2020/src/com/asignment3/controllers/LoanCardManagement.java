package com.asignment3.controllers;

import com.asignment3.Helper;
import com.asignment3.Main;
import com.asignment3.models.*;

import java.util.*;
import java.util.stream.Collectors;

public class LoanCardManagement implements IManagement{
    public static String filePath = "c:\\temp\\loancards.dat";
    public MemberCardManagement memberCardManagement;
    public BookManagement bookManagement;
    private ArrayList<LoanCard> loanCards = new ArrayList<>();
    private void appendLoanCard(LoanCard loanCard) {
        getLoanCardsFromFile().add(loanCard);
        FileManagement.saveToFile(loanCards, LoanCardManagement.filePath);
    }
    //viet 1 getter lay books tu file
    public ArrayList<LoanCard> getLoanCardsFromFile() {
        final ArrayList<LoanCard> loanCards = new ArrayList<>();
        try {
            ArrayList<Model> objects =  FileManagement.readFromFile(LoanCardManagement.filePath);
            for(Object object: objects) {
                if(object instanceof LoanCard) {
                    loanCards.add((LoanCard) object);
                }
            }
        }catch (Exception e){
            System.err.println("Cannot getMemberCardsFromFile:"+e.toString());
        } finally {
            this.loanCards = loanCards;
            return loanCards;
        }
    }

    @Override
    public void showMenu() {
        int choice = -1;
        while(choice != 0) {
            System.out.println("Quản lý thẻ mượn sách");
            System.out.println("----------------------------------------");
            System.out.println("1. Tạo mới thẻ mượn sách");
            System.out.println("2. Trả sách");
            System.out.println("3. Hiển thị thẻ mượn sách theo ngày mượn");
            System.out.println("4. Hiển thị thẻ theo người mượn");
            System.out.println("0. Trở về menu chính");
            System.out.println("----------------------------------------");
            System.out.println("Mời bạn lựa chọn(0 - 3)");
            choice = getScanner().nextInt();
            switch (choice) {
                case 1:
                    this.input();
                    Main.clearScreen();
                    break;
                case 2:
                    this.traSach();
                    Main.clearScreen();
                    break;
                case 3:
                    System.out.println("Nhap ngay(VD: 02/12/2018) :");
                    hienThiTheMuonSachTheoNgay(Helper.convertStringToDate(getScanner().nextLine()));
                    Main.clearScreen();
                    break;
                case 4:
                    hienThiTheMuonSachTheoNguoiMuon();
                    Main.clearScreen();
                    break;
                default:
                    break;
            }
        }
    }

    @Override
    public void update() {

    }

    @Override
    public void input() {
        System.out.println("======== Thêm mới một thẻ ========");
        //nghiep vu:
        //Khi tao ra 1 the muon sach moi => so luong sach trong bang sach phai giam di 1
        //neu so luong sach = 0, ko tao the moi
        //sau khi go ten sach, phai kiem tra xem co quyen sach nay ko(cv cua BookManagement) ?
        // phai kiem tra xem "ma chu the" co ton tai trong danh sach MemberCard hay ko

        Boolean continueOrNot = true;
        while(continueOrNot == true) {
            LoanCard newLoanCard = new LoanCard();
            newLoanCard.bookManagement = this.bookManagement;//flux
            newLoanCard.memberCardManagement = memberCardManagement;
            newLoanCard.input();
            if(newLoanCard.getValidate() == true) {
                //du dieu kien muon sach
                newLoanCard.setNgayMuon(new Date());
                appendLoanCard(newLoanCard);
            }
            System.out.println("Ban co muon tiep tuc(Y/N):");
            continueOrNot = getScanner().nextLine().equalsIgnoreCase("y") ? true : false;
        }
        FileManagement.saveToFile(this.loanCards, LoanCardManagement.filePath);
    }
    public LoanCard getLoanCardFromTheMuonSach(String theMuonSach) {
        try {
            return (LoanCard)getLoanCardsFromFile().stream()
                    .filter(loanCard -> loanCard.getMathe().equalsIgnoreCase(theMuonSach))
                    .collect(Collectors.toList()).get(0);
        } catch (Exception e) {
            return null;
        }
    }
    public void traSach() {
        System.out.println("Nhap the muon sach");
        String theMuonSach = getScanner().nextLine();
        LoanCard loanCard = this.getLoanCardFromTheMuonSach(theMuonSach);
        if(loanCard == null) {
            System.err.println("Ko co the nay");
        } else {
            MemberCard memberCard = memberCardManagement
                    .getMemberCardFromTheThuVien(loanCard.getMaTheThuVien());
            System.out.println("Mã thẻ thư viện : "+loanCard.getMaTheThuVien());
            System.out.println("Tên chủ thẻ : "+memberCard.getTenChuThe());
            System.out.println("Tên sách mượn : "+loanCard.getTenSach());
            System.out.println("Mã thẻ thư viện : ");
            System.out.println(loanCard);
            System.out.println("Ban co muon tra sach ko(y/n) ? ");
            if(getScanner().nextLine().equalsIgnoreCase("y")) {
                this.bookManagement.themMotQuyenSach(loanCard.getMaSach());
                loanCard.setNgayTra(new Date());
                System.out.println("Trả sách thành công !");
                //cards.remove(foundLoanCard);
            }
        }
    }
    public void hienThiTheMuonSachTheoNgay(Date date) {
        //phai tao mang moi, tron len mang cu la mat het du lieu
        List<LoanCard> ketQua = this.getLoanCardsFromFile().stream()
                .filter(card -> Helper.compare2Dates(card.getNgayMuon(),date))
                .collect(Collectors.toList());
        if(ketQua.isEmpty()) {
            System.out.println("Ko tim thay the");
            return;
        }
        for(LoanCard loanCard: ketQua) {
            System.out.println(loanCard);
        }
    }
    public void hienThiTheMuonSachTheoNguoiMuon() {
        System.out.println("Nhap ma the thu vien : ");
        String maTheThuVien = getScanner().nextLine();
        System.out.println("Nhap ten nguoi muon: ");
        String tenNguoiMuon = getScanner().nextLine();
        //1 LoanCard -> co 1 memberCard - 1 nguoi muon
        List<LoanCard> ketQua = this.getLoanCardsFromFile().stream()
                .filter(card -> {
                    String x = card.getMaTheThuVien();
                    String y = card.getMemberCard().getTenChuThe().trim();
                    return  card.getMaTheThuVien().equals(maTheThuVien) ||
                            card.getMemberCard().getTenChuThe().trim().equalsIgnoreCase(tenNguoiMuon);
                })
                .collect(Collectors.toList());
        for(LoanCard loanCard: ketQua) {
            System.out.println(loanCard.thongTinHienThi());
        }
    }
    @Override
    public void showAll() {
        System.out.println("================================================================================");
        System.out.println("Danh thẻ thẻ");
        System.out.println("================================================================================");
        System.out.println("Mã thẻ |Tên thẻ    | So CMND   | Ngay tao      |");
        System.out.println("================================================================================");
        for(LoanCard loanCard: getLoanCardsFromFile()) {
            System.out.println(loanCard.toString());
        }
        System.out.println("================================================================================");
    }

    @Override
    public Scanner getScanner() {
        return new Scanner(System.in);
    }

}
