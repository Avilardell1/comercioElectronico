package com.comercio.electronico.adapter.mapper;

import com.comercio.electronico.adapter.db.entity.Price;
import com.comercio.electronico.adapter.dto.PriceDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

@Mapper(componentModel = "spring")
public interface PriceMapper {

    @Mapping(target = "brandId", source = "brand.id")
    @Mapping(target = "productId", source = "product.id")
    PriceDTO toDto(Price price);

    Price toEntity(PriceDTO priceDto);
    List<PriceDTO> toDto(List<Price> prices);
}

