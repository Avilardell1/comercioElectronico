package com.comercio.electronico.adapter.mapper;

import com.comercio.electronico.adapter.dto.PriceDTO;
import com.comercio.electronico.domain.model.Price;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PriceMapper {

    PriceDTO toDto(Price price);
    Price toEntity(PriceDTO priceDto);
}

