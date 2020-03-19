package lab03.bai4;

public interface INumberTranslator {
    //tren thuc te, de lam da ngon ngu, nguoi ta se co cac file resource
    //co dinh dang key: value
    //vd: "hello" = "xin chao" file vn.lang
    //vd: "hello" = "hello" file en.lang
    //vd: "hello" = "ni hou" file cn.lang
    public String getString(Integer number);//tu so chuyen sang tring. VD: 2 => hai
    public Integer getNumber(String str);//tu string chyen sang so
}
