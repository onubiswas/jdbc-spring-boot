package io.onubiswas.spring.boot.jdbcboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class JdbcBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdbcBootApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(JdbcTemplate jdbcTemplate) {
		String sql = "SELECT count(*) FROM T_ACCOUNT";
		return args -> System.out.println("Hello, there are "
						+ jdbcTemplate.queryForObject(sql, Long.class)
						+ " accounts");
	}

}
