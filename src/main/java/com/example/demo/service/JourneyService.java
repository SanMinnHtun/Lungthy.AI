package com.example.demo.service;

import org.springframework.stereotype.Service;
import java.time.Duration;
import java.time.Instant;

@Service
public class JourneyService{
    public String calculateTimeClean(Instant quitTime){
        if (quitTime== null) return "00:00:00";
        Duration duration = Duration.between(quitTime, Instant.now());

        long days = duration.toDays();
        long hours = duration.toHoursPart();
        long minutes = duration.toMinutesPart();
        long seconds = duration.toSecondsPart();

        return String.format("%dd %02dh %02dm %02ds", days, hours, minutes, seconds);
    }
}

