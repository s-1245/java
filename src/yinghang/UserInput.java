package yinghang;

import java.util.Scanner;

public class UserInput {
    static int input (){
        Scanner in=new Scanner(System.in);
        System.out.println("输入你的选择：");
        int a = in.nextInt();
        return a;
    }
}
