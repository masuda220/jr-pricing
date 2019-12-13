package example.domain.model.rules;

import example.domain.model.specification.Destination;
import org.springframework.stereotype.Component;

import java.util.EnumMap;
import java.util.Map;

/**
 * 運賃テーブル
 */
@Component
public class FareTable {

    Map<Destination, Integer> map =new EnumMap<Destination, Integer>(Destination .class);

    {
        map.put(Destination.新大阪, 8910);
        map.put(Destination.姫路, 10010);
    }

    public int fare(Destination destination) {
        return map.get(destination);
    }
}
