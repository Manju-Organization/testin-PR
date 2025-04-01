import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineCounter {

    public static void main(String[] args) {
        // Specify the path of the file to read
        String filePath = "path/to/your/file.java"; // Replace with your Java file path
        
        int lineCount = countLinesOfCode(filePath);
        
        if (lineCount >= 0) {
            System.out.println("Total lines of code in the file: " + lineCount);
        } else {
            System.out.println("Error reading the file.");
        }
    }

    public static int countLinesOfCode(String filePath) {
        int lines = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Ignore empty lines or lines with only comments
                if (!line.trim().isEmpty() && !line.trim().startsWith("//") && !line.trim().startsWith("/*")) {
                    lines++;
                }
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
            return -1;
        }

        return lines;
    }
}
