package GenericBoxOfInteger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lines = Integer.parseInt(sc.nextLine());
        int token;
        Box<Integer> box = new Box<>();

        for (int i = 0; i < lines; i++) {
            token =Integer.parseInt(sc.nextLine());
            box.add(token);

        }

        System.out.println(box.toString());
    }
}

