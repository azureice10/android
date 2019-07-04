package com.example.intent1;

import android.os.Parcel;
import android.os.Parcelable;

public class Mhs implements Parcelable {
    private String npm;
    private String nama;
    private String kelas;

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    private int umur;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.npm);
        dest.writeString(this.nama);
        dest.writeString(this.kelas);
        dest.writeInt(this.umur);
    }

    public Mhs() {
    }

    protected Mhs(Parcel in) {
        this.npm = in.readString();
        this.nama = in.readString();
        this.kelas = in.readString();
        this.umur = in.readInt();
    }

    public static final Parcelable.Creator<Mhs> CREATOR = new Parcelable.Creator<Mhs>() {
        @Override
        public Mhs createFromParcel(Parcel source) {
            return new Mhs(source);
        }

        @Override
        public Mhs[] newArray(int size) {
            return new Mhs[size];
        }
    };
}
