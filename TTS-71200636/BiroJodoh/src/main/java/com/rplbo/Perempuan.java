package com.rplbo;

public class Perempuan {
    private String nama;
    private int usia;
    private String status;
    private Double jumlahCinta;
    private Pria jodoh;
    private Pria temanKencan;
    private Double standarJumlahCinta;

    public void MengajakKencan(Pria pria) {
        this.jumlahCinta += 0.5;
        pria.setJumlahCinta(temanKencan.getJumlahCinta() + 0.5);
    }

    public Perempuan(String nama, int usia, Double standarJumlahCinta) {
        this.nama = nama;
        this.usia = usia;
        this.standarJumlahCinta = standarJumlahCinta;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUsia() {
        return this.usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getJumlahCinta() {
        return this.jumlahCinta;
    }

    public void setJumlahCinta(Double jumlahCinta) {
        this.jumlahCinta = jumlahCinta;
    }

    public Pria getJodoh() {
        return this.jodoh;
    }

    public void setJodoh(Pria jodoh) {
        this.jodoh = jodoh;
    }

    public Pria getTemanKencan() {
        return this.temanKencan;
    }

    public void setTemanKencan(Pria temanKencan) {
        this.temanKencan = temanKencan;
    }

    public Double getStandarJumlahCinta() {
        return this.standarJumlahCinta;
    }

    public void setStandarJumlahCinta(Double standarJumlahCinta) {
        this.standarJumlahCinta = standarJumlahCinta;
    }
}