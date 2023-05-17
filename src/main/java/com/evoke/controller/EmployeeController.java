package com.evoke.controller;

import com.evoke.model.Employee;
import com.evoke.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Objects;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;

    @GetMapping
    public Flux<Employee> getAllPersons() {
        return repository.findAll();
    }

    @PostMapping
    public Mono<Employee> save(@RequestBody Employee employee) {
        return repository.save(employee);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        final Mono<Employee> byId = repository.findById(id);
        repository.delete(Objects.requireNonNull(byId.block()));
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public Mono<Employee> getPersonById(@PathVariable("id") Long id) {
        return repository.findById(id);
    }
}
