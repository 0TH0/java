import java.io.*;

public class Drink4 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("���ݕ��͉����D���ł����H");
            System.out.println("�I�����W�W���[�X(orange)");
            System.out.println("�R�[�q�[(coffee)");
            System.out.println("�ǂ���ł��Ȃ�(other)");
            System.out.println("orange,coffee,other�̂ǂꂩ��I��ł��������B");
            String line = reader.readLine();
            switch (line) {
            case "orange":
                System.out.println("�I�����W�W���[�X�ł��B");
                break;

            case "coffee":
                System.out.println("�R�[�q�[�ł��B");
                break;

            default:
                System.out.println("�ǂ���ł�����܂���B");
                break;
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
