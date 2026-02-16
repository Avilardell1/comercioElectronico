package com.comercio.electronico.domain.service.impl;

import com.comercio.electronico.adapter.db.entity.PriceEntity;
import com.comercio.electronico.adapter.db.mapper.PriceDbMapper;
import com.comercio.electronico.adapter.db.repository.PriceRepository;
import com.comercio.electronico.adapter.dto.PriceDTO;
import com.comercio.electronico.adapter.mapper.PriceMapper;
import com.comercio.electronico.domain.service.port.PriceService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PortServiceImpl implements PriceService {

    private final PriceRepository priceRepository;
    private final PriceMapper priceMapper;
    private final PriceDbMapper priceDbMapper;

    @Override
    public PriceDTO getPrices(LocalDateTime applicationDate, Long productId, Long brandId) {
        Optional<PriceEntity> priceOptional = priceRepository.findAccuratePrices(brandId, productId, applicationDate);
        PriceEntity priceList = priceOptional.orElse(null);
        if (priceList == null) {
            return null;
        }
        return priceMapper.toDto(priceDbMapper.toDomain(priceList));
    }
}
