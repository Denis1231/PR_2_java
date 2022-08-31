package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//Ex1
        /*
        Boolean bool = true;
        System.out.println(bool);
        String str = "string";
        System.out.println(str);
        char char1 = '*';
        System.out.println(char1);
        int numb1 = 11001;
        System.out.println(numb1);
        int numb2 = 3;
        System.out.println(numb2);
        int numb3 = 10;
        System.out.println(numb3);
        int numb4 = 1F6;
        System.out.println(numb4);
        float float1 = 3.2f;
        System.out.println(float1);
        double double1 = 5.1;
        System.out.println(double1);
        */

        //Ex2
        /*
        int a = 4,b = 3;
        System.out.println(Min(a,b));
        System.out.println(Mult(a,b));
        System.out.println(Divis(a,b));
        System.out.println(Sum(a,b));
        */

        //Ex3
        /*
        int a =3;
        if(a%2!=0)
            System.out.println(a);
        */

        //Ex4
        /*
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>=0&&a<=10){
            System.out.println("Позитивне число менше 10 або нуль");
        }
        else System.out.println("Позитивне число більше 10 або негативне");
        */

        //Ex5
        /*
        int a = 3;
        if(a == 1)
            System.out.println("Понеділок");
        else if(a == 2) System.out.println("Вівторок");
        else if(a == 3) System.out.println("Середа");
        else if(a == 4) System.out.println("Четверг");
        else if(a == 5) System.out.println("П'ятниця");
        else if(a == 6 || a == 7) System.out.println("Вихідний");
        */

        //Ex6
        /*
        int a = 3;
        switch (a){
            case 1: System.out.println("Понеділок"); break;
            case 2: System.out.println("Вівторок"); break;
            case 3: System.out.println("Середа"); break;
            case 4: System.out.println("Четверг"); break;
            case 5: System.out.println("П'ятниця"); break;
            case 6: System.out.println("Вихідний"); break;
        }
        */
        //Ex7
        /*
        int i=1;
        while (i<=10){
            System.out.printf("Task%d\n",i);
            i++;
        }
        */
        //Ex8
        /*
        int i = 5;
        do{
          System.out.println(i);
          i+=5;
        }while (i<=100);
        */
        //Ex9

        int a = (int) (Math.random() * 5);
        int result=1;
        for (int i = 1;i<=a;i++){
            result*=i;
        }
        System.out.println("Numb a  = "+a);
        System.out.println("Result = " + result);
        

    }
    public static int Min(int a, int b){
        return a-b;
    }
    public static int Mult(int a,int b){
        return a*b;
    }
    public static int Divis(int a,int b){
        return a/b;
    }
    public static int Sum(int a,int b){
        return a+b;
    }
}
