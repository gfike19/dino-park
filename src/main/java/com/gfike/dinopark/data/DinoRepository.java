package com.gfike.dinopark.data;

import com.gfike.dinopark.models.Dino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;

import java.util.List;

public interface DinoRepository extends JpaRepository<Dino, Integer> {

    @Procedure(name = "findLargeCarnivoreSafe")
    List<Dino> FindLargeCarnivoreSafe();

    @Procedure(name = "findSmallCarnivoreSafe")
    List<Dino>  FindSmallCarnivoreSafe();

    @Procedure(name = "sansTrex")
    List<Dino> SansTrex();

//    @Procedure(name = "Dino.findArmoredHerbivoreSafe")
//@Query(value = "CALL findArmoredHerbivoreSafe()", nativeQuery = true)
//@Procedure(name = "FindArmoredHerbivoreSafe")
//@Procedure(name = "FindArmoredHerbivoreSafe()")
//    @Procedure(name = "findArmoredHerbivoreSafe()")
//    @Procedure(name = "Dino.FindArmoredHerbivoreSafe()")
//@Procedure(name = "findArmoredHerbivoreSafe")
@Query(value = "CALL findArmoredHerbivoreSafe()", nativeQuery = true)
    List<Dino> FindArmoredHerbivoreSafe();

    @Procedure(name = "Dino.findSmallMediumHerbivoreSafe")
    List<Dino> FindSmallMediumHerbivoreSafe();
}
