package com.momentum.msscbeerservice.events;

import com.momentum.msscbeerservice.web.model.BeerDto;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Builder
public class BeerEvent {

    static final long serialVersionUID = -8004823140984486493L;

    private final BeerDto beerDto;
}
