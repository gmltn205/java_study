import java.util.Scanner;

public class input_java {
    public static void main(String[] args) {
        System.out.println("이름 도시 체중 독신여부!");

        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println(name);

        int x, y;
        x = 0;
        y = 1;
        int s = (x > y) ? 1 : -1;
        System.out.println(s);
    }
}
