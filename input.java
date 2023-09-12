import java.util.Scanner;
import java.io.*;

public class input {
    public static void main(String[] args) {

        File file = new File("out.txt");
        Scanner sc = new Scanner(file);
        int i = sc.nextInt();
        System.out.println(i * 1000);
        sc.close();
    }

}
