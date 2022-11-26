package tsk2;

public class Trumpet implements Instrument{
    private int diameter;

    @Override
    public void play() {
        System.out.println("Playing Trumpet with diameter:"+diameter);
    }
    public Trumpet(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Trumpet{" +
                "diameter=" + diameter +
                '}';
    }
}
