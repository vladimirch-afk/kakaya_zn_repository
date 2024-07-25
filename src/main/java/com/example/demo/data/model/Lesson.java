package com.example.demo.data.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Table("lessons")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Lesson {
    @Id
    private Integer id;
    @Column
    private String content;
    @Column
    private Integer group_id;
    @Column
    private LocalDateTime date;
    @Column
    private LocalDateTime deadline;
}
