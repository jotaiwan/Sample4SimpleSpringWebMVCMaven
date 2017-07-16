package com.joseph.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by jotaiwan on 15/07/2017.
 */
@Component
public class BlankDisc {
    private String title;
    private String artist;

    public BlankDisc() {

    }

//    public BlankDisc(String title, String artist) {
//        this.setTitle(title);
//        this.setArtist(artist);
//    }

    public BlankDisc(@Value("${disc.title.x}") String title,
                     @Value("${disc.artist.x}") String artist) {
        this.title = title;
        this.artist = artist;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
