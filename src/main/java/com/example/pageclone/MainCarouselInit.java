package com.example.pageclone;

import com.example.pageclone.domain.Item;
import com.example.pageclone.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class MainCarouselInit {

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

        itemRepository.save(item);
        itemRepository.save(item2);
        itemRepository.save(item3);
        itemRepository.save(item4);
        itemRepository.save(item5);


    }

}
