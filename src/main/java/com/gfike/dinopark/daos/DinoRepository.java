package com.gfike.dinopark.daos;

import com.gfike.dinopark.models.Dino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DinoRepository extends JpaRepository<Dino, Integer> {

    @Query(nativeQuery = true,value = "call FindLargeCarnivoreSafe")
    List<Dino> FindLargeCarnivoreSafe();
}
