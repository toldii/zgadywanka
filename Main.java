import java.util.Random; 
import java.util.Scanner;

public class Main { 
  public static void main(String[] args) { 
    int ii = 0;
    int los; 
    int odp;

Random rnd= new Random(); 
    los= rnd.nextInt(10);

Scanner scanner = new Scanner(System.in);
    System.out.println("Zagrajmy w grę :D");
     System.out.println("Zgadnij liczbę od 1 do 10 ");
    do{
      ii++;
       System.out.println("Podaj liczbe: ");
      odp= scanner.nextInt();
        if(odp > los){
           System.out.println("Niestety to nie ta liczba, spróbój podać mniejszą liczbę");
        }
         else if(odp < los){
           System.out.println("Niestety to nie ta liczba, spróbój podać większą liczbę");
        }
    } while (odp != los);
     System.out.println("BRAWO !!! odgadłeś za " + ii + "razem!");
    
    int ii1 = 0;
    int los1; 
    int odp1;

Random rnd1= new Random(); 
    los1= rnd1.nextInt(100)+1;


    System.out.println("Kolejna runda, tym razem coś trudniejszego");
     System.out.println("Zgadnij liczbę od 1 do 100 ");
    do{
      ii1++;
       System.out.println("Podaj liczbe: ");
      odp1= scanner.nextInt();
        if(odp1 > los1){
           System.out.println("Niestety to nie ta liczba, spróbój podać mniejszą liczbę");
        }
         else if(odp1 < los1){
           System.out.println("Niestety to nie ta liczba, spróbój podać większą liczbę");
        }
    } while (odp1 != los1);
     System.out.println("BRAWO !!! odgadłeś za " + ii1 + "razem!");
} }