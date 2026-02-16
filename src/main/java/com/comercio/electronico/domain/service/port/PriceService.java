package com.comercio.electronico.domain.service.port;

import com.comercio.electronico.adapter.dto.PriceDTO;
import java.time.LocalDateTime;
import java.util.List;

public interface PriceService {
    List<PriceDTO> getPrices(LocalDateTime applicationDate, Long productId, Long brandId);
}
