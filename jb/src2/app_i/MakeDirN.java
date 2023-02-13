import java.io.*;
import java.nio.file.*;

public class MakeDirN {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("�g�p�@�Fjava MakeDirN �f�B���N�g����");
            System.out.println("��Fjava MakeDirN doc");
            System.exit(0);
        }
        String dirname = args[0];
        try {
            Path path = Files.createDirectory(Paths.get(dirname));
            System.out.println(dirname + "���쐬���܂����B");
            System.out.println("��΃p�X��" + path.toAbsolutePath() + "�ł��B");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
