package example.application.service;

import example.domain.model.attempt.Attempt;
import example.domain.model.specification.*;

class AttemptFactory {

    static Attempt 大人1_通常期_新大阪_指定席_ひかり_片道() {
        return new Attempt(
                1, 0,
                new DepartureDate("2019-12-24"),
                Destination.新大阪,
                SeatType.指定席,
                TrainType.ひかり,
                TicketType.片道
        );
    }
}
