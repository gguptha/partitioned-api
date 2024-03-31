package io.cloudledger.aperture;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class ApertureArenaApplication {

    public static void main(String[] args) {

        SpringApplication.run(ApertureArenaApplication.class, args);

    }
}