package com.gfike.dinopark.data;

import com.gfike.dinopark.models.Dino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;

import java.util.List;

public interface DinoRepository extends JpaRepository<Dino, Integer> {
    @Query(value = "CALL findLargeCarnivoreSafe()", nativeQuery = true)
    List<Dino> FindLargeCarnivoreSafe();

    @Query(value = "CALL findSmallCarnivoreSafe()", nativeQuery = true)
    List<Dino>  FindSmallCarnivoreSafe();

    @Query(value = "CALL sansTrex()", nativeQuery = true)
    List<Dino> SansTrex();

    @Query(value = "CALL findArmoredHerbivoreSafe()", nativeQuery = true)
    List<Dino> FindArmoredHerbivoreSafe();

    @Query(value = "CALL findSmallMediumHerbivoreSafe()", nativeQuery = true)
    List<Dino> FindSmallMediumHerbivoreSafe();
}
