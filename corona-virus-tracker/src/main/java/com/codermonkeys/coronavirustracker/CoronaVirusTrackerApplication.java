package com.codermonkeys.coronavirustracker;

import com.codermonkeys.coronavirustracker.services.CoronaVirusDataService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CoronaVirusTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoronaVirusTrackerApplication.class, args);
		CoronaVirusDataService coronaVirusDataService = new CoronaVirusDataService();
		coronaVirusDataService.start();
	}

}
