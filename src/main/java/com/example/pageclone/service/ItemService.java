package com.example.pageclone.service;

import com.example.pageclone.domain.Item;

import java.util.List;

public interface ItemService {

    Long saveItem(Item item);

    List<Item> getMainCarouselItemList();
}
