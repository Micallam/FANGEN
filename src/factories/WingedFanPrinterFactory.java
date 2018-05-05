package factories;

import enums.*;
import painters.*;
import printers.*;

public class WingedFanPrinterFactory {
    public static WingedFanPrinter getWingedFanPrinter(FanPrinterType type) {
        WingPainter painter = WingPainterFactory.getWingPainter(WingType.AsteriskTriangle);
        CharMap wingMap = painter.getWingMap();
        if (type == FanPrinterType.QuadrupleSymmetry) {
            return new WingedFanPrinterQuadrupleSymmetry(wingMap);
        }
        throw new IllegalArgumentException("Illegal FanPrinterType: " + type);
    }
}