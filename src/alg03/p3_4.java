package alg03;

import java.util.Scanner;

public class p3_4 {
    static final int MAXNUM=30;
    public static int fenZhi(int[] coin,int low,int high){
        int re=0;
        int sum1,sum2,sum3;
        sum1=sum2=sum3=0;

        if(low+1==high){
            if (coin[low]<coin[high]){
                re=low+1;
                return re;
            }
            re=high+1;
            return re;
        }

        if((high-low+1)%2==0){
            for (int i=low;i<=(high+low-1)/2;i++){
                sum1=sum1+coin[i];
            }

            for (int i=(high+low-1)/2+1;i<high;i++){
                sum2=sum2+coin[i];
            }

            if (sum1<sum2){
                re=fenZhi(coin,low,high/2);
                return re;
            }else {
                re=fenZhi(coin,1+high/2,high);
                return re;
            }
        }

        else {
            for (int i=low;i<=low+(high-low)/2-1;i++){
                sum1=sum1+coin[i];
            }

            for (int i=low+(high-low)/2+1;i<high;i++){
                sum2=sum2+coin[i];
            }
            sum3=coin[low+(high-low)/2];

            if (sum1<sum2){
                re=fenZhi(coin,low,low+(high-low)/2-1);
                return re;
            }else if(sum1>sum2){
                re=fenZhi(coin,low+(high-low)/2+1,high);
                return re;
            }
            else{
                re=low+(high-low)/2+1;
                return re;
            }

        }

    }


    public static void main(String[] args) {
        int[] coin=new int[MAXNUM];
        int i,n;
        int weizhi;
        System.out.println("分治算法求解假银币问题！");
        System.out.print("请输入银币总的个数：");
        Scanner input=new Scanner(System.in);
        n=input.nextInt();						//银币总的个数
        System.out.print("请输入银币的真假：");
        for(i=0;i<n;i++)
        {
            coin[i]=input.nextInt();			//输入银币的真假
        }
        weizhi=fenZhi(coin,0,n-1);			//求解
        System.out.println("在上述"+MAXNUM+"个银币中，第"+weizhi+"个银币是假的！");
    }

}
