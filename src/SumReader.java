import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SumReader {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Path.of("inputs.txt"));
        if (lines.size() < 2) {
            throw new IllegalStateException("inputs.txt must contain at least 2 lines (two integers).");
        }

        int a = Integer.parseInt(lines.get(0).trim());
        int b = Integer.parseInt(lines.get(1).trim());
        int sum = a + b;

        String out = "Sum: " + sum;
        System.out.println(out);

        Files.writeString(Path.of("sum.txt"), out + System.lineSeparator());
        System.out.println("Saved result to sum.txt");
    }
}

