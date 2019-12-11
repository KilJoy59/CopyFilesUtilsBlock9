import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File src = new File(scanner.next());
        File dst = new File(scanner.next());

        try {
            FileUtils.copyDirectory(src,dst);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
