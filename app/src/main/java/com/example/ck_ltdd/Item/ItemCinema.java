package com.example.ck_ltdd.Item;

public class ItemCinema {
    private String nameCinema,Address;
    private int ImageCinema;

    public ItemCinema(String nameCinema, String address, int imageCinema) {
        this.nameCinema = nameCinema;
        Address = address;
        ImageCinema = imageCinema;
    }

    public String getNameCinema() {
        return nameCinema;
    }

    public void setNameCinema(String nameCinema) {
        this.nameCinema = nameCinema;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getImageCinema() {
        return ImageCinema;
    }

    public void setImageCinema(int imageCinema) {
        ImageCinema = imageCinema;
    }

    @Override
    public String toString() {
        return "ItemCinema{" +
                "nameCinema='" + nameCinema + '\'' +
                ", Address='" + Address + '\'' +
                ", ImageCinema=" + ImageCinema +
                '}';
    }
}
