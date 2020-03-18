package alg03;

import java.util.Scanner;

public class p3_3 {

    public static int jieCheng(int x){

        if (x==1){
            return 1;
        }

        return x=x*jieCheng(x-1);
    }

    public static void main(String[] args) {
        System.out.println("求下面这个数的阶乘：");
        Scanner input= new Scanner(System.in);

        int a=input.nextInt();

        int b=jieCheng(a);
        System.out.println("阶乘是："+b);

        //System.out.println((7-4)/2);
    }

}
