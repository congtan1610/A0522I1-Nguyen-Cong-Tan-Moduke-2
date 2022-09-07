package bai_tap_them2.model;


public class PhuongTien {
    public static class HangSX {
        private String maHang;
        private String tenHang;
        private String quocGia;

        public String getMaHang() {
            return maHang;
        }

        public void setMaHang(String maHang) {
            this.maHang = maHang;
        }

        public String getTenHang() {
            return tenHang;
        }

        public void setTenHang(String tenHang) {
            this.tenHang = tenHang;
        }

        public String getQuocGia() {
            return quocGia;
        }

        public void setQuocGia(String quocGia) {
            this.quocGia = quocGia;
        }

        @Override
        public String toString() {
            return "HangSX{" +
                    "maHang='" + maHang + '\'' +
                    ", tenHang='" + tenHang + '\'' +
                    ", quocGia='" + quocGia + '\'' +
                    '}';
        }

        public HangSX(String maHang, String tenHang, String quocGia) {
            this.maHang = maHang;
            this.tenHang = tenHang;
            this.quocGia = quocGia;

        }
    }
    public abstract class Chung {
        private String bienSo;
        private HangSX hang;
        private int namSX;
        private String chu;

        public Chung(String bienSo, HangSX hang, int namSX, String chu) {
            this.bienSo = bienSo;
            this.hang = hang;
            this.namSX = namSX;
            this.chu = chu;
        }

        public String getBienSo() {
            return bienSo;
        }

        public void setBienSo(String bienSo) {
            this.bienSo = bienSo;
        }

        public Object getHang() {
            return hang;
        }

        public void setHang(HangSX hang) {
            this.hang = hang;
        }

        public int getNamSX() {
            return namSX;
        }

        public void setNamSX(int namSX) {
            this.namSX = namSX;
        }

        public String getChu() {
            return chu;
        }

        public void setChu(String chu) {
            this.chu = chu;
        }

        @Override
        public String toString() {
            return "Chung{" +
                    "bienSo='" + bienSo + '\'' +
                    ", hang='" + hang + '\'' +
                    ", namSX=" + namSX +
                    ", chu='" + chu + '\'' +
                    '}';
        }
    }

    public class Oto extends Chung {
        private int choNgoi;
        private String kieuXe;

        public Oto(String bienSo, HangSX hang, int namSX, String chu, int choNgoi, String kieuXe) {
            super(bienSo, hang, namSX, chu);
            this.choNgoi = choNgoi;
            this.kieuXe = kieuXe;
        }

        public int getChoNgoi() {
            return choNgoi;
        }

        public void setChoNgoi(int choNgoi) {
            this.choNgoi = choNgoi;
        }

        public String getKieuXe() {
            return kieuXe;
        }

        public void setKieuXe(String kieuXe) {
            this.kieuXe = kieuXe;
        }

        @Override
        public String toString() {
            return "Oto{" +
                    "bienSo='" + super.bienSo + '\'' +
                    ", hang='" + super.hang + '\'' +
                    ", namSX=" + super.namSX +
                    ", chu='" + super.chu + '\'' +
                    ", choNgoi=" + choNgoi +
                    ", kieuXe='" + kieuXe + '\'' +
                    '}';
        }

    }

    public class XeTai extends Chung {
        private int trongTai;

        public XeTai(String bienSo, HangSX hang, int namSX, String chu, int trongTai) {
            super(bienSo, hang, namSX, chu);
            this.trongTai = trongTai;
        }

        public int getTrongTai() {
            return trongTai;
        }

        public void setTrongTai(int trongTai) {
            this.trongTai = trongTai;
        }

        @Override
        public String toString() {
            return "XeTai{" +
                    "bienSo='" + super.bienSo + '\'' +
                    ", hang='" + super.hang + '\'' +
                    ", namSX=" + super.namSX +
                    ", chu='" + super.chu + '\'' +
                    ", trongTai=" + trongTai +
                    '}';
        }
    }

    public class XeMay extends Chung {
        private String congSuat;

        public XeMay(String bienSo, HangSX hang, int namSX, String chu, String congSuat) {
            super(bienSo, hang, namSX, chu);
            this.congSuat = congSuat;
        }

        public String getCongSuat() {
            return congSuat;
        }

        public void setCongSuat(String congSuat) {
            this.congSuat = congSuat;
        }

        @Override
        public String toString() {
            return "XeMay{" +
                    "bienSo='" + super.bienSo + '\'' +
                    ", hang='" + super.hang + '\'' +
                    ", namSX=" + super.namSX +
                    ", chu='" + super.chu + '\'' +
                    ", congSuat='" + congSuat + '\'' +
                    '}';
        }
    }
}
