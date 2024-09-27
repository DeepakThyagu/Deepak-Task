package com.event.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController("/api")
public class SubscriptionController {

    private final SubscriptionRepository subscriptionRepository;

    public SubscriptionController(SubscriptionRepository subscriptionRepository) {
        this.subscriptionRepository = subscriptionRepository;
    }

    @PostMapping("/subscriptions")
    public Subscription eventSubscribe(@RequestBody Subscription subscription){
        return subscriptionRepository.save(subscription);
    }


}
