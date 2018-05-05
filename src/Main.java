import enums.*;
import printers.*;
import factories.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main
{
    public static void main (String[] args)
    {
        List<Integer> inputs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        do{
            inputs.add(scanner.nextInt());
        }while (inputs.get(inputs.size()-1) != 0);

        WingedFanPrinter fanPrinter = WingedFanPrinterFactory.getWingedFanPrinter(FanPrinterType.QuadrupleSymmetry);

        for (int dimension: inputs){
            if(dimension!=0) {
                if(dimension>0) fanPrinter.printFan(dimension, FanDirection.Clockwise);
                if(dimension<0) fanPrinter.printFan(Math.abs(dimension), FanDirection.CounterClockwise);
            }
        }
    }
}