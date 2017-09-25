/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcdfeckmelzer;

/**
 *
 * @author Lukas
 * gcd mit Standardisiertem Algorithmus und Euclidischen Algorithmus
 */
public class GcdFeckMelzer {

    
    public static void main(String[] args) {
        
        gcdPrimeFactors(16, 4);
        gcdEucledian(16, 4);
        gcdPrimeFactors(756, 98);
        gcdEucledian(756, 98);
        gcdPrimeFactors(340, 24);
        gcdEucledian(340, 24);
        gcdPrimeFactors(786, 386);
        gcdEucledian(786, 386);
    }
    
    static void gcdPrimeFactors(int a, int b){
        int x = a;
        int y = b;
        int r = 0;
        if(a == 0){
            System.out.println("STANDARD: gcd of " + a + " and " + b + " is " + b);
        }
        else if(b == 0){
            System.out.println("STANDARD: gcd of " + a + " and " + b + " is " + a);
        }
        else{
            while(y > 0)
            {
                r = x % y;
                x = y;
                y = r;
            }
            System.out.println("STANDAD: gcd of " + a + " and " + b + " is " + x);
        }
        
    }
    
    static void gcdEucledian(int a, int b){
        
        if(a == 0){
            System.out.println("EUCLEDIAN: gcd of " + a + " and " + b + " is " + b);
        }
        else{
            int aout = a;
            int bout = b;
            while(b != 0)
            {
                if(a > b)
                {
                    a = a - b;
                }
                else
                {
                    b = b - a;
                }
            }
            System.out.println("EUCLEDIAN: gcd of " + aout + " and " + bout + " is " + a);
        }
    }
    
}
