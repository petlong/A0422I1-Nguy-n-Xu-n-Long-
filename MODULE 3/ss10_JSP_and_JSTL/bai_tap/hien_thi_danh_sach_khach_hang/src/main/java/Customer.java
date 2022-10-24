public class Customer {
    private String ten;
    private String ngay_sinh;
    private String dai_chi;

    public Customer() {
    }

    public Customer(String ten, String ngay_sinh, String dai_chi) {
        this.ten = ten;
        this.ngay_sinh = ngay_sinh;
        this.dai_chi = dai_chi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgay_sinh() {
        return ngay_sinh;
    }

    public void setNgay_sinh(String ngay_sinh) {
        this.ngay_sinh = ngay_sinh;
    }

    public String getDai_chi() {
        return dai_chi;
    }

    public void setDai_chi(String dai_chi) {
        this.dai_chi = dai_chi;
    }
}

