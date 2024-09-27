package com.event.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Subscription {

    @Id
    @GeneratedValue
    private Integer id;
    private Long userId;
    private String EventType;
}
