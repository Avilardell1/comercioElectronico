package com.comercio.electronico.adapter.db.repository;

import com.comercio.electronico.adapter.db.entity.Price;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface PriceRepositoryCustom {
    Optional<List<Price>> findByBrandIdAndProductIdAndApplicationDate(Long brandId, Long productId, LocalDateTime applicationDate);
}
