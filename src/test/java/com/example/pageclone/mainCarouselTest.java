package com.example.pageclone;

import com.example.pageclone.domain.Item;
import com.example.pageclone.dto.WeeklyBestDto;
import com.example.pageclone.repository.ItemRepository;
import com.example.pageclone.service.ItemServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class mainCarouselTest {

    @Autowired
    ItemRepository itemRepository;
    @Autowired
    ItemServiceImpl itemService;

    @Test
    public void findMainCarouselItem() {
        List<Item> mainCarouselItemList = itemService.getMainCarouselItemList();
        for (Item item : mainCarouselItemList) {
            System.out.println(item);
        }
        Assertions.assertThat(mainCarouselItemList.size()).isEqualTo(5);

    }

    @Test
    public void findWeeklyBestOuter() {
        List<WeeklyBestDto> outerWeeklyBestItem = itemService.getOuterWeeklyBestItem();

        Assertions.assertThat(outerWeeklyBestItem.get(0).getPrice()).isEqualTo(27000);
    }
}
