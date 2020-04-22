package alg04;

//插入排序
public class p4_3 {
    static final int SIZE=10;
    static void insertionSort(int[] a){
        int temp;

        for(int i=1;i<a.length;i++){
            int cur=i;
            while (cur-1>=0&&a[cur]<a[cur-1]){
                temp=a[cur-1];
                a[cur-1]=a[cur];
                a[cur]=temp;
                cur--;
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

        insertionSort(shuzu);					//排序操作

        System.out.print("排序后的数组为：\n");
        for(i=0;i<SIZE;i++)
        {
            System.out.print(shuzu[i]+" ");					//输出排序后的数组
        }
        System.out.print("\n");

    }

}
