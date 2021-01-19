package org.hw14;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
public class WhatTimeIsItNow {

    @Scheduled(fixedDelay = 1000)
    public void getTime() {
        System.out.println(LocalTime.now().toString());
    }
}
