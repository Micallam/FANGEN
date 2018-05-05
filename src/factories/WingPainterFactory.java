package factories;

import enums.WingType;
import painters.WingPainter;

public class WingPainterFactory {
    public static WingPainter getWingPainter(WingType wingType){
        if (wingType == WingType.AsteriskTriangle) {
            return new WingPainter();
        }
        throw new IllegalArgumentException("Illegal WingType: " + wingType);
    }
}
