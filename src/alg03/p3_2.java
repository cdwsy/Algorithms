package alg03;

import java.util.Scanner;

public class p3_2 {
    public static int fib(int i){
        int a,b;
        if (i==1||i==2){
            return 1;
        }
        a=fib(i-2);
        b=fib(i-1);
        return a+b;
    }


    public static void main(String[] args) {
        System.out.println("请输入月份：");
        Scanner input= new Scanner(System.in);

        int month=input.nextInt();

        int sum=fib(month);
        System.out.println("总数是："+sum);
    }


}
