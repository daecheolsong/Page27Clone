package com.example.pageclone.service;

import com.example.pageclone.domain.Item;
import com.example.pageclone.dto.WeeklyBestDto;
import com.example.pageclone.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService{

    private final ItemRepository itemRepository;

    @Transactional
    @Override
    public Long saveItem(Item item)
    {
        Item savedItem = itemRepository.save(item);
        return savedItem.getId();
    }

    @Override
    public List<Item> getMainCarouselItemList() {
        List<Item> mainCarouselList = new ArrayList<>();

        Item first = itemRepository.findByItemIdxAndColorAndRep(94l, "블루", true);
        Item second = itemRepository.findByItemIdxAndColorAndRep(95l, "블루", true);
        Item third = itemRepository.findByItemIdxAndColorAndRep(96l, "네이비", true);
        Item fourth = itemRepository.findByItemIdxAndColorAndRep(97l, "블랙 M size", true);
        Item fifth = itemRepository.findByItemIdxAndColorAndRep(98l, "아이보리", true);

        mainCarouselList.add(first);
        mainCarouselList.add(second);
        mainCarouselList.add(third);
        mainCarouselList.add(fourth);
        mainCarouselList.add(fifth);

        return mainCarouselList;
    }

    // main carousel weekly best item

    public List<WeeklyBestDto> getOuterWeeklyBestItem() {

        return itemRepository.findWeeklyBestItem("outer", "jacket", true);
    }

    public List<WeeklyBestDto> getSleeveWeeklyBestItem() {

        return itemRepository.findWeeklyBestItem("top", "sleeve", true);
    }

    public List<WeeklyBestDto> getShirtsWeeklyBestItem() {
        return itemRepository.findWeeklyBestItem("shirts", "basic", true);

    }

    public List<WeeklyBestDto> getShoesWeeklyBestItem() {
        return itemRepository.findWeeklyBestItem("shoes", "shoes", true);
    }

    public List<WeeklyBestDto> getTopKnitWeeklyBestItem() {
        return itemRepository.findWeeklyBestItem("top", "knit", true);
    }

    public List<WeeklyBestDto> getBottomWeeklyBestItem() {
        return itemRepository.findWeeklyBestItem("bottom", "cotton", true);
    }

    public List<WeeklyBestDto> getNewArrivalItem() {
        List<WeeklyBestDto> newArrivalList = itemRepository.findNewArrivalItem("outer", "jacket", true);

        for (int i = 0; i < newArrivalList.size(); i++) {
            newArrivalList.get(i).setMileage(newArrivalList.get(i).getPrice() / 100);
        }

        return newArrivalList;
    }
}
