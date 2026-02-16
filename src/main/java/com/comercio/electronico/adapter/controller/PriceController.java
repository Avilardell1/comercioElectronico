package com.comercio.electronico.adapter.controller;

import com.comercio.electronico.adapter.dto.PriceDTO;
import com.comercio.electronico.domain.service.port.PriceService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@AllArgsConstructor
class PriceController {
    private final PriceService priceService;

    @GetMapping("/prices")
    public ResponseEntity<List<PriceDTO>> getPrices(@RequestParam LocalDateTime applicationDate,
                                                    @RequestParam Long productId, @RequestParam Long brandId){

        return ResponseEntity.ok(priceService.getPrices(applicationDate, productId, brandId));
    }
}
