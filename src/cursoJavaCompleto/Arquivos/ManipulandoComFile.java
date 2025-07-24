package cursoJavaCompleto.Arquivos;

import java.io.File;
import java.util.Scanner;

public class ManipulandoComFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o caminho do arquivo: ");
        String strPath = scanner.nextLine();

        File path = new File(strPath);
        
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Folders: ");
        for (File folder : folders) {
            System.out.println(folder);
        }
        
        File[] files = path.listFiles(File::isFile);
        System.out.println("Files: ");
        for (File file : files) {
            System.out.println(file);
        }
        
        boolean success = new File(strPath + "\\subdir").mkdir();
        if (success) {
            System.out.println("Subdirectory created successfully!");
        } else {
            System.out.println("Failed to create subdirectory or it already exists.");
        }
        
        scanner.close();
    }
}
