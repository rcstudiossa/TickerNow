package com.ticketnow.model;

import java.io.Serializable;


/**
 * Created by roquesouza on 27/08/17.
 */

public class PartyModel implements Serializable{

    private int thumb;
    private int friendThumb;
    private int banner;
    private String title;
    private String date;
    private String local;
    private String price;
    private String favNumber;

    public PartyModel(int thumb, String title, String date) {

        this.thumb = thumb;
        this.title = title;
        this.date = date;

    }

    public PartyModel(int thumb, int friendThumb, String title, String date) {

        this.thumb = thumb;
        this.friendThumb = friendThumb;
        this.title = title;
        this.date = date;

    }

    public PartyModel(String title, String local, String date) {
        this.title = title;
        this.local = local;
        this.date = date;
    }

    public PartyModel(int thumb, int banner, String title, String local, String date, String price, String favNumber) {

        this.thumb = thumb;
        this.title = title;
        this.local = local;
        this.date = date;
        this.price = price;
        this.favNumber = favNumber;
        this.banner = banner;

    }

    public int getThumb() {
        return thumb;
    }
    public void setThumb(int thumb) {
        this.thumb = thumb;
    }

    public int getFriendThumb() {
        return friendThumb;
    }
    public void setFriendThumb(int friendThumb) {
        this.friendThumb = friendThumb;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }

    public String getFavNumber() {
        return favNumber;
    }
    public void setFavNumber(String favNumber) {
        this.favNumber = favNumber;
    }

    public int getBanner() {
        return banner;
    }
    public void setBanner(int banner) {
        this.banner = banner;
    }

}
