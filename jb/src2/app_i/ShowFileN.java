import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;

public class ShowFileN {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("�g�p�@�Fjava ShowFileN �t�@�C��");
            System.out.println("��Fjava ShowFileN ShowFileN.java");
            System.exit(0);
        }
        String filename = args[0];
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(filename), Charset.defaultCharset())) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (NoSuchFileException e) {
            System.out.println(filename + "��������܂���B");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
