package main.java.test3.BTCoBan.BTDieuKien;

public interface KiemTraDinhDang {
    static boolean kiemTraDinhDang(String s, String regex) {
        return s.matches(regex);
    }
}
