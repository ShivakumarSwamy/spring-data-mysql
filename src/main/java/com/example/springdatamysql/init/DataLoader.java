package com.example.springdatamysql.init;

import java.time.Instant;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.example.springdatamysql.domain.Aircraft;
import com.example.springdatamysql.repository.AircraftRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class DataLoader {

    private final AircraftRepository aircraftRepository;

    @PostConstruct
    private void loadData() {
        aircraftRepository.deleteAll();

        aircraftRepository.save(
                new Aircraft(81L, "AAL608", "1451", "N754UW", "AA608", "IND-PHX",
                             "A319", "A3", 36000, 255, 423, 0,
                             36000, 39.150284, -90.684795,
                             1012.8, 26.575562, 295.501994, true,
                             false, Instant.now(), Instant.now(), Instant.now())
        );
    }
}
