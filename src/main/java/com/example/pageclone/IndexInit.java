package com.example.pageclone;

import com.example.pageclone.domain.Item;
import com.example.pageclone.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class IndexInit {

    private final ItemRepository itemRepository;

    @PostConstruct
    public void mainCarouselInit() {
        Item item = new Item();
        item.setItemIdx(94l);
        item.setColor("블루");
        item.setRep(true);

        Item item2= new Item();
        item2.setItemIdx(95l);
        item2.setColor("블루");
        item2.setRep(true);

        Item item3 = new Item();
        item3.setItemIdx(96l);
        item3.setColor("네이비");
        item3.setRep(true);

        Item item4 = new Item();
        item4.setItemIdx(97l);
        item4.setColor("블랙 M size");
        item4.setRep(true);

        Item item5 = new Item();
        item5.setItemIdx(98l);
        item5.setColor("아이보리");
        item5.setRep(true);

        // weeklyBestItem-> mdPick1
        Item weeklyBestItem = new Item();
        weeklyBestItem.setItemIdx(99l);
        weeklyBestItem.setRep(true);
        weeklyBestItem.setFirstCategory("outer");
        weeklyBestItem.setSecondCategory("jacket");
        weeklyBestItem.setItemName("로예 나일론 바람막이 집업");
        weeklyBestItem.setPrice(27000);
        weeklyBestItem.setItemInfo("10컬러의 다양한 색감들과 가격대비 퀄리티 좋은 제품으로 간절기 시즌에 가볍고");
        weeklyBestItem.setImgUrl("/image/etc/main_weeklybest/md_pick1.jpg");
        itemRepository.save(item);
        itemRepository.save(item2);
        itemRepository.save(item3);
        itemRepository.save(item4);
        itemRepository.save(item5);

        itemRepository.save(weeklyBestItem);


    }

}
