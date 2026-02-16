package com.comercio.electronico.adapter.db.repository;

import com.comercio.electronico.adapter.db.entity.Price;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository extends JpaRepository<Price, Long>, PriceRepositoryCustom {
}
