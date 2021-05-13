package exercise;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class nowTime{

    public static void main(String[] args) throws InterruptedException {

        Task();
    }

    public static void Task(){
        Runnable task = new Runnable() {
            @Override
            public void run() {
                SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss:SSS");
                String date = format.format(new Date());

                System.out.println(date);

                // substring()取出指定范围的字
                int time = Integer.parseInt(date.substring(17,19));    // 转换数据类型

                System.out.println(time);

                if (time % 2 == 0){
                    try {
                        picn();
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("男");
                }
                else {
                    try {
                        picm();
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("女");
                }
            }
        };
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleAtFixedRate(task,1,1, TimeUnit.SECONDS);
    }

    public static void picn() throws IOException, InterruptedException {
        Runtime runtime = Runtime.getRuntime();
        Process p = runtime.exec("cmd.exe /c D:\\work\\java_work_space\\unit\\src\\exercise\\1.jpg");
        Thread.sleep(3000);
        runtime.exec("taskkill /f /t /im Microsoft.Photos.exe");
    }

    public static void picm() throws IOException, InterruptedException {
        Runtime runtime = Runtime.getRuntime();
        Process listprocess = runtime.exec("cmd.exe /c D:\\work\\java_work_space\\unit\\src\\exercise\\2.png");
        Thread.sleep(3000);
        runtime.exec("taskkill /f /t /im Microsoft.Photos.exe");
    }

}



