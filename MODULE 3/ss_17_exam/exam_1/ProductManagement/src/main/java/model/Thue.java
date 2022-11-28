package model;

public class Thue {
    private int idThue;
    private String nameThue;
    private String phoneThue;
    private String dateThue;
    private int idThanhToan;
    private String noteThue;
    
    public Thue() {
    }

    public Thue(int idThue, String nameThue, String phoneThue, String dateThue, int idThanhToan, String noteThue) {
        this.idThue = idThue;
        this.nameThue = nameThue;
        this.phoneThue = phoneThue;
        this.dateThue = dateThue;
        this.idThanhToan = idThanhToan;
        this.noteThue = noteThue;
    }

    public Thue(String nameThue, String phoneThue, String dateThue, int idThanhToan, String noteThue) {
        this.nameThue = nameThue;
        this.phoneThue = phoneThue;
        this.dateThue = dateThue;
        this.idThanhToan = idThanhToan;
        this.noteThue = noteThue;
    }

    public int getIdThue() {
        return idThue;
    }

    public void setIdThue(int idThue) {
        this.idThue = idThue;
    }

    public String getNameThue() {
        return nameThue;
    }

    public void setNameThue(String nameThue) {
        this.nameThue = nameThue;
    }

    public String getPhoneThue() {
        return phoneThue;
    }

    public void setPhoneThue(String phoneThue) {
        this.phoneThue = phoneThue;
    }

    public String getDateThue() {
        return dateThue;
    }

    public void setDateThue(String dateThue) {
        this.dateThue = dateThue;
    }

    public int getIdThanhToan() {
        return idThanhToan;
    }

    public void setIdThanhToan(int idThanhToan) {
        this.idThanhToan = idThanhToan;
    }

    public String getNoteThue() {
        return noteThue;
    }

    public void setNoteThue(String noteThue) {
        this.noteThue = noteThue;
    }
}
