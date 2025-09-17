package com.marciorios.gamereviews.services;

import com.marciorios.gamereviews.dto.GameMinDTO;
import com.marciorios.gamereviews.entities.Game;
import com.marciorios.gamereviews.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
