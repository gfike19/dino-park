package com.gfike.dinopark.data;

import com.gfike.dinopark.models.Dino;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface DinoDao extends CrudRepository<Dino, Integer> {

    Dino findById(int id);
}
