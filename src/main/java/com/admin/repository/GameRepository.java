package com.admin.repository;

import com.transport.entitiy.Games;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends CrudRepository<Games, Long> {

}
