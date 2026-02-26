import java.io.FileWriter;
import java.io.IOException;
public class InputWriter {
    public static void main(String[] args) throws IOException {

        int a=10, b=10;

        try (FileWriter fw = new FileWriter("inputs.txt")) {
            fw.write(a + System.lineSeparator());
            fw.write(b + System.lineSeparator());
        }

        System.out.println("Saved inputs to inputs.txt: " + a + ", " + b);
    }
}
