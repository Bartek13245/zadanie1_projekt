import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        double R; 
        System.out.println("Wartosc promienia kuli: "); 
        R = Double.parseDouble(scanner.nextLine()); 
                                                    

        System.out.println("Objetosc kuli o promieniu " + R + ":");
        double objetosc = 4.0 / 3.0 * Math.PI * R * R * R; 
                                                       
        System.out.println(objetosc); 

        System.out.println("Pole kuli o promieniu " + R + ":");
        double pole = 4.0 * Math.PI * R * R; 
        System.out.println(pole); 

        scanner.close(); 
    }
}