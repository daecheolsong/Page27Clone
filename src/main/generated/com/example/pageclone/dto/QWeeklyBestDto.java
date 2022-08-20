package com.example.pageclone.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.example.pageclone.dto.QWeeklyBestDto is a Querydsl Projection type for WeeklyBestDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QWeeklyBestDto extends ConstructorExpression<WeeklyBestDto> {

    private static final long serialVersionUID = -1866459782L;

    public QWeeklyBestDto(com.querydsl.core.types.Expression<Long> itemIdx, com.querydsl.core.types.Expression<String> itemName, com.querydsl.core.types.Expression<Integer> price, com.querydsl.core.types.Expression<String> itemInfo, com.querydsl.core.types.Expression<String> imgUrl) {
        super(WeeklyBestDto.class, new Class<?>[]{long.class, String.class, int.class, String.class, String.class}, itemIdx, itemName, price, itemInfo, imgUrl);
    }

    public QWeeklyBestDto(com.querydsl.core.types.Expression<Long> itemIdx, com.querydsl.core.types.Expression<String> itemName, com.querydsl.core.types.Expression<Integer> price, com.querydsl.core.types.Expression<String> imgUrl) {
        super(WeeklyBestDto.class, new Class<?>[]{long.class, String.class, int.class, String.class}, itemIdx, itemName, price, imgUrl);
    }

}

