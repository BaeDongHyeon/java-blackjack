package blackjack.view;

import blackjack.domain.SomeEnum;
import java.util.EnumMap;
import java.util.Map;

public class SomeEnumMapper {
    private static final Map<SomeEnum, String> map = new EnumMap<>(SomeEnum.class);

    private SomeEnumMapper() {
    }

    static {
        map.put(SomeEnum.A, "A");
        map.put(SomeEnum.B, "B");
        map.put(SomeEnum.C, "C");
    }

    public static String map(SomeEnum someEnum) {
        return map.get(someEnum);
    }
}
