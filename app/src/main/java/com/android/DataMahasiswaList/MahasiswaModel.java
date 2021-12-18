package com.android.DataMahasiswaList;

public class MahasiswaModel {

    private String nama;
    private String nim;
    private String email;
    private String fakultas;
    private String prodi;
    private String semesterTerdaftar;
    private String status;
    private String foto;

    public MahasiswaModel(String nama, String nim, String email, String foto) {
        this.nama       = nama;
        this.nim        = nim;
        this.email      = email;
        this.fakultas   = "Fakultas Ilmu Komputer dan Teknologi Informasi";
        this.prodi      = "Teknologi Informasi";
        this.semesterTerdaftar = "1";
        this.status     = "aktif";
        this.foto       = foto;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getFakultas() {
        return fakultas;
    }
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getProdi() {
        return prodi;
    }
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getSemesterTerdaftar() {
        return semesterTerdaftar;
    }
    public void setSemesterTerdaftar(String semesterTerdaftar) {
        this.semesterTerdaftar = semesterTerdaftar;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getFoto() {
        return foto;
    }
    public void setFoto(String foto) {
        this.foto = foto;
    }
}



