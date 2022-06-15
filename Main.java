import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       
        // reads valeu from input
        Scanner input = new Scanner(System.in);
        Pen p = new Pen();
        // input
        p.setClicked(false);
        p.setColor("black");
        p.setType("normal");

        p.showProps();
    }
}
