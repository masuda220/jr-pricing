package example.presentatoin;

import example.domain.model.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pricing")
@Api(tags="JR新幹線 料金計算")
public class Pricing {

    @GetMapping
    @ApiOperation("料金計算")
    String pricing(
            @ApiParam(value="列車種類", defaultValue = "のぞみ") @RequestParam TrainType trainType,
            @ApiParam(value="目的地", defaultValue = "新大阪") @RequestParam Destination destination,
            @ApiParam(value="片道/往復", defaultValue = "片道") @RequestParam TripType tripType,
            @ApiParam(value="大人人数", defaultValue = "1") @RequestParam int adult,
            @ApiParam(value = "子供人数", defaultValue = "1") @RequestParam int child
            ) {

        Attempt attempt = new Attempt(adult, child, destination, trainType, tripType);
        Amount amount = new Amount(12800);
        return new Bill(attempt, amount).toString();
    }
}
