package tsk2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Instrument> instruments=new ArrayList<>();

        instruments.add(new Drum(2));
        instruments.add(new Guitar(4));
        instruments.add(new Drum(4));
        instruments.add(new Trumpet(10));
        instruments.add(new Trumpet(4));
        instruments.add(new Guitar(8));
        instruments.add(new Guitar(12));

        for(Instrument instrument:instruments){
            instrument.play();
        }
    }
}
