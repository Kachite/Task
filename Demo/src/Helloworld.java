import java.awt.*;
import java.util.Locale;
import java.util.Scanner;

public class Helloworld {

    public static void main (String[] arg){
        final Double GRAVITY = 9.8;

        System.out.println("Enter the Initial Velocity of the stone:");
        Scanner initial = new Scanner(System.in);
        double finalVelocity = Double.parseDouble(initial.nextLine());
        Double time =  (finalVelocity / GRAVITY);
        System.out.println(time);

    }
}
