package com.example.pageclone.repository;

import com.example.pageclone.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {

    Item findByItemIdxAndColorAndRep(Long itemIdx, String color, boolean rep);
}
