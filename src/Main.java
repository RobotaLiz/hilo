import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hej nu ska vi köra spelet HiLo, där du ska gissa vilket tal datorn tänker på");
        System.out.println("där du får välja mellan lätt, medel eller svår");
        System.out.println("genom att skriva en siffra mellan 1, 2 eller 3");

        Scanner sc = new Scanner (System.in);
        System.out.println("välj en svårighetsgrad");
        int chooseLevel = sc.nextInt();
        Random rano = new Random();

        int datornsVarde = -1;

        if (chooseLevel == 1){
            System.out.println("Du har valt svårighetsgrad lätt 1-10");
            datornsVarde = rano.nextInt(10);
        }
        if (chooseLevel == 2) {
            System.out.println("Du har valt svårighetsgrad medel 1- 100");
            datornsVarde = rano.nextInt(100);
        }
        if (chooseLevel == 3){
            System.out.println("Du har valt svårighetsgrad svår 1-1000");
            datornsVarde = rano.nextInt(1000);
        }
        System.out.println(" dags för gissning ");
            int gissningar = 0;
        while (true){
            int giss = sc.nextInt();
            gissningar++;
            if (giss == datornsVarde) {
                System.out.println("Du gissade rätt");
                break;
            }else{
                System.out.println("FEL");
            }
            if (giss > datornsVarde) {
                System.out.println("För högt");
            }
            if (giss < datornsVarde){
                System.out.println("För lågt");

            }
        }
        System.out.println("Hurra!! du klarade det!! du gissade "+gissningar + "gånger");












    }

}