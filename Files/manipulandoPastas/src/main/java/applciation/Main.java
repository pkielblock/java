package applciation;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Folder path: ");
        String strPath = sc.nextLine();

        //File can be both a file or a folder
        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);

        System.out.println();
        System.out.println("FOLDERS: ");
        for (File folder : folders) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);

        System.out.println();
        System.out.println("FILES: ");
        for (File file : files) {
            System.out.println(file);
        }

        boolean success = new File(strPath + "/javaCreatingFile").mkdir();

        System.out.println();
        if (success) {
            System.out.println("Dir created");
        } else {
            System.out.println("Dir not created");
        }

        sc.close();
    }
}