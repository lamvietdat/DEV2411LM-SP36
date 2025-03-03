package com.example.devmaster.lab03.model;

public class Khoa {
    private Long makh;
    private String tenkh;

    public Khoa() {}

    public Khoa(Long makh, String tenkh) {
        this.makh = makh;
        this.tenkh = tenkh;
    }

    public Long getMakh() {
        return makh;
    }

    public void setMakh(Long makh) {
        this.makh = makh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }
}
