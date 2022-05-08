package GenericSwapMethodString;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lines = Integer.parseInt(sc.nextLine());
        String token;
        Box<String> box=new Box<>();

        for (int i = 0; i < lines; i++) {
            token =sc.nextLine();
            box.add(token);
        }

        token=sc.nextLine();
        String[] index=token.split("\\s+");

        box.swap(Integer.parseInt(index[0]),Integer.parseInt(index[1]));
        System.out.println(box.toString());




    }
}
