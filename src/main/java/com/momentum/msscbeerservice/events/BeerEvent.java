package com.momentum.msscbeerservice.events;

import com.momentum.msscbeerservice.web.model.BeerDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BeerEvent {

    static final long serialVersionUID = -8004823140984486493L;

    private BeerDto beerDto;
}
