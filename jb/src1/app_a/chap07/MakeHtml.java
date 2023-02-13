import java.io.*;

public class MakeHtml {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line;
            // ���[��1
            System.out.println("<!DOCTYPE html>");
            System.out.println("<html>");
            System.out.println("<head>");
            System.out.println("<title>My Page</title>");
            System.out.println("</head>");
            System.out.println("<body>");
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("��")) {
                    // ���[��3
                    System.out.println("<h1>" + line.substring(1) + "</h1>");
                } else if (line.startsWith("��")) {
                    // ���[��4
                    System.out.println("<h2>" + line.substring(1) + "</h2>");
                } else {
                    // ���[��5
                    System.out.println("<p>" + line + "</p>");
                }
            }
            // ���[��2
            System.out.println("</body>");
            System.out.println("</html>");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
