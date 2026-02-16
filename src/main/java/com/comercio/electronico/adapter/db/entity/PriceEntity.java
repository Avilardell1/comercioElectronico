package com.comercio.electronico.adapter.db.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "PRICES")
public class
PriceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "BRAND_ID")
    private BrandEntity brand;

    @Column(name = "START_DATE")
    private LocalDateTime startDate;

    @Column(name = "END_DATE")
    private LocalDateTime endDate;

    @Column(name = "PRICE_LIST")
    private Integer priceList;

    @ManyToOne(optional = false)
    @JoinColumn(name = "PRODUCT_ID")
    private ProductEntity product;

    @Column(name = "PRIORITY")
    private Integer priority;

    @Column(name = "PRICE")
    private Double price;

    @Column(name = "CURR")
    private String currency;
}