package planetweight;


import java.util.Scanner;
import java.text.DecimalFormat;

class PlanetWeight {
    public static void main(String[] args) {
        
        System.out.println("This program calculates your weight on the planets of our solar system,");
        System.out.println("and on the moon.\n");
        
        Scanner s = new Scanner (System.in);
        System.out.print("Please enter your weight in pounds (lbs): ");
        double weight = s.nextFloat();
        
        
        //format output to zero decimal places
        DecimalFormat df = new DecimalFormat("#");
        System.out.print("\nYour weight on Earth is ");
        System.out.println(df.format(weight) + " lbs.");
        
        System.out.print("Your weight on the Moon is ");
        double moon = weight * 0.166;
        System.out.println(df.format(moon) + " lbs.");
        
        System.out.print("Your weight on Mercury is ");
        double mercury = weight * 0.378;
        System.out.println(df.format(mercury) + " lbs.");
        
        System.out.print("Your weight on Venus is ");
        double venus  = weight * 0.91;
        System.out.println(df.format(venus) + " lbs.");
        
        System.out.print("Your weight on Mars is ");
        double mars  = weight * 0.38;
        System.out.println(df.format(mars) + " lbs.");
        
        System.out.print("Your weight on Jupiter is ");
        double jupiter  = weight * 2.364;
        System.out.println(df.format(jupiter) + " lbs.");
        
        System.out.print("Your weight on Saturn is ");
        double saturn  = weight * 1.06;
        System.out.println(df.format(saturn) + " lbs.");
        
        System.out.print("Your weight on Uranus is ");
        double uranus  = weight * 0.92;
        System.out.println(df.format(uranus)+ " lbs.");
        
        System.out.print("Your weight on Neptune is ");
        double neptune  = weight * 1.19;
        System.out.println(df.format(neptune)+ " lbs.");
    }
}