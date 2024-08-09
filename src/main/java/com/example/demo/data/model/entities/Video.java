package com.example.demo.data.model.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("videos")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Video {
    @Id
    private Integer id;
    @Column
    private String URL;
    @Column
    private String title;
    @Column
    private String topic;
    @Column
    private String course;
}
