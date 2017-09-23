package com.ticketnow.model;

import java.io.Serializable;

/**
 * Created by Rodrigo Costa on 23/09/2017.
 */

public class FriendModel implements Serializable {

    private int thumb;
    private String name;
    private String email;
    private String status;
    private String id;
    private String tickets;

    public FriendModel(int thumb, String email, String name, String id, String status, String tickets) {

        this.thumb = thumb;
        this.name = name;
        this.id = id;
        this.status = status;
        this.tickets = tickets;
        this.email = email;

    }



    public int getThumb() {
        return thumb;
    }
    public void setThumb(int thumb) {
        this.thumb = thumb;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getTickets() {
        return tickets;
    }
    public void setTickets(String tickets) {
        this.tickets = tickets;
    }

}
