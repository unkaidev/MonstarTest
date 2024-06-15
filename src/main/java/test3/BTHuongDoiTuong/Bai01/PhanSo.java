package main.java.test3.BTHuongDoiTuong.Bai01;

public class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo() {
    }

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public int timUocChungLonNhat(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public void rutGonPhanSo() {
        int i = timUocChungLonNhat(this.tuSo, this.mauSo);
        this.setTuSo(tuSo / i);
        this.setMauSo(mauSo / i);
    }

    public void congPhanSo(PhanSo p) {
        int tuSoMoi = this.tuSo * p.getMauSo() + this.mauSo * p.getTuSo();
        int mauSoMoi = this.mauSo * p.getMauSo();
        PhanSo phanSoMoi = new PhanSo(tuSoMoi, mauSoMoi);
        phanSoMoi.rutGonPhanSo();
        System.out.println("Tổng 2 phân số là : " + phanSoMoi);
    }

    public void truPhanSo(PhanSo p) {
        int tuSoMoi = this.tuSo * p.getMauSo() - this.mauSo * p.getTuSo();
        int mauSoMoi = this.mauSo * p.getMauSo();
        PhanSo phanSoMoi = new PhanSo(tuSoMoi, mauSoMoi);
        phanSoMoi.rutGonPhanSo();
        System.out.println("Hiệu 2 phân số là : " + phanSoMoi);
    }

    public void nhanPhanSo(PhanSo p) {
        int tuSoMoi = this.tuSo * p.tuSo;
        int mauSoMoi = this.mauSo * p.mauSo;
        PhanSo phanSoMoi = new PhanSo(tuSoMoi, mauSoMoi);
        phanSoMoi.rutGonPhanSo();
        System.out.println("Tích 2 phân số là : " + phanSoMoi);
    }

    public void chiaPhanSo(PhanSo p) {
        int tuSoMoi = this.tuSo * p.mauSo;
        int mauSoMoi = this.mauSo * p.tuSo;
        PhanSo phanSoMoi = new PhanSo(tuSoMoi, mauSoMoi);
        phanSoMoi.rutGonPhanSo();
        System.out.println("Thương 2 phân số là : " + phanSoMoi);
    }

    @Override
    public String toString() {
        return tuSo + "/" + mauSo;
    }
}
