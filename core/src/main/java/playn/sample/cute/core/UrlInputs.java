package playn.sample.cute.core;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/**
 * Created by vrostov on 27.07.2017.
 */
public class UrlInputs {

    public static void main(String[] args) throws Exception{
        InputStream inputStream=new URL("https://yastatic.net/morda-logo/i/citylogos/yano2-logo-ru.png").openStream();
        FileWriter fileWriter=new FileWriter("c:/1.png");
        OutputStream outputStream=new FileOutputStream("tests.png");

    }


}
