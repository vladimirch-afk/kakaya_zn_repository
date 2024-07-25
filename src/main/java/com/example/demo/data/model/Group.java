package com.example.demo.data.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("groups")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Group {
    @Id
    private Integer id;
    @Column
    private String name;
    @Column
    private Integer course_id;
}
