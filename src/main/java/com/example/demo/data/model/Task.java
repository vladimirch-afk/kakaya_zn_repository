package com.example.demo.data.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;


@Table("tasks")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Task {
    @Id
    private Integer id;
    @Column
    private String content;
    @Column
    private String subject;
    @Column
    private Boolean test_type;
}
