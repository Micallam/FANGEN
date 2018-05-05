package printers;

import painters.CharMap;
import enums.FanDirection;

public class WingedFanPrinterQuadrupleSymmetry implements WingedFanPrinter {
    private CharMap charMap;
    public WingedFanPrinterQuadrupleSymmetry(CharMap charMap){
        this.charMap = charMap;
    }

    @Override
    public void printFan(int dimension, FanDirection fanDirection){
        if(fanDirection == FanDirection.Clockwise){
            charMap.buildClockwiseFan(dimension);
        }else if (fanDirection == FanDirection.CounterClockwise){
            charMap.buildCunterClockwiseFan(dimension);
        }

        charMap.print();
    }
}
