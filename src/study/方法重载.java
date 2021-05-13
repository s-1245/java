package study;

public class 方法重载 {

    public static void main(String[] args) {
        U u = new U();
        u.p(5);
        u.p("5");
        u.p(false);
    }

    static class U{
        public void p(byte b){
            System.out.println(b);
        }
        public void p(boolean b){
            System.out.println(b);
        }
        public void p(double b){
            System.out.println(b);
        }
        public void p(String b){
            System.out.println(b);
        }
        public void p(int b){
            System.out.println(b);
        }
    }
}

