import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.imgcodecs.Imgcodecs;

import javax.swing.*;
import java.awt.*;

public class ImgShow extends JFrame {
    static{
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        System.out.println("Lib version: " + Core.VERSION);
    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        JLabel screen = new JLabel();

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

        Mat img = Imgcodecs.imread("src/butterfly.png");

        //конвертируем img в матрицу
        MatOfByte buf = new MatOfByte();
        Imgcodecs.imencode(".png", img, buf);

        ImageIcon ic = new ImageIcon(buf.toArray());

        //создаем контейнер с img и привязываем его к окну
        screen.setIcon(ic);
        window.getContentPane().add(screen);
        window.pack();
    }
}
