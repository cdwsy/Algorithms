package alg04;

//冒泡排序
public class p4_1 {
    static final int SIZE=10;

    public static void bubbleSort(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int test=a[j];
                    a[j]=a[i];
                    a[i]=test;
                }
            }
            System.out.println("第"+i+"次排序结果是:");
            for(int k=0;k<a.length;k++){
                System.out.println(a[k]+" a");
                //System.out.println("\n");
            }
        }
    }


    public static void main(String []args) {
        int[] shuzu=new int[SIZE];
        int i;
        for(i=0;i<SIZE;i++)
        {
            shuzu[i]=(int)(100+Math.random()*(100+1));			//初始化数组
        }
        System.out.print("排序前的数组为：\n");				//输出排序前的数组
        for(i=0;i<SIZE;i++)
        {
            System.out.print(shuzu[i]+" ");
        }
        System.out.print("\n");
        bubbleSort(shuzu);					//排序操作
        System.out.print("排序后的数组为：\n");
        for(i=0;i<SIZE;i++)
        {
            System.out.print(shuzu[i]+" ");					//输出排序后的数组
        }
        System.out.print("\n");
    }
}

