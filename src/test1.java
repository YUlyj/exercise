/**
 * Created by TongYi on 2018/4/19.
 */

import java.util.Scanner;

public class test1 {
    public static void main (String []args){
        //用户输入
        System.out.println("请输入一个整数：");
        Scanner test =new Scanner(System.in);

        //1.要求用户输入一个整数，如果是偶数就输出它是一个偶数，否则就输出它是一个奇数（什么是偶数？能被2整除的就是偶数）
        while(true){
            String num=test.nextLine();
            if(num==null){
                System.out.println("sorry!您输入的必须是1-9位的整数，才能判断是奇数还是偶数，请重新输入：");
                continue;
            }else if(!num.matches("\\d{1,9}")){
                System.out.println("sorry!您输入的必须是1-9位的整数，才能判断是奇数还是偶数，请重新输入：");
                continue;
            }
            int number=Integer.parseInt(num);
            if(number%2 == 0)
            {
                System.out.println(number+"是偶数");
                System.out.println("请输入一个年份：");
                break;
            }
            else{
                System.out.println(number+"是奇数");
                System.out.println("请输入一个年份：");
                break;
            }
        }
        //2.要求用户输入一个年份，然后告诉用户这年是瑞年还是平年（什么是瑞年？ 此年能被4整除&&不能被100整除||能被400整除的年份是瑞年）
        while(true){
            String year=test.nextLine();
            if(year==null){
                System.out.println("sorry!您输入正确的年份，才能判断是瑞年还是平年，请重新输入年份：");
                continue;
            }else if(!year.matches("\\d{1,9}")){
                System.out.println("sorry!您输入正确的年份，才能判断是瑞年还是平年，请重新输入年份：");
                continue;
            }
            int years=Integer.parseInt(year);
            if(years % 4 ==0 && years % 100 !=0 || years % 400 == 0)
            {
                System.out.println(years+"是瑞年");
                System.out.println("测试结束，完美");
                break;
            }
            else{
                System.out.println(years+"是平年");
                System.out.println("测试结束，完美");
                break;
            }
        }

    }

}
