package com.vsvdev.asyncspring;

import com.vsvdev.asyncspring.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AsyncspringApplication  implements CommandLineRunner {
@Autowired
private AsyncService asyncService;

	public static void main(String[] args) {
		SpringApplication.run(AsyncspringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		asyncService.doAsync();
		asyncService.doAsync();
		asyncService.doAsync();
	}
}
