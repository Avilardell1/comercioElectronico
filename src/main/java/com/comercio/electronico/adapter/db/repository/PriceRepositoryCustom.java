package com.comercio.electronico.adapter.db.repository;

import com.comercio.electronico.adapter.db.entity.PriceEntity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface PriceRepositoryCustom {
    Optional<List<PriceEntity>> findAccuratePrices(Long brandId, Long productId, LocalDateTime applicationDate);
}
