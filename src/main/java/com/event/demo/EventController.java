package com.event.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController("/api")
public class EventController {

    private final EventRepository eventRepository;

    public EventController(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @PostMapping("/events")
    public Event createEvent(@RequestBody Event event){
        return eventRepository.save(event);
    }

    @GetMapping("/events/{userId}")
    public Optional<Event> getSubscriber(@PathVariable("userId") Long userId,
                                         @RequestParam int page, int size){
        return eventRepository.findById(Math.toIntExact(userId));
    }
}
