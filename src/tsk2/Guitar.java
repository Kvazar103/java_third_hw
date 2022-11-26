package tsk2;

public class Guitar implements Instrument {
    private int number_of_Strings;

    @Override
    public void play() {
        System.out.println("play guitar with "+number_of_Strings+" number of strings");
    }
    public Guitar(int number_of_Strings) {
        this.number_of_Strings = number_of_Strings;
    }

    public int getNumber_of_Strings() {
        return number_of_Strings;
    }

    public void setNumber_of_Strings(int number_of_Strings) {
        this.number_of_Strings = number_of_Strings;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "number_of_Strings=" + number_of_Strings +
                '}';
    }
}
