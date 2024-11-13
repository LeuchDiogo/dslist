package com.leuch.listaGames.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leuch.listaGames.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

	

}
