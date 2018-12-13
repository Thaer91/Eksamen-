import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Her kan du udregne rumfanget af en cylinder");
        Scanner regner = new Scanner(System.in);
        System.out.println("Først skal du indtaste Radiusen (r):");
        float r = regner.nextFloat(); //Her får man værdien på radius, fra det input som brugeren skriver.
        System.out.println("Nu skal du indtaste højden (h):");
        float h = regner.nextFloat(); //Her får man værdien på højden, fra det input som brugeren skriver.
        double sum = Math.PI*Math.pow(r,2)*h; //Her bruger vi formlen til at beregne rumfanget af en cylinder.
        //For at finde rumfanget af en cylinder skal vi bruge Pi og r^2. For at løse det, bruger vi funkktionen Math.
        System.out.println("Rumfanget er: "+sum);

    }
}


