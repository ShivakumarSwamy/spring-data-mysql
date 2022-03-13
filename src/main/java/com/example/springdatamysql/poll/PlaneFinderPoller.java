package com.example.springdatamysql.poll;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.springdatamysql.domain.Aircraft;
import com.example.springdatamysql.repository.AircraftRepository;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Component
@EnableScheduling
@RequiredArgsConstructor
public class PlaneFinderPoller {

    @NonNull
    private final AircraftRepository aircraftRepository;
    private final WebClient webClient = WebClient.create("http://localhost:7634/aircraft");

    @Scheduled(fixedRate = 5000)
    private void pollPlanes() {
//        aircraftRepository.deleteAll();

//        webClient.get()
//                 .retrieve()
//                 .bodyToFlux(Aircraft.class)
//                 .filter(aircraft -> !aircraft.getReg().isEmpty())
//                 .toStream()
//                 .forEach(aircraftRepository::save);

        aircraftRepository.findAll().forEach(System.out::println);
    }
}
