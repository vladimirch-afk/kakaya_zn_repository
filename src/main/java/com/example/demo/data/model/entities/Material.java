package com.example.demo.data.model.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("materials")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Material {
    @Id
    private Integer id;
    @Column
    private String content;
    @Column
    private String topic;
    @Column
    private String file_name;
    @Column
    private String file_path;
    @Column
    private String course;
}
