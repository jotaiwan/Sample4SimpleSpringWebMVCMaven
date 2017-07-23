package com.joseph.controller;

import com.joseph.aspect.Audience;
import com.joseph.aspect.TrackCounter;
import com.joseph.dto.BlankDisc;
import com.joseph.dto.CompactDisc;
import com.joseph.dto.SgtPeppers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by jotaiwan on 15/07/2017.
 */
@Controller
@RequestMapping(value="/sound")
public class SoundController {

    private static final Logger logger = LoggerFactory.getLogger(SoundController.class);

    @Autowired
    CompactDisc sgtPeppers;

    @Autowired
    TrackCounter counter;

    @RequestMapping(value="/player")
    public String play(Model model) {
        model.addAttribute("compactDisc", sgtPeppers);

        logger.info("Compact disc: " + sgtPeppers);

        List<String> tracks = ((BlankDisc) sgtPeppers).getTracks();
        int count = 1;
        for (String track : tracks) {
            counter.countTrack(count);
            count++;
        }

        return "player";
    }

}
