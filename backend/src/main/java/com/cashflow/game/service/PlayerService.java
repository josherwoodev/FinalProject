package com.cashflow.game.service;

import com.cashflow.game.constant.Errors;
import com.cashflow.game.entity.Player;
import com.cashflow.game.repo.PlayerRepository;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }


    public Player updatePlayer(Player player) {
        playerRepository.findById(player.getId()).orElseThrow(Errors.ResourceNotFoundException::new);
        return playerRepository.save(player);
    }
}
