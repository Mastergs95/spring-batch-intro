package org.example.service;

import org.example.model.FlightTicket;
import org.springframework.batch.item.ItemProcessor;

public class CustomItemProcessor implements ItemProcessor<FlightTicket, FlightTicket> {
    @Override
    public FlightTicket process(FlightTicket flightTicket) throws Exception {
        System.out.printf("Processing %s...%n", flightTicket);
        flightTicket.setRoute(flightTicket.getRoute().toUpperCase());

        return flightTicket;
    }
}
