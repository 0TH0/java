import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class ListDirN {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("�g�p�@�Fjava ListDirN �f�B���N�g����");
            System.out.println("��Fjava ListDirN doc");
            System.exit(0);
        }
        String dirname = args[0];
        try {
            try (DirectoryStream<Path> dirs = Files.newDirectoryStream(Paths.get(dirname))) {
                for (Path path : dirs) {
                    System.out.println(path);
                }
            } catch (DirectoryIteratorException e) {
                throw e.getCause();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
