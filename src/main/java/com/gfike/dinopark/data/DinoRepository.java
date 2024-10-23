package com.gfike.dinopark.data;

import com.gfike.dinopark.models.Dino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;

import java.util.List;

public interface DinoRepository extends JpaRepository<Dino, Integer> {

    @Procedure(name = "Dino.FindLargeCarnivoreSafe")
    List<Dino> FindLargeCarnivoreSafe();

    @Procedure(name = "Dino.FindSmallCarnivoreSafe")
    List<Dino>  FindSmallCarnivoreSafe();

    @Procedure(name = "Dino.SansTrex")
    List<Dino> SansTrex();

    @Procedure(name = "Dino.FindArmoredHerbivoreSafe")
    List<Dino> FindArmoredHerbivoreSafe();

    @Procedure(name = "Dino.FindSmallMediumHerbivoreSafe")
    List<Dino> FindSmallMediumHerbivoreSafe();
}
