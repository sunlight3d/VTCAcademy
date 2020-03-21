package lab03.bai4;


public class VietnameseTranslator implements INumberTranslator {
    @Override
    public String getString(Integer number) {
        switch (number) {
            case 0:
                return "không";
            case 1:
                return "một";
            case 2:
                return "hai";
            case 3:
                return "ba";
            case 4:
                return "bốn";
            case 5:
                return "năm";
            case 6:
                return "sáu";
            case 7:
                return "bảy";
            case 8:
                return "tám";
            case 9:
                return "chín";
            default:
                return "ko biết";
        }
    }

    @Override
    public Integer getNumber(String str) {
        switch (str.toLowerCase()){
            case "không":
                return 0;
            case "một":
                return 1;
            case "hai":
                return 2;
            case "ba":
                return 3;
            case "bốn":
                return 4;
            case "năm":
                return 5;
            case "sáu":
                return 6;
            case "bảy":
                return 7;
            case "tám":
                return 8;
            case "chín":
                return 9;
            default:
                return -1;
        }
    }
}
