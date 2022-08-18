package com.example.pageclone.domain;


import com.example.pageclone.exception.NotEnoughStockException;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "item_id")
    private Long id;

    private String firstCategory;

    private String secondCategory;

    private String thirdCategory;

    private String itemName;

    private int price;

    @Column(columnDefinition = "TEXT")
    private String itemInfo;

    private String color;

    private String fabric;

    private String model;

    private String size;

    private int stockQuantity;

    @Column(columnDefinition = "TEXT")
    private String imgUrl;

    private String saleStatus;

    private Long itemIdx;

    private boolean rep;

    public Item(Long id, String firstCategory, String secondCategory, String thirdCategory, String itemName, int price, String itemInfo, String color, String fabric, String model, String size, int stockQuantity, String imgUrl, String saleStatus, Long itemIdx, boolean rep) {
        this.id = id;
        this.firstCategory = firstCategory;
        this.secondCategory = secondCategory;
        this.thirdCategory = thirdCategory;
        this.itemName = itemName;
        this.price = price;
        this.itemInfo = itemInfo;
        this.color = color;
        this.fabric = fabric;
        this.model = model;
        this.size = size;
        this.stockQuantity = stockQuantity;
        this.imgUrl = imgUrl;
        this.saleStatus = saleStatus;
        this.itemIdx = itemIdx;
        this.rep = rep;
    }

    // business logic

    // 재고 관련
    public void plusStockQuantity(int plus) {
        this.stockQuantity += plus;
    }

    public void minusStockQuantity(int minus) {
        int res = this.stockQuantity - minus;
        if (res > 0) {
            this.stockQuantity = res;
        }
        else {
            throw new NotEnoughStockException("재고가 부족합니다");
        }
    }
}
