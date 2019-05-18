import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Driver {
    public static void main(String args[]) throws IOException {
        final String PATH = "C:\\Users\\Dauren\\Desktop\\STUDY\\2NDDDDDDD\\SPRING\\Software Design&Patterns\\lab3-decorator pattern v2\\src\\file.txt";
        int c;
        try {
            InputStream in =
                    new UpperCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream(PATH)));

            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
