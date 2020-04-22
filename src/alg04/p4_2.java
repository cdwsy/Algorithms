package alg04;

//选择排序
public class p4_2 {
    static final int SIZE=10;

    static void selectSort(int[] a){
        int temp;

        for (int i=0;i<a.length-1;i++){
            for (int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    if (j!=i){
                        temp=a[j];
                        a[j]=a[i];
                        a[i]=temp;
                    }
                }
            }
        }
    }

    public static void main(String[] args)
    {
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

        selectSort(shuzu);					//排序操作

        System.out.print("排序后的数组为：\n");
        for(i=0;i<SIZE;i++)
        {
            System.out.print(shuzu[i]+" ");					//输出排序后的数组
        }
        System.out.print("\n");

    }
}
