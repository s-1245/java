package study;

/*
    方法递归
        自己调自己
            a{
                a()
            }
 */

public class 方法递归 {
    public static void main(String[] args) {
        //递归演示
        //doSome();

//        1-N的和不用递归
//        int a = countNo(10);
//        System.out.println(a);

//        1-N的和用递归
//        int i = 1;
//        int result = 0;
//        countYes(i,result)

//        方法2：1-N的和用递归
//        int n = 10;
//        int result = newcountYes(n);
//        System.out.println(result);
    }

    public static void doSome(){
        System.out.println("doSome begin");
        System.out.println("doSome over");
        doSome();
    }

    public static int countNo(int n){
        int result = 0;
        for (int i =1;i<=n;i++){
            result += i;
        }
        return result;
    }

    private static void countYes(int n ,int result) {
        result += n;
        if (n == 10){
            System.out.println(result);
        }else {
            n += 1;
            System.out.println(n);
            countYes(n,result);
        }
    }

    private static int newcountYes(int n){
        if(n ==1){
            return 1;
        }
        return n + newcountYes(n-1);
    }

}
