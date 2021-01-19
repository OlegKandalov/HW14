package org.hw14;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        WhatTimeIsItNow wtii = context.getBean(WhatTimeIsItNow.class);
        wtii.getTime();
    }



}
