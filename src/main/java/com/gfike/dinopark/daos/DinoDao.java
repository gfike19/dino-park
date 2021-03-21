package com.gfike.dinopark.daos;

import com.gfike.dinopark.models.Dino;
import org.aspectj.weaver.reflect.InternalUseOnlyPointcutParser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface DinoDao extends CrudRepository<Dino, InternalUseOnlyPointcutParser> {
}
