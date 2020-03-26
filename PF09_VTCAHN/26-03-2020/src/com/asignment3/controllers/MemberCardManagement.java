package com.asignment3.controllers;

import com.asignment3.Main;
import com.asignment3.models.*;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemberCardManagement implements IManagement{
    public static String filePath = "c:\\temp\\membercards.dat";
    private ArrayList<MemberCard> memberCards = new ArrayList<>();
    public BookManagement bookManagement;

    public ArrayList<MemberCard> getMemberCards() {
        return memberCards;
    }

    private void appendMemberCard(MemberCard memberCard) {
        getMemberCardsFromFile().add(memberCard);
        FileManagement.saveToFile(memberCard, MemberCardManagement.filePath);
    }
    //viet 1 getter lay books tu file
    public ArrayList<MemberCard> getMemberCardsFromFile() {
        final ArrayList<MemberCard> memberCards = new ArrayList<>();
        try {
            ArrayList<Model> objects =  FileManagement.readFromFile(MemberCardManagement.filePath);
            for(Object object: objects) {
                if(object instanceof MemberCard) {
                    memberCards.add((MemberCard) object);
                }
            }
        }catch (Exception e){
            System.err.println("Cannot getMemberCardsFromFile:"+e.toString());
        } finally {
            this.memberCards = memberCards;
            return memberCards;
        }
    }

    @Override
    public void showMenu() {
        int choice = -1;
        while(choice != 0) {
            System.out.println("Quản lý thẻ thư viện");
            System.out.println("----------------------------------------");
            System.out.println("1. Xem danh thẻ thư viện");
            System.out.println("2. Cập nhật thông tin thẻ");
            System.out.println("3. Thêm mới một thẻ");
            System.out.println("0. Trở về menu chính");
            System.out.println("----------------------------------------");
            System.out.println("Mời bạn lựa chọn(0 - 3)");
            choice = getScanner().nextInt();
            switch (choice) {
                case 1:
                    this.showAll();
                    Main.clearScreen();
                    break;
                case 2:
                    this.update();
                    Main.clearScreen();
                    break;
                case 3:
                    this.input();
                    Main.clearScreen();
                    break;
                default:
                    break;
            }
        }
    }
    @Override
    public void input() {
        System.out.println("======== Thêm mới một thẻ ========");
        Boolean continueOrNot = true;
        while(continueOrNot == true) {
            MemberCard newMemberCard = new MemberCard();
            newMemberCard.input();
            appendMemberCard(newMemberCard);
            System.out.println("Ban co muon tiep tuc(Y/N):");
            continueOrNot = getScanner().nextLine().equalsIgnoreCase("y") ? true : false;
        }
        FileManagement.saveToFile(this.memberCards, MemberCardManagement.filePath);
    }
    public Boolean kiemTraTonTaiMaThe(String matheThuVien) {
        return !getMemberCardsFromFile().stream()
                .filter(memberCard -> memberCard.getMaThe().equalsIgnoreCase(matheThuVien))
                .collect(Collectors.toList()).isEmpty();
    }

    @Override
    public void update() {
        System.out.println("======== Cập nhật thông tin thẻ ========");
        Boolean continueOrNot = true;
        while(continueOrNot == true) {
            //Má thẻ bắt đầu bằng chữ B, sau đó là 2 số => regex
            System.out.println("- Nhập mã thẻ:");
            final String maThe = getScanner().nextLine();
            ArrayList<MemberCard> list2 = this.getMemberCardsFromFile();
            ArrayList<MemberCard> result = (ArrayList<MemberCard>)list2
                    .stream()
                    .filter(eachCard -> eachCard.getMaThe()
                            .equalsIgnoreCase(maThe))
                    .collect(Collectors.toList());
            if(result.isEmpty()) {
                System.err.println("Ko tim thay the voi ma :"+maThe);
            } else {
                MemberCard card = result.get(0);
                card.update();
                FileManagement.saveToFile(list2, MemberCardManagement.filePath);
            }
            System.out.println("Ban co muon tiep tuc(Y/N):");
            continueOrNot = getScanner().nextLine().equalsIgnoreCase("y") ? true : false;
        }
    }

    @Override
    public void showAll() {
        System.out.println("================================================================================");
        System.out.println("Danh thẻ thẻ");
        System.out.println("================================================================================");
        System.out.println("Mã thẻ |Tên thẻ    | So CMND   | Ngay tao      |");
        System.out.println("================================================================================");
        for(MemberCard card: getMemberCardsFromFile()) {
            System.out.println(card.toString());
        }
        System.out.println("================================================================================");
    }

    @Override
    public Scanner getScanner() {
        return new Scanner(System.in);
    }
}
