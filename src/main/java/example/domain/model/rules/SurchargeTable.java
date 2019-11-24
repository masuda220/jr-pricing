package example.domain.model.rules;

import example.domain.model.spacification.Destination;
import org.springframework.stereotype.Component;

import java.util.EnumMap;
import java.util.Map;

/**
 * ひかり　指定席特急券テーブル
 */
@Component
public class SurchargeTable {

    Map<Destination, Integer> map =new EnumMap<Destination, Integer>(Destination .class);

    {
        map.put(Destination.新大阪, 5490);
        map.put(Destination.姫路, 5920);
    }

    public int surcharge(Destination destination) {
        return map.get(destination);
    }
}
