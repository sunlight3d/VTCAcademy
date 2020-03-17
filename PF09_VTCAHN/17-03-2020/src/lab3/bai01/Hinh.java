package lab3.bai01;

public abstract class Hinh {
    //class Hinh ko co thuoc tinh do dai => ko tinh duoc chu vi, dien tich
    //phuong thuc tinh chu vi, dien tich phai la abstract
    //=> class Hinh cung phai la abstract
    private String ten;
    Hinh(String ten) {
        //Mac du ko the tao duoc doi tuong tu abstract class
        //Nhung abtract class van co ham contructor(phuogn thuc khoi tao)
        this.ten = ten;
    }
    //da la abstract thi ko dc private
    public abstract double tinhDienTich();
    public abstract double tinhChuVi();

    @Override
    public String toString() {
        return "ten='" + ten + "\n";
    }
    //Vi du khac ve abstract
    //Khi viet 1 man hinh trong ung dung Android
    //trong thu vien co san 1 abstract class Activity
    //trong man hinh nay co cac EditText,Button TextView,...
    //lap trinh vien phai lam, ham nay la ham onCreate(...)
    //onCreate la abstract method nam trong abstract class Activity
    //LoginActivity extends Activity
    //trong LoginActivity phai thuc thi phuong thuc onCreate
    
}

