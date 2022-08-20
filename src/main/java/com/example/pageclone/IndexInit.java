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

        // weeklyBestItem outer -> mdPick1
        Item weeklyBestOuterItem = new Item();
        weeklyBestOuterItem.setItemIdx(99l);
        weeklyBestOuterItem.setRep(true);
        weeklyBestOuterItem.setFirstCategory("outer");
        weeklyBestOuterItem.setSecondCategory("jacket");
        weeklyBestOuterItem.setItemName("로예 나일론 바람막이 집업");
        weeklyBestOuterItem.setPrice(27000);
        weeklyBestOuterItem.setItemInfo("weekly best outer item");
        weeklyBestOuterItem.setImgUrl("/image/etc/main_weeklybest/md_pick1.jpg");

        // weeklyBestItem top -> mdpick2
        Item weeklyBestSleeveItem = new Item();
        weeklyBestSleeveItem.setItemIdx(100l);
        weeklyBestSleeveItem.setRep(true);
        weeklyBestSleeveItem.setFirstCategory("top");
        weeklyBestSleeveItem.setSecondCategory("sleeve");
        weeklyBestSleeveItem.setItemName("드라이빙 오버핏 반팔티");
        weeklyBestSleeveItem.setPrice(30000);
        weeklyBestSleeveItem.setItemInfo("weekly best sleeve item");
        weeklyBestSleeveItem.setImgUrl("/image/etc/main_weeklybest/md_pick2.jpg");

        // weeklyBestItem Shirt -> mdpick3
        Item weeklyBestShirtItem = new Item();
        weeklyBestShirtItem.setItemIdx(101l);
        weeklyBestShirtItem.setRep(true);
        weeklyBestShirtItem.setFirstCategory("shirts");
        weeklyBestShirtItem.setSecondCategory("basic");
        weeklyBestShirtItem.setItemName("드라이빙 오버핏 반팔티");
        weeklyBestShirtItem.setPrice(30000);
        weeklyBestShirtItem.setItemInfo("weekly best shirt item");
        weeklyBestShirtItem.setImgUrl("/image/etc/main_weeklybest/md_pick2.jpg");

        // weeklyBestItem knit -> mdpick4
        Item weeklyBestKnitItem = new Item();
        weeklyBestKnitItem.setItemIdx(102l);
        weeklyBestKnitItem.setRep(true);
        weeklyBestKnitItem.setFirstCategory("top");
        weeklyBestKnitItem.setSecondCategory("knit");
        weeklyBestKnitItem.setItemName("드라이빙 오버핏 반팔티");
        weeklyBestKnitItem.setPrice(30000);
        weeklyBestKnitItem.setItemInfo("weekly best knit item");
        weeklyBestKnitItem.setImgUrl("/image/etc/main_weeklybest/md_pick2.jpg");

        // weeklyBestItem bottom -> mdpick5
        Item weeklyBestBottomItem = new Item();
        weeklyBestBottomItem.setItemIdx(103l);
        weeklyBestBottomItem.setRep(true);
        weeklyBestBottomItem.setFirstCategory("bottom");
        weeklyBestBottomItem.setSecondCategory("cotton");
        weeklyBestBottomItem.setItemName("드라이빙 오버핏 반팔티");
        weeklyBestBottomItem.setPrice(30000);
        weeklyBestBottomItem.setItemInfo("weekly best bottom item");
        weeklyBestBottomItem.setImgUrl("/image/etc/main_weeklybest/md_pick2.jpg");

        // weeklyBestItem knit -> mdpick6
        Item weeklyBestShoesItem = new Item();
        weeklyBestShoesItem.setItemIdx(104l);
        weeklyBestShoesItem.setRep(true);
        weeklyBestShoesItem.setFirstCategory("shoes");
        weeklyBestShoesItem.setSecondCategory("shoes");
        weeklyBestShoesItem.setItemName("드라이빙 오버핏 반팔티");
        weeklyBestShoesItem.setPrice(30000);
        weeklyBestShoesItem.setItemInfo("weekly best shoes item");
        weeklyBestShoesItem.setImgUrl("/image/etc/main_weeklybest/md_pick2.jpg");
        itemRepository.save(item);
        itemRepository.save(item2);
        itemRepository.save(item3);
        itemRepository.save(item4);
        itemRepository.save(item5);

        itemRepository.save(weeklyBestOuterItem);
        itemRepository.save(weeklyBestSleeveItem);
        itemRepository.save(weeklyBestKnitItem);
        itemRepository.save(weeklyBestBottomItem);
        itemRepository.save(weeklyBestShirtItem);
        itemRepository.save(weeklyBestShoesItem);



    }

}
