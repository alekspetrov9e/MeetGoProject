
package com.example.controller;

import com.example.model.Event;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EventController {

    @GetMapping("/events")
    public List<Event> getEvents() {
        return Arrays.asList(
            new Event("Concert Night", "An amazing night with live music.", "2024-12-15"),
            new Event("Art Exhibition", "Explore local artists' work.", "2024-12-20"),
            new Event("Tech Meetup", "Network with tech enthusiasts.", "2024-12-25")
        );
    }
}
