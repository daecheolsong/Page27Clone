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
        List<WeeklyBestDto> sleeveWeeklyBestItem = itemServiceImpl.getSleeveWeeklyBestItem();
        List<WeeklyBestDto> shirtsWeeklyBestItem = itemServiceImpl.getShirtsWeeklyBestItem();
        List<WeeklyBestDto> shoesWeeklyBestItem = itemServiceImpl.getShoesWeeklyBestItem();
        List<WeeklyBestDto> topKnitWeeklyBestItem = itemServiceImpl.getTopKnitWeeklyBestItem();
        List<WeeklyBestDto> bottomWeeklyBestItem = itemServiceImpl.getBottomWeeklyBestItem();

        List<WeeklyBestDto> newArrivalItemList = itemServiceImpl.getNewArrivalItem();
        model.addAttribute("mainCarousel", mainCarouselList);

        model.addAttribute("outerList", outerWeeklyBestItem);
        model.addAttribute("topList", sleeveWeeklyBestItem);
        model.addAttribute("shirtList", shirtsWeeklyBestItem);
        model.addAttribute("shoesList", shoesWeeklyBestItem);
        model.addAttribute("knitList", topKnitWeeklyBestItem);
        model.addAttribute("bottomList", bottomWeeklyBestItem);

        model.addAttribute("newarrivals", newArrivalItemList);

        return "main/index";
    }
}
