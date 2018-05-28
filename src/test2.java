/**
 * Created by TongYi on 2018/4/26.
 */
import java.util.Scanner;

public class test2 {
    public static void main(String []args)
    {
        //题目：给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
        //步骤1：在控制台中输入数组元素
        int[] a=new int [4];
        System.out.println("请输入4个数字：");
        for(int i=0; i<4;i++)
        {
            Scanner s=new Scanner(System.in);
            a[i]=s.nextInt();
        }
        //步骤2：将输入的数组遍历打印出来
        System.out.println("打印数组中元素为：");
        for(int i=0; i<4; i++)
        {
            System.out.print(a[i]+",");
        }
        System.out.println("  ");
        //步骤3：将数组中的元素进行一一相加，并输入一个数字，查看数字与数组元素和是否有一致的
        System.out.println("请输入一个数字：");
        Scanner su= new Scanner(System.in);
        int num=su.nextInt();
        System.out.println("数组中元素之和与输入数字相同的有：");
        int em;
        for(int i=0; i<3; i++)
        {
            for(int k=1; k+i<4; k++)
            {
                em=a[i]+a[k+i];
                if (em == num)
                {
                    System.out.println("["+i+","+(k+i)+"]");
                }
            }
        }
        System.out.println("  ");
    }
}
