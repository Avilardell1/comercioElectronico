package com.comercio.electronico.adapter.db.repository.impl;

import com.comercio.electronico.adapter.db.entity.PriceEntity;
import com.comercio.electronico.adapter.db.repository.PriceRepositoryCustom;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;
import java.util.Optional;

@Repository
public class PriceRepositoryImpl implements PriceRepositoryCustom{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Optional<PriceEntity> findAccuratePrices(
            Long brandId,
            Long productId,
            LocalDateTime applicationDate) {

        PriceEntity price = entityManager.createQuery("""
                SELECT p FROM PriceEntity p
                WHERE p.brand.id = :brandId
                AND p.product.id = :productId
                AND :applicationDate BETWEEN p.startDate AND p.endDate
                ORDER BY p.priority DESC LIMIT 1
                """, PriceEntity.class)
                .setParameter("brandId", brandId)
                .setParameter("productId", productId)
                .setParameter("applicationDate", applicationDate)
                .getSingleResult();

        return price != null ? Optional.of(price): Optional.empty();
    }
}
