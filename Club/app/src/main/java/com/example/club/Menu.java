package com.example.club;

public class Menu {

    private String nama;
    private String des;
    private String img;
    private String ket;

    public Menu(String datanama, String datades, String datagambar, String dataket){
        nama=datanama;
        des=datades;
        img=datagambar;
        ket=dataket;
    }

    public String getNama() {
        return nama;
    }

    public String getDes() {
        return des;
    }

    public String getImg() {
        return img;
    }

    public String getKet() {
        return ket;
    }
}
