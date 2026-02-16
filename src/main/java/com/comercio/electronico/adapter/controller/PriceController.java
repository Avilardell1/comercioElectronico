package com.comercio.electronico.adapter.controller;

import com.comercio.electronico.adapter.dto.PriceDTO;
import com.comercio.electronico.domain.service.port.PriceService;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;

@RestController
@AllArgsConstructor
@RequestMapping("/prices")
class PriceController {
    private final PriceService priceService;

    @GetMapping()
    public ResponseEntity<PriceDTO> getPrice(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime applicationDate,
                                                    @RequestParam Long productId, @RequestParam Long brandId){

        return ResponseEntity.ok(priceService.getPrices(applicationDate, productId, brandId));
    }
}
