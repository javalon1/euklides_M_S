package com.sda.algorytmy;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
   /* public static int euklides (){
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        while (A=B){
             System.out.println(A);




        }

}*/


    public static void main( String[] args )

    {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int licznik =0;

        while (a!=b){
            if (a>b){
                a=a-b;
            }else{
                b=b-a;
            }
            licznik++;
        }
        System.out.println("liczba interakcji: " + licznik);
        System.out.println("NWD: " + a);


    }
}
