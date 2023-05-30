package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {
    @GetMapping
    public String displayAllEvents(Model model){
        List<String> events = new ArrayList<>();
        events.add("Code Til Dawn");
        events.add("Code With Pride");
        events.add("Emo Night");
        events.add("FLower Bar");
        model.addAttribute("events", events);
        return "events/index"; //need to refer to directory that template is in when calling it
    }
}
