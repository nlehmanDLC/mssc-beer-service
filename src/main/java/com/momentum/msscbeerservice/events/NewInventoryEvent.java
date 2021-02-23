package com.momentum.msscbeerservice.events;

import com.momentum.msscbeerservice.web.model.BeerDto;

public class NewInventoryEvent extends BeerEvent{

    public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
