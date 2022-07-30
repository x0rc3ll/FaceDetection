import org.opencv.core.Core;

import javax.swing.*;

public class ImgShow extends JFrame {
    static{
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        System.out.println("Lib version: " + Core.VERSION);
    }
}
