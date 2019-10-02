

import java.io.File;
import net.sourceforge.tess4j.*;

public class TesseractExample {

    public static void main(String[] args) {
        File imageFile = new File("C:\\Users\\Public\\Pictures\\Capture.png");
        ITesseract instance = new Tesseract();  // JNA Interface Mapping
        // ITesseract instance = new Tesseract1(); // JNA Direct Mapping
       // instance.setDatapath("C:\\Users\\acer\\Desktop\\Tess4J-3.4.8-src\\Tess4J\\tessdata\\eng.traineddata"); // path to tessdata directory
        instance.setLanguage("eng");
        try {
            String result = instance.doOCR(imageFile);
            System.out.println(result);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
    }
}