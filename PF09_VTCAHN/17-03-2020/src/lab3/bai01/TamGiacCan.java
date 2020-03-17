package lab3.bai01;
//Bai toan ko co so do UML, lam the nao ?
//1. Tim ra cac thuc the(danh tu), Ticket, ChuyenXe, XeBus => Model
//2. tim ra nhung input/output(object, object's array) => Management = Controller
//3Quan he giua cac thuc the o buoc 1. Chu y :" 1 - n, n-1, 1-1 , N - N => tach ra lam 2 quan he 1-n
//n -n : benh nhan va bac si, bang LichKham
//Viet code, code Java chi de hoc thoi => co Database
//Chon ngon ngu lap trinh:
//xay dung giao dien
public class TamGiacCan extends TamGiac {
    //multi - level inheritance
    public TamGiacCan(double ab, double c) {
        super("", ab, ab, c);
    }
}
