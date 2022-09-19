package bt_them2.Model;

import java.util.Objects;

public class Vehicle {
    public static class HangSX {
        private Integer MaHSX;
        private String TenHSX;
        private String quocGgia;

        public HangSX(Integer maHSX, String tenHSX, String quocGgia) {
            this.MaHSX = maHSX;
            this.TenHSX = tenHSX;
            this.quocGgia = quocGgia;
        }

        public Integer getMaHSX() {
            return MaHSX;
        }

        public void setMaHSX(Integer maHSX) {
            MaHSX = maHSX;
        }

        public String getTenHSX() {
            return TenHSX;
        }

        public void setTenHSX(String tenHSX) {
            TenHSX = tenHSX;
        }

        public String getQuocGgia() {
            return quocGgia;
        }

        public void setQuocGgia(String quocGgia) {
            this.quocGgia = quocGgia;
        }

        @Override
        public String toString() {
            return MaHSX + ". TenHSX='" + TenHSX +
                    ", quocGgia='" + quocGgia +", ";
        }
    }

    abstract static class All {
        private String bienKS;
        private Object hangSX;
        private Integer namSX;
        private String chu;

        public All(String bienKS, Object hangSX, Integer namSX, String chu) {
            this.bienKS = bienKS;
            this.hangSX = hangSX;
            this.namSX = namSX;
            this.chu = chu;
        }

        public All(String bienKS) {
            this.bienKS = bienKS;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof All)) return false;
            All all = (All) o;
            return Objects.equals(getBienKS(), all.getBienKS());
        }

        @Override
        public int hashCode() {
            return 0;
        }

        public All() {
        }

        public String getBienKS() {
            return bienKS;
        }

        public void setBienKS(String bienKS) {
            this.bienKS = bienKS;
        }

        public Object getHangSX() {
            return hangSX;
        }

        public void setHangSX(Object hangSX) {
            this.hangSX = hangSX;
        }

        public Integer getNamSX() {
            return namSX;
        }

        public void setNamSX(Integer namSX) {
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
            return "All{" +
                    "bienKS='" + bienKS + '\'' +
                    ", hangSX=" + hangSX +
                    ", namSX=" + namSX +
                    ", chu='" + chu + '\'' +
                    '}';
        }
    }

    public static class Oto extends All {
        private Integer soGhe;
        private String kieuXe;

        public Oto(String bienKS) {
            super(bienKS);
        }

        public Oto(String bienKS, Object hangSX, Integer namSX, String chu, Integer soGhe, String kieuXe) {
            super(bienKS, hangSX, namSX, chu);
            this.soGhe = soGhe;
            this.kieuXe = kieuXe;
        }

        public Integer getSoGhe() {
            return soGhe;
        }

        public void setSoGhe(Integer soGhe) {
            this.soGhe = soGhe;
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
                    "bienKS='" + super.bienKS + '\'' +
                    ", hangSX=" + super.hangSX +
                    ", namSX=" + super.namSX +
                    ", chu='" + super.chu + '\'' +
                    ", soGhe=" + soGhe +
                    ", kieuXe='" + kieuXe + '\'' +
                    '}';
        }
    }

    public static class Motor extends All {
        private Integer congSuat;

        public Motor(String bienKS, Object hangSX, Integer namSX, String chu, Integer congSuat) {
            super(bienKS, hangSX, namSX, chu);
            this.congSuat = congSuat;
        }

        public Motor(String bienKS) {
            super(bienKS);
        }

        public Integer getCongSuat() {
            return congSuat;
        }

        public void setCongSuat(Integer congSuat) {
            this.congSuat = congSuat;
        }

        @Override
        public String toString() {
            return "Motor{" +
                    "bienKS='" + super.bienKS + '\'' +
                    ", hangSX=" + super.hangSX +
                    ", namSX=" + super.namSX +
                    ", chu='" + super.chu + '\'' +
                    ", congSuat=" + congSuat +
                    '}';
        }
    }

    public static class Truck extends All {
        private Integer trongTai;

        public Truck(String bienKS, Object hangSX, Integer namSX, String chu, Integer trongTai) {
            super(bienKS, hangSX, namSX, chu);
            this.trongTai = trongTai;
        }

        public Truck(String bienKS) {
            super(bienKS);
        }

        public Integer getTrongTai() {
            return trongTai;
        }

        public void setTrongTai(Integer trongTai) {
            this.trongTai = trongTai;
        }

        @Override
        public String toString() {
            return "Truck{" +
                    "bienKS='" + super.bienKS + '\'' +
                    ", hangSX=" + super.hangSX +
                    ", namSX=" + super.namSX +
                    ", chu='" + super.chu + '\'' +
                    ", trongTai=" + trongTai +
                    '}';
        }
    }
}
