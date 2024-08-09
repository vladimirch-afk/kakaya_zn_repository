package com.example.demo.data.model.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;


@Table("marks")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Mark {
    @Id
    private Integer id;
    @Column
    private Integer mark;
    @Column
    private Integer student_id;
    @Column
    private Integer assessment_id;
}
