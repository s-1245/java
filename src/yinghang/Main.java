package yinghang;

import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        long yinhangkahao = 10000000L;
        float maney = 0;
        Scanner in=new Scanner(System.in);
        List<User> list = new ArrayList();

//        接受用户输入
        while (true){
//        调用界面类 展示界面
            JieMian.yinjiemian();
            int input = UserInput.input();
            if (input == 1){
                System.out.println("输入银行名称：");
                String bankName = in.next();

                System.out.println("输入你的ID：");
                String id = in.next();

                System.out.println("输入你的密码：");
                String passwd = in.next();
                yinhangkahao += 1;
                Bank bank = new Bank(yinhangkahao,bankName);
                User user = new User(id,passwd,bank,maney);
                list.add(user);
            } else if (input == 2){
                System.out.println("输入你的ID：");
                String id = in.next();
                for (User user:list){
                    if (user.getId().equals(id)){
                        System.out.println("新密码：");
                        String newPasswd = in.next();
                        user.setPasswd(newPasswd);
                    }
                    System.out.println("新密码为:"+user.getPasswd());
                }
            }else if (input == 3){
                System.out.println("输入你的ID：");
                String id = in.next();
                for (User user:list){
                    if (user.getId().equals(id)){
                        maney = user.getManey();
                        System.out.println("要存入多少钱：");
                        float cmaney = in.nextFloat();
                        maney += cmaney;
                        user.setManey(maney);
                    }
                    System.out.println("账户余额为:"+maney);
                }
            }else if (input == 4){
                System.out.println("输入你的ID：");
                String id = in.next();
                for (User user:list){
                    if (user.getId().equals(id)){
                        maney = user.getManey();
                        System.out.println("要取入多少钱：");
                        float cmaney = in.nextFloat();
                        maney -= cmaney;
                        user.setManey(maney);
                    }
                    System.out.println("账户余额为:"+maney);
                }
            }else if (input == 5){
                System.out.println("成功退出");
                break;
            }else{
                System.out.println("您的输入有误");
                Thread.sleep(1000);
            }
        }
    }
}
