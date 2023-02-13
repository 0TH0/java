import java.io.*;
import java.nio.file.*;

public class DeleteFileN {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("�g�p�@�Fjava DeleteFileN �폜�t�@�C��");
            System.out.println("��Fjava DeleteFileN trash.txt");
            System.exit(0);
        }
        String filename = args[0];
        try {
            Path path = Paths.get(filename);
            Files.delete(path);
            System.out.println(filename + "���폜���܂����B");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
