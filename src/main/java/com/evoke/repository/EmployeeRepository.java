package com.evoke.repository;

import com.evoke.model.Employee;
import org.springframework.data.neo4j.repository.ReactiveNeo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import reactor.core.publisher.Mono;

public interface EmployeeRepository extends ReactiveNeo4jRepository<Employee, Long> {

    @Query("MATCH (p:Person) WHERE ID(p) = $id RETURN p")
    Mono<Employee> findById(Long id);
}
