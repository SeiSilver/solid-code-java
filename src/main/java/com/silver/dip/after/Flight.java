package com.silver.dip.after;

import java.time.LocalTime;

public record Flight(String callSign, String destination, LocalTime departsAt, String callToAction) {
    @Override
    public String toString() {
        return callSign + "   " + departsAt + "   " + destination + "   " + callToAction;
    }
}
