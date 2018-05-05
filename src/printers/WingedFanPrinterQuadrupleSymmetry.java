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
        long duration;
        long startTime, endTime;

        startTime = System.nanoTime();
        if(fanDirection == FanDirection.Clockwise){
            charMap.buildClockwiseFan(dimension);
        }else if (fanDirection == FanDirection.CounterClockwise){
            charMap.buildCunterClockwiseFan(dimension);
        }
        /*endTime = System.nanoTime();
        duration = endTime-startTime;
        System.out.println("Duratrion of generating "+dimension+" fan: "+duration/1000000000.0+"s");*/

        charMap.print();
    }
}
