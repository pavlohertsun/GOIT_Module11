import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NamesFileReader {
    public List<String> readNamesFromFile(String fileName){
        List<String> names = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                names.add(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("no such file");
            e.printStackTrace();
        }
        return names;
    }
}
