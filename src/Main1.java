import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

// Hello World! 출력
public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write("Hello World!");
        writer.flush();
        writer.close();

//        System.out.println("Hello World!");
    }
}
