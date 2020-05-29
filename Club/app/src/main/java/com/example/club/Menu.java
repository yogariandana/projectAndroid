package com.example.club;

public class Menu {

    private String nama;
    private String des;
    private String img;

    public Menu(String datanama, String datades, String datagambar){
        nama=datanama;
        des=datades;
        img=datagambar;
    }

    public String getNama() {
        return nama;
    }

    public String getDes() {
        return des;
    }

    public String getGambar() {
        return img;
    }
}
