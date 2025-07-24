package cursoJavaCompleto.Arquivos;

import java.io.File;
import java.util.Scanner;

public class InfoPathFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a file path:");
        String filePath = scanner.nextLine();
        
        File path = new File(filePath);

        System.out.println("getName: " + path.getName());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getPath: " + path.getPath());
        
        scanner.close();
    }
}
