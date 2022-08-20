package com.example.pageclone.repository;

import com.example.pageclone.dto.WeeklyBestDto;

import java.util.List;

public interface ItemRepositoryCustom {

    List<WeeklyBestDto> findWeeklyBestItem(String firstCategory, String secondCategory, boolean rep);
    List<WeeklyBestDto> findNewArrivalItem(String firstCategory, String secondCategory, boolean rep);
}
