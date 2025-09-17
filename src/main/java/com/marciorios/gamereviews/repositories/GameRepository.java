package com.marciorios.gamereviews.repositories;

import com.marciorios.gamereviews.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
