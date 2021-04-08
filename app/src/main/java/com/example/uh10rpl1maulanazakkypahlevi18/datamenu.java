package com.example.uh10rpl1maulanazakkypahlevi18;

public class datamenu {
    private String namalengkap, umur, hobi, waifu;


    public datamenu(String namalengkap, String umur, String hobi, String waifu) {
        this.namalengkap = getNamalengkap();
        this.umur = getUmur();
        this.hobi = getHobi();
        this.waifu = getWaifu();

    }

    public String getNamalengkap() {
        return namalengkap;
    }

    public void setNamalengkap(String namalengkap) { this.namalengkap = namalengkap; }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) { this.umur = umur; }

    public String getHobi() { return hobi; }

    public void setHobi(String hobi) {
        this.hobi = hobi;
    }

    public String getWaifu() {return waifu;}

    public void setWaifu(String waifu) { this.waifu = waifu; }
}
