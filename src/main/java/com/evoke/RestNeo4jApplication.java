package com.evoke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.repository.config.EnableReactiveNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableReactiveNeo4jRepositories
@EnableTransactionManagement
public class RestNeo4jApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestNeo4jApplication.class, args);
	}

}
