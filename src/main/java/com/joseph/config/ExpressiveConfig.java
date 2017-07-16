package com.joseph.config;

import com.joseph.dto.BlankDisc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * Created by jotaiwan on 15/07/2017.
 */
@Configuration
@PropertySource(value = { "classpath:app.properties" })
public class ExpressiveConfig {

    @Autowired
    private Environment environment;

    @Bean
    public BlankDisc disc() {
        return new BlankDisc(environment.getProperty("disc.title.default"),
                environment.getProperty("disc.artist.default"));
    }

    @Bean
    public BlankDisc anotherDisc() {
        BlankDisc disc = new BlankDisc();
        disc.setTitle(environment.getProperty("disc.title", "Rattle and Hum"));
        disc.setArtist(environment.getProperty("disc.artist", "U2"));
        return disc;
    }

    @Bean
    public BlankDisc containDisc() {
        if (environment.containsProperty("dis.title.contain")) {
            return new BlankDisc(environment.getProperty("dis.title.contain"),
                    environment.getProperty("disc.artist.contain"));
        } else {
            return disc();
        }
    }
}
