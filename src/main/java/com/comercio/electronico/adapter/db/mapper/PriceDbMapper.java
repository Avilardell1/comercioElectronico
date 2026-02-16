package com.comercio.electronico.adapter.db.mapper;

import com.comercio.electronico.adapter.db.entity.PriceEntity;
import com.comercio.electronico.domain.model.Price;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PriceDbMapper {

    @Mapping(target = "brandId", source = "brand.id")
    @Mapping(target = "productId", source = "product.id")
    Price toDomain(PriceEntity entity);

    List<Price> toDomainList(List<PriceEntity> entity);

}
