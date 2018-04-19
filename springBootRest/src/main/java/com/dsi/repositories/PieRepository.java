package com.dsi.repositories;

import com.dsi.models.Pie;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PieRepository extends CrudRepository<Pie, Long> {
    List<Pie> findByName(String name);
}