package br.senai.gamesapp.reposity;

import org.springframework.data.jpa.repository.JpaRepository;

import br.senai.gamesapp.model.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
