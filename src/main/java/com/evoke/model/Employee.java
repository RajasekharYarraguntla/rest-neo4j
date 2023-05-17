package com.evoke.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String designation;
}
