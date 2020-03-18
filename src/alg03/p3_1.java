package alg03;

import java.util.Scanner;

public class p3_1 {

    public static int qiongJu(int head,int foot){
        for (int i=0;i<=head;i++){
            int j=head-i;
            if (i*2+j*4==foot){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int head,foot,re;

        System.out.println("请输入头的数量：");
        Scanner input=new Scanner(System.in);

        head=input.nextInt();
        System.out.println("请输入脚的数量：");
        foot=input.nextInt();

        re=qiongJu(head,foot);

        if (re>=0){
            System.out.println("鸡的数量是："+re);
        }else {
            System.out.println("数据错误");
        }

    }

}
