package com.gfike.dinopark.data;

import com.gfike.dinopark.models.Dino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DinoRepository extends JpaRepository<Dino, Integer> {

    @Query(nativeQuery = true,value = "call FindLargeCarnivoreSafe")
    List<Dino> FindLargeCarnivoreSafe();

    @Query(nativeQuery = true,value = "call FindSmallCarnivoreSafe")
    List<Dino>  FindSmallCarnivoreSafe();

    @Query(nativeQuery = true,value = "call SansTrex")
    List<Dino> SansTrex();

    @Query(nativeQuery = true, value="call FindArmoredHerbivoreSafe")
    List<Dino> FindArmoredHerbivoreSafe();

    @Query(nativeQuery = true, value="call FindSmallMediumHerbivoreSafe")
    List<Dino> FindSmallMediumHerbivoreSafe();
}
