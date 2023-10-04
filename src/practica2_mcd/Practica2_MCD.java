package practica2_mcd;

import java.util.Scanner;

public class Practica2_MCD {

    public static void main(String[] args) {
        int num1, num2, mcd;
        Scanner en=new Scanner(System.in);
        System.out.println("Ingresa el primer número");
        num1 = en.nextInt();
        System.out.println("Ingresa el segundo número");
        num2 = en.nextInt();
        
        mcd = mcomundivisor(num1, num2);
        System.out.println("El Máximo Común Divisor de " + num1 + " y " + num2 + " es: " + mcd);
    }
    
    private static int mcomundivisor(int num1, int num2){
        int res;        
        do{
            res = num1 % num2;
            num1 = num2;
            num2 = res;
        }
        while(num2 > 0);
        return num1;
    }
    
}
