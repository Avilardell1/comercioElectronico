package com.comercio.electronico.adapter.db.repository.impl;

import com.comercio.electronico.adapter.db.entity.PriceEntity;
import com.comercio.electronico.adapter.db.repository.PriceRepositoryCustom;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public class PriceRepositoryImpl implements PriceRepositoryCustom{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Optional<List<PriceEntity>> findAccuratePrices(
            Long brandId,
            Long productId,
            LocalDateTime applicationDate) {

        List<PriceEntity> prices = entityManager.createQuery("""
                SELECT p FROM PriceEntity p
                WHERE p.brand.id = :brandId
                AND p.product.id = :productId
                AND :applicationDate BETWEEN p.startDate AND p.endDate
                ORDER BY p.priority DESC
                """, PriceEntity.class)
                .setParameter("brandId", brandId)
                .setParameter("productId", productId)
                .setParameter("applicationDate", applicationDate)
                .getResultList();

        return prices.isEmpty()
                ? Optional.empty()
                : Optional.of(prices);
    }
}
