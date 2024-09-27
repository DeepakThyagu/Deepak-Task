package com.event.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscription,Integer> {
}
