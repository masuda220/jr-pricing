package example.application.service;

import example.domain.model.attempt.Attempt;
import example.domain.model.bill.Amount;
import example.domain.model.rules.DistanceTable;
import example.domain.model.rules.FareTable;
import example.domain.model.rules.SurchargeTable;
import example.domain.model.spacification.Destination;
import org.springframework.stereotype.Service;

/**
 * 料金計算サービス
 */
@Service
public class FareService {

    FareTable fareTable;
    SurchargeTable surchargeTable;
    DistanceTable distanceTable;

    public FareService(FareTable fareTable, SurchargeTable surchargeTable, DistanceTable distanceTable) {
        this.fareTable = fareTable;
        this.surchargeTable = surchargeTable;
        this.distanceTable = distanceTable;
    }

    public Amount amountFor(Attempt attempt) {

        // 仮実装（目的地別のひかり、大人一名の料金）
        Destination to = attempt.to();
        return new Amount(fareTable.fare(to) + surchargeTable.surcharge(to));
    }
}
