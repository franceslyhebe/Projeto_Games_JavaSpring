package com.devsuperior.dslist.service;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameService {
    @Autowired
    private GameRepository gameRepository;
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }
}