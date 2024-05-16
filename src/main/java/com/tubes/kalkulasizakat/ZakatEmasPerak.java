package com.tubes.kalkulasizakat;
import java.util.Date;

class ZakatEmasPerak extends Zakat{
    private static final double nisabPerTahun = 82000000;
    private double jumlahEmas_Gram;
    private double jumlahPerak_Gram;

    public ZakatEmasPerak(String nama, Date tanggal, double jumlahEmas_Gram, double jumlahPerak_Gram) {
        super(nama,tanggal);
        this.jumlahEmas_Gram = jumlahEmas_Gram;
        this.jumlahPerak_Gram = jumlahPerak_Gram;
    }

    public double getJumlahEmas_Gram() {
        return jumlahEmas_Gram;
    }

    public void setJumlahEmas_Gram(double jumlahEmas_Gram) {
        this.jumlahEmas_Gram = jumlahEmas_Gram;
    }

    public double getJumlahPerak_Gram() {
        return jumlahPerak_Gram;
    }

    public void setJumlahPerak_Gram(double jumlahPerak_Gram) {
        this.jumlahPerak_Gram = jumlahPerak_Gram;
    }

    @Override
    public int hitungZakat(){
        double totalNilaiEmasPerak = (jumlahEmas_Gram * 1300000) + (jumlahPerak_Gram * 140000);
        if (totalNilaiEmasPerak > nisabPerTahun) {
            return (int) (0.025 * totalNilaiEmasPerak);
        } else {
            return 0;
        }
    }
}
