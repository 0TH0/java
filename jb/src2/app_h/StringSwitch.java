public class StringSwitch {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("�g����: java StringSwitch ���ݕ�");
        } else {
            String str = args[0];
            System.out.printf("���͂��ꂽ������� %s �ł��B%n", str);
            switch (str) {
            case "orange":
                System.out.println("�I�����W�ł��ˁB");
                break;

            case "coffee":
                System.out.println("�R�[�q�[�ł��ˁB");
                break;

            case "tea":
                System.out.println("�����ł��ˁB");
                break;

            default:
                System.out.println("���ݕ��ɂ� orange, coffee, tea �̂ǂꂩ���w�肵�Ă��������B");
                break;
            }
        }
    }
}
