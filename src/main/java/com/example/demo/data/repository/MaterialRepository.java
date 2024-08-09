package com.example.demo.data.repository;

import com.example.demo.data.model.entities.Material;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MaterialRepository extends CrudRepository<Material, Integer> {
    List<Material> returnAllMaterials();
    Material findMaterialById(Integer id);
    List<Material> findMaterialsByCourse(Integer id);
    Material findMaterialByTitle(String title);
    Material findMaterialByFilePath(String file_path);
    Material findMaterialByFileName(String file_name);
}
