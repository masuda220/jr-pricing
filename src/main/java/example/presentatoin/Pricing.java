package example.presentatoin;

import example.application.service.FareService;
import example.domain.model.attempt.Attempt;
import example.domain.model.bill.Amount;
import example.domain.model.bill.Bill;
import example.domain.model.spacification.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

/**
 * 料金計算コントローラ
 */
@RestController
@RequestMapping("/api/pricing")
@Api(tags="JR新幹線 料金計算")
public class Pricing {

    FareService fareService;

    public Pricing(FareService fareService) {
        this.fareService = fareService;
    }

    @GetMapping
    @ApiOperation("料金計算")
    String pricing(
            @ApiParam(value="大人人数", defaultValue = "1") @RequestParam int adult,
            @ApiParam(value = "子供人数", defaultValue = "1") @RequestParam int child,
            @ApiParam(value="出発日", defaultValue = "2020-12-15") @RequestParam DepartureDate departureDate,
            @ApiParam(value="目的地", defaultValue = "新大阪") @RequestParam Destination destination,
            @ApiParam(value="座席区分", defaultValue = "指定席") @RequestParam SeatType seatType,
            @ApiParam(value="列車種類", defaultValue = "ひかり") @RequestParam TrainType trainType,
            @ApiParam(value="片道/往復", defaultValue = "片道") @RequestParam TripType tripType
            ) {

        Attempt attempt = new Attempt(adult, child, departureDate, destination, seatType, trainType, tripType);
        Amount amount = fareService.amountFor(attempt);
        return new Bill(attempt, amount).toString();
    }
}
