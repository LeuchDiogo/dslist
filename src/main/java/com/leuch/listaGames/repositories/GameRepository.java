package com.leuch.listaGames.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leuch.listaGames.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

	

}
