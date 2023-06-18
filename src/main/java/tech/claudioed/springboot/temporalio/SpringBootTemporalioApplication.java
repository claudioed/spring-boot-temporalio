package tech.claudioed.springboot.temporalio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootTemporalioApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTemporalioApplication.class, args).start();
	}

}
