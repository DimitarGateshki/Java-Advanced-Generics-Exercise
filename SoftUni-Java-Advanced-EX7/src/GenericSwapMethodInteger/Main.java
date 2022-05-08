package GenericSwapMethodInteger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lines = Integer.parseInt(sc.nextLine());
        int token;
        Box box=new Box();

        for (int i = 0; i < lines; i++) {
            token =Integer.parseInt(sc.nextLine());
            box.add(token);

        }

         String swapper=sc.nextLine();
        String[] index=swapper.split("\\s+");

        box.swap(Integer.parseInt(index[0]),Integer.parseInt(index[1]));

        System.out.println(box.toString());
    }
}

