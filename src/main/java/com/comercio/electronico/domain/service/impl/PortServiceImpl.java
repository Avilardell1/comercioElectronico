package com.comercio.electronico.domain.service.impl;

import com.comercio.electronico.adapter.db.entity.Price;
import com.comercio.electronico.adapter.db.repository.PriceRepository;
import com.comercio.electronico.adapter.dto.PriceDTO;
import com.comercio.electronico.adapter.mapper.PriceMapper;
import com.comercio.electronico.domain.service.port.PriceService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PortServiceImpl implements PriceService {

    private final PriceRepository priceRepository;
    private final PriceMapper priceMapper;

    @Override
    public List<PriceDTO> getPrices(LocalDateTime applicationDate, Long productId, Long brandId) {
        Optional<List<Price>> priceListOptional = priceRepository.findByBrandIdAndProductIdAndApplicationDate(brandId, productId, applicationDate);
        List<Price> priceList = priceListOptional.orElse(null);
        if (priceList == null) {
            return Collections.emptyList();
        }
        return priceMapper.toDto(priceList);
    }
}
