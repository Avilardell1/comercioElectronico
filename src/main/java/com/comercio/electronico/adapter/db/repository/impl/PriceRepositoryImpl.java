package com.comercio.electronico.adapter.db.repository.impl;

import com.comercio.electronico.adapter.db.entity.Price;
import com.comercio.electronico.adapter.db.repository.PriceRepositoryCustom;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public class PriceRepositoryImpl implements PriceRepositoryCustom{

    @Override
    public Optional<List<Price>> findByBrandIdAndProductIdAndApplicationDate(Long brandId, Long productId, LocalDateTime applicationDate) {
        return Optional.empty();
    }
}
