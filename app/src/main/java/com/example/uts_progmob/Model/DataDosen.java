package com.example.uts_progmob.Model;

public class DataDosen {
    /*@SerializedName("id")*/
    public String foto;
    public String nidn;
    public String nama;
    public String gelar;
    public String alamat;
    public String email;

    public DataDosen(String nidn, String gelar, String alamat, String email, String foto, String nama) {
        this.nidn = nidn;
        this.gelar = gelar;
        this.alamat = alamat;
        this.email = email;
        this.foto = foto;
        this.nama = nama;
    }

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getGelar() {
        return gelar;
    }

    public void setGelar(String gelar) {
        this.gelar = gelar;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        alamat = alamat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        email = email;
    }
}
