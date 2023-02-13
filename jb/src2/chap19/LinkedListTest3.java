import java.util.*;

public class LinkedListTest3 {
    public static void main(String[] args) {
        // Queue�Ƃ���LinkedList�̃C���X�^���X���m�ۂ���
        Queue<String> queue = new LinkedList<String>();

        // �v�f�̒ǉ�(add���\�b�h)
        queue.add("Alice");
        System.out.println("add���queue = " + queue);
        queue.add("Bob");
        System.out.println("add���queue = " + queue);
        queue.add("Chris");
        System.out.println("add���queue = " + queue);
        queue.add("Diana");
        System.out.println("add���queue = " + queue);

        try {
            while (true) {
                // �擪�v�f�̎Q��(element���\�b�h)
                String name = queue.element();
                System.out.println("element�̖߂�l = " + name);

                // �v�f�̒��o�ƍ폜(remove���\�b�h)
                name = queue.remove();
                System.out.println("remove�̖߂�l = " + name);
                System.out.println("remove���queue = " + queue);
            }
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }
}
