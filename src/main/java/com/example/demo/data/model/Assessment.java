package com.example.demo.data.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("assessments")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Assessment {
    @Id
    private Integer id;
    @Column
    private Integer student_id;
    @Column
    private Integer lesson_id;
    @Column
    private String content;
    @Column
    private Boolean checked;
    @Column
    private Boolean test_type;
    @Column
    private Integer course_id;
}
