package com.example.tonghop;

public class Baihat {
    private String Ten;
    private String Mota;
    private String Noidung;
    private String Nhacsi;
    private String Ngay;
    private int Hinh;

    public Baihat(String ten, String mota, String noidung, String nhacsi, String ngay, int hinh){
        Ten = ten ;
        Mota =mota;
        Noidung = noidung;
        Hinh = hinh ;
        Nhacsi = nhacsi;
        Ngay = ngay;
    }

    public String getTen() {
        return Ten;
    }
    public void setTen(String ten) {
        Ten = ten;
    }

    public String getMota() {
        return Mota;
    }
    public void setMota(String mota) {
        Mota = mota;
    }

    public String getNhacsi() {
        return Nhacsi;
    }
    public void setNhacsi(String nhacsi) {
        Mota = nhacsi;
    }

    public String getNgay() {
        return Ngay;
    }
    public void setNgay(String ngay) {
        Mota = ngay;
    }

    public String getNoidung() {
        return Noidung;
    }
    public void setNoidung(String noidung) {Noidung = noidung;}

    public int getHinh() {
        return Hinh;
    }
    public void setHinh(int hinh) {
        Hinh = hinh;
    }

}

