package tsk1;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Printable> printable=new ArrayList();

        printable.add(new Book("Book",200,Genre.Horror));
        printable.add(new Magazine("magazine",20,Genre.Comedy));

//        System.out.println(printable);

        for(Printable print:printable){
            print.print();
        }
    }
}
