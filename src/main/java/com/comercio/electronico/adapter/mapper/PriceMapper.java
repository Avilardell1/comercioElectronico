package com.comercio.electronico.adapter.mapper;

import com.comercio.electronico.adapter.dto.PriceDTO;
import com.comercio.electronico.domain.model.Price;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface PriceMapper {

    PriceDTO toDto(Price price);
    Price toEntity(PriceDTO priceDto);
    List<PriceDTO> toDto(List<Price> prices);
}

