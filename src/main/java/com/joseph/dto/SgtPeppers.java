package com.joseph.dto;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by jotaiwan on 28/05/2017.
 */
@Component
@Primary
public class SgtPeppers implements CompactDisc {

    private String song = "song";

    private String artist = "artist";

    public void play() {
        System.out.println("Play " + song + " by " + artist);
    }
}
