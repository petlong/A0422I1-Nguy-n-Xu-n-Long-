package model;

public class ThanhToan {
    private int idThanhToan;
    private String nameThanhToan;

    public ThanhToan() {
    }

    public ThanhToan(String nameThanhToan) {
        this.nameThanhToan = nameThanhToan;
    }

    public ThanhToan(int idThanhToan, String nameThanhToan) {
        this.idThanhToan = idThanhToan;
        this.nameThanhToan = nameThanhToan;
    }

    public int getIdThanhToan() {
        return idThanhToan;
    }

    public void setIdThanhToan(int idThanhToan) {
        this.idThanhToan = idThanhToan;
    }

    public String getNameThanhToan() {
        return nameThanhToan;
    }

    public void setNameThanhToan(String nameThanhToan) {
        this.nameThanhToan = nameThanhToan;
    }
}
