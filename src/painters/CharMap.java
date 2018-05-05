package painters;

import java.util.ArrayList;
import java.util.List;

public class CharMap {
    private List<List<Character>> charMap;

    CharMap(){
        charMap = new ArrayList<>();
    }

    public void buildClockwiseFan(int howManyDimensions) {
        charMap.clear();

        for(int actualDimension=1; actualDimension<=howManyDimensions; actualDimension++){
            charMap.add(0, new ArrayList<>());
            charMap.get(0).add('*');
            charMap.get(0).add('*');
            charMap.add(actualDimension*2-1, new ArrayList<>());
            charMap.get(actualDimension*2-1).add('*');
            charMap.get(actualDimension*2-1).add('*');

            int howManyChars;
            int iterator;
            for(int i=0; i<4; i++){
                switch(i){
                    case 0:
                        howManyChars = actualDimension-1;
                        while (howManyChars>0){
                            charMap.get(0).add(1,'*');
                            howManyChars--;
                        }

                        howManyChars = actualDimension-1;
                        while (howManyChars>0){
                            charMap.get(0).add(actualDimension,'.');
                            howManyChars--;
                        }

                        break;
                    case 1:
                        howManyChars = (actualDimension-1)*2;
                        iterator=1;
                        while (iterator<=howManyChars/2) {
                            charMap.get(iterator).add('*');
                            iterator++;
                        }
                        while (iterator<=howManyChars) {
                            charMap.get(iterator).add('.');
                            iterator++;
                        }

                        break;
                    case 2:
                        howManyChars = actualDimension-1;
                        while (howManyChars>0){
                            charMap.get(actualDimension*2-1).add(1,'.');
                            howManyChars--;
                        }

                        howManyChars = actualDimension-1;
                        while (howManyChars>0){
                            charMap.get(actualDimension*2-1).add(actualDimension,'*');
                            howManyChars--;
                        }

                        break;
                    case 3:
                        howManyChars = (actualDimension-1)*2;
                        iterator=1;
                        while (iterator<=howManyChars/2) {
                            charMap.get(iterator).add(0,'.');
                            iterator++;
                        }
                        while (iterator<=howManyChars) {
                            charMap.get(iterator).add(0,'*');
                            iterator++;
                        }

                        break;
                }
            }
        }
    }

    public void buildCunterClockwiseFan(int howManyDimensions) {
        charMap.clear();

        for(int actualDimension=1; actualDimension<=howManyDimensions; actualDimension++){
            charMap.add(0, new ArrayList<>());
            charMap.get(0).add('*');
            charMap.get(0).add('*');
            charMap.add(actualDimension*2-1, new ArrayList<>());
            charMap.get(actualDimension*2-1).add('*');
            charMap.get(actualDimension*2-1).add('*');

            int howManyChars;
            int iterator;
            for(int i=0; i<4; i++){
                switch(i){
                    case 0:
                        howManyChars = actualDimension-1;
                        while (howManyChars>0){
                            charMap.get(0).add(1,'.');
                            howManyChars--;
                        }

                        howManyChars = actualDimension-1;
                        while (howManyChars>0){
                            charMap.get(0).add(actualDimension,'*');
                            howManyChars--;
                        }

                        break;
                    case 1:
                        howManyChars = (actualDimension-1)*2;
                        iterator=1;
                        while (iterator<=howManyChars/2) {
                            charMap.get(iterator).add('.');
                            iterator++;
                        }
                        while (iterator<=howManyChars) {
                            charMap.get(iterator).add('*');
                            iterator++;
                        }

                        break;
                    case 2:
                        howManyChars = actualDimension-1;
                        while (howManyChars>0){
                            charMap.get(actualDimension*2-1).add(1,'*');
                            howManyChars--;
                        }

                        howManyChars = actualDimension-1;
                        while (howManyChars>0){
                            charMap.get(actualDimension*2-1).add(actualDimension,'.');
                            howManyChars--;
                        }

                        break;
                    case 3:
                        howManyChars = (actualDimension-1)*2;
                        iterator=1;
                        while (iterator<=howManyChars/2) {
                            charMap.get(iterator).add(0,'*');
                            iterator++;
                        }
                        while (iterator<=howManyChars) {
                            charMap.get(iterator).add(0,'.');
                            iterator++;
                        }

                        break;
                }
            }
        }
    }

    public void print(){
        StringBuilder fan = new StringBuilder();
        for(List<Character> characters: charMap){
            for (char c: characters){
                fan.append(c);
            }
            fan.append("\n");
        }
        System.out.println(fan.toString());
    }
}
