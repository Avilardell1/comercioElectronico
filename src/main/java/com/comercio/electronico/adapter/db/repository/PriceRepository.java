package com.comercio.electronico.adapter.db.repository;

import com.comercio.electronico.adapter.db.entity.PriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository extends JpaRepository<PriceEntity, Long>, PriceRepositoryCustom {
}
