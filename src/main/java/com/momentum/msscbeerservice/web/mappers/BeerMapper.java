package com.momentum.msscbeerservice.web.mappers;

import com.momentum.msscbeerservice.domain.Beer;
import com.momentum.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto dto);
}
