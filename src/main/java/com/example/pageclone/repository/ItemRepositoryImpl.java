package com.example.pageclone.repository;

import com.example.pageclone.domain.QItem;
import com.example.pageclone.dto.QWeeklyBestDto;
import com.example.pageclone.dto.WeeklyBestDto;
import com.querydsl.core.QueryResults;
import com.querydsl.jpa.impl.JPAQueryFactory;

import javax.persistence.EntityManager;
import java.util.List;


public class ItemRepositoryImpl implements ItemRepositoryCustom {

    private final JPAQueryFactory queryFactory;

    public ItemRepositoryImpl(EntityManager entityManager) {
        this.queryFactory = new JPAQueryFactory(entityManager);
    }

    @Override
    public List<WeeklyBestDto> findWeeklyBestItem(String firstCategory, String secondCategory, boolean rep) {
        QueryResults<WeeklyBestDto> results = queryFactory
                .selectDistinct(new QWeeklyBestDto(
                        QItem.item.itemIdx,
                        QItem.item.itemName,
                        QItem.item.price,
                        QItem.item.itemInfo,
                        QItem.item.imgUrl
                ))
                .from(QItem.item)
                .where(QItem.item.rep.eq(true),
                        QItem.item.firstCategory.eq(firstCategory),
                        QItem.item.secondCategory.eq(secondCategory))
                .limit(9l)
                .fetchResults();

        List<WeeklyBestDto> content = results.getResults();

        return content;
    }
}
