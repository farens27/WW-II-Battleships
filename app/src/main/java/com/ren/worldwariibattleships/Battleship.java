package com.ren.worldwariibattleships;

import android.os.Parcel;
import android.os.Parcelable;

public class Battleship implements Parcelable {
    private String nama_battleship;
    private String detail_battleship;
    private int picture_battleship;

    public Battleship() {

    }

    Battleship(Parcel in) {
        nama_battleship = in.readString();
        detail_battleship = in.readString();
        picture_battleship = in.readInt();
    }

    public static final Creator<Battleship> CREATOR = new Creator<Battleship>() {
        @Override
        public Battleship createFromParcel(Parcel in) {
            return new Battleship(in);
        }

        @Override
        public Battleship[] newArray(int size) {
            return new Battleship[size];
        }
    };


    public String getNama_battleship() {
        return nama_battleship;
    }

    public void setNama_battleship(String nama_battleship) {
        this.nama_battleship = nama_battleship;
    }

    public String getDetail_battleship() {
        return detail_battleship;
    }

    public void setDetail_battleship(String detail_battleship) {
        this.detail_battleship = detail_battleship;
    }

    public int getPicture_battleship() {
        return picture_battleship;
    }

    public void setPicture_battleship(int picture_battleship) {
        this.picture_battleship = picture_battleship;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nama_battleship);
        dest.writeString(detail_battleship);
        dest.writeInt(picture_battleship);
    }
}
