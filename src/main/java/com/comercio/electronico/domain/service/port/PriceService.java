package com.comercio.electronico.domain.service.port;

import com.comercio.electronico.adapter.dto.PriceDTO;
import java.time.LocalDateTime;

public interface PriceService {
    PriceDTO getPrices(LocalDateTime applicationDate, Long productId, Long brandId);
}
