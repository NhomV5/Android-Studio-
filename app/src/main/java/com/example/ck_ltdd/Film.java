package com.example.ck_ltdd;

public class Film {

    private String tenPhim;
    private String theLoai;
    private int anh;

    public Film(String tenPhim, String theLoai, int anh)
    {
        this.tenPhim = tenPhim;
        this.theLoai = theLoai;
        this.anh = anh;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public int getAnh() {
        return anh;
    }

    public void setAnh(int anh) {
        this.anh = anh;
    }
}
