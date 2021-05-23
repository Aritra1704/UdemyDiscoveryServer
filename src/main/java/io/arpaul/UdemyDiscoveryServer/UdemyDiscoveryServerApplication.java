package io.arpaul.UdemyDiscoveryServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class UdemyDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UdemyDiscoveryServerApplication.class, args);
	}

}
