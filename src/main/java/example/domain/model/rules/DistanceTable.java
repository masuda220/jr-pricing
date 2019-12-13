package example.domain.model.rules;

import example.domain.model.specification.Destination;
import org.springframework.stereotype.Component;

import java.util.EnumMap;
import java.util.Map;

/**
 * 営業キロテーブル
 */
@Component
public class DistanceTable {

    Map<Destination, Integer> map =new EnumMap<Destination, Integer>(Destination .class);

    {
        map.put(Destination.新大阪, 553);
        map.put(Destination.姫路, 644);
    }

    public int distance(Destination destination) {
        return map.get(destination);
    }
}
