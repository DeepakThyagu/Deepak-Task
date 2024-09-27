package com.event.demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EventControllerTest {

    @BeforeEach
    void setUp() {
        System.out.println("test controller events");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void createEvent() {
        Assertions.assertEquals("save(event)","event");
    }

    @Test
    void getSubscriber() {
    }
}