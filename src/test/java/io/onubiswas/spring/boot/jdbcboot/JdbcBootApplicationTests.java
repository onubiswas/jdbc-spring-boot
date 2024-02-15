package io.onubiswas.spring.boot.jdbcboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class JdbcBootApplicationTests {

	final String sql = "SELECT count(*) FROM T_ACCOUNT";
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Test
	public void testNumberOfAccount() {
		long count = jdbcTemplate.queryForObject(sql, Long.class);
		assertThat(count).isEqualTo(21L);
	}

}
