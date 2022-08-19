package com.example.pageclone.controller.main;

import com.example.pageclone.domain.Item;
import com.example.pageclone.dto.WeeklyBestDto;
import com.example.pageclone.service.ItemServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class MainController {

    private final ItemServiceImpl itemServiceImpl;

    @GetMapping({"/main/index", "/"})
    public String getMainPage(Model model) {
        List<Item> mainCarouselList = itemServiceImpl.getMainCarouselItemList();

        List<WeeklyBestDto> outerWeeklyBestItem = itemServiceImpl.getOuterWeeklyBestItem();

        model.addAttribute("mainCarousel", mainCarouselList);
        model.addAttribute("outerList", outerWeeklyBestItem);

        return "main/index";
    }
}
