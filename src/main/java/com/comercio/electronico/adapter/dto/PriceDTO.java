package com.comercio.electronico.adapter.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class PriceDTO {
    private Long brandId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Integer priceList;
    private Long productId;
    private Integer priority;
    private Double price;
    private String currency;
}
