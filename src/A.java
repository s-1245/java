import com.sun.javafx.iio.ImageStorage;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.image.BufferedImage;
import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class A {
    public static void main(String[] args) throws IOException {

        BufferedImage bufferedImage1 = ImageIO.read(new File("D:\\work\\java_work_space\\unit\\src\\exercise\\2.png"));
        BufferedImage bufferedImage2 = ImageIO.read(new File("D:\\work\\java_work_space\\unit\\src\\exercise\\1.jpg"));

        ImageIcon imageIcon1 = new ImageIcon();
        ImageIcon imageIcon2 = new ImageIcon();

        imageIcon1.setImage(bufferedImage1);
        imageIcon2.setImage(bufferedImage2);
        JLabel jLabel = new JLabel();

        JFrame jFrame = new JFrame();
        jFrame.setSize(600, 480);
        Container container = jFrame.getContentPane();
        container.add(jLabel);

        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LocalDateTime time = LocalDateTime.now();
                int tmp = time.getSecond();
                if(tmp%2==0) {
                    jLabel.setIcon(imageIcon1);
                    System.out.println(tmp + " : " + e);
                } else {
                    jLabel.setIcon(imageIcon2);
                    System.out.println(tmp + " : " + e);
                }
            }
        });

        timer.start();

        jFrame.setVisible(true);

    }
}
