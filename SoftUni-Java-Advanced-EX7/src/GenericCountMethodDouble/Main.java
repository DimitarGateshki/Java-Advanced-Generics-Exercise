package GenericCountMethodDouble;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lines = Integer.parseInt(sc.nextLine());
        Double token;
         Box<Double> box=new Box();
         for (int i = 0; i < lines; i++) {
            token =Double.parseDouble(sc.nextLine());
            box.add(token);

        }


        token =Double.parseDouble(sc.nextLine());

        System.out.println(compare(token,box.getBox()));
    }

    public static int compare(Double a, List<Double> b) {
        int count = 0;
        for (Double e : b) {
            if (a<e) {
                count++;
            }
        }
        return count;
    }
}

