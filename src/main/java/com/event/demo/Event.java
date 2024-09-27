package com.event.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.security.Timestamp;

@Data
@Entity
public class Event {

    @Id
    @GeneratedValue
     private Integer id;
     private String type;
     private Timestamp time;


}
