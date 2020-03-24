package com.asignment3.controllers;

import com.asignment3.Helper;
import com.asignment3.Main;
import com.asignment3.models.*;

import java.util.*;
import java.util.stream.Collectors;

public class LoanCardManagement implements IManagement{
    public MemberCardManagement memberCardManagement;
    public BookManagement bookManagement;
    private ArrayList<LoanCard> cards = new ArrayList<>();
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
            LoanCard newCard = new LoanCard();
            newCard.bookManagement = this.bookManagement;//flux
            newCard.memberCardManagement = memberCardManagement;
            newCard.input();
            if(newCard.getValidate() == true) {
                //du dieu kien muon sach
                newCard.setNgayMuon(new Date());
                cards.add(newCard);
            }
            System.out.println("Ban co muon tiep tuc(Y/N):");
            continueOrNot = getScanner().nextLine().equalsIgnoreCase("y") ? true : false;
        }
    }

    public void traSach() {
        System.out.println("Nhap the muon sach");
        String theMuonSach = getScanner().nextLine();
        if(cards.stream()
                .filter(loanCard -> loanCard.getMathe().equalsIgnoreCase(theMuonSach))
                .collect(Collectors.toList()).isEmpty()) {
            System.err.println("Ko co the nay");
        } else {
            LoanCard foundLoanCard = (LoanCard)(cards.stream()
                    .filter(loanCard -> loanCard.getMathe().equalsIgnoreCase(theMuonSach))
                    .collect(Collectors.toList()).get(0));
            System.out.println(foundLoanCard);
            System.out.println("Ban co muon tra sach ko(y/n) ? ");
            if(getScanner().nextLine().equalsIgnoreCase("y")) {
                this.bookManagement.themMotQuyenSach(foundLoanCard.getMaSach());
                foundLoanCard.setNgayTra(new Date());
                //cards.remove(foundLoanCard);
            }
        }
    }
    public void hienThiTheMuonSachTheoNgay(Date date) {
        //phai tao mang moi, tron len mang cu la mat het du lieu
        List<LoanCard> ketQua = this.cards.stream()
                .filter(card -> card.getNgayMuon().equals(date))
                .collect(Collectors.toList());
        for(LoanCard loanCard: cards) {
            System.out.println(loanCard);
        }
    }
    public void hienThiTheMuonSachTheoNguoiMuon() {
        System.out.println("Nhap ma the thu vien : ");
        String maTheThuVien = getScanner().nextLine();

        System.out.println("Nhap ten nguoi muon: ");
        String tenNguoiMuon = getScanner().nextLine();

        //1 LoanCard -> co 1 memberCard - 1 nguoi muon
        List<LoanCard> ketQua = this.cards.stream()
                .filter(card -> card.getMaTheThuVien().equals(maTheThuVien) ||
                        card.getMemberCard().getTenChuThe().trim().equalsIgnoreCase(tenNguoiMuon))
                .collect(Collectors.toList());
        for(LoanCard loanCard: cards) {
            System.out.println(loanCard);
        }
    }
    @Override
    public void showAll() {
        System.out.println("================================================================================");
        System.out.println("Danh thẻ thẻ");
        System.out.println("================================================================================");
        System.out.println("Mã thẻ |Tên thẻ    | So CMND   | Ngay tao      |");
        System.out.println("================================================================================");
        for(LoanCard card: cards) {
            System.out.println(card.toString());
        }
        System.out.println("================================================================================");
    }

    @Override
    public Scanner getScanner() {
        return new Scanner(System.in);
    }

}
