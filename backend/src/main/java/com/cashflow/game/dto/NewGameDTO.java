package com.cashflow.game.dto;

import com.cashflow.game.entity.GameSetting;

import java.util.List;

public record NewGameDTO(List<Long> profileIds, GameSetting gameSetting) {
}
