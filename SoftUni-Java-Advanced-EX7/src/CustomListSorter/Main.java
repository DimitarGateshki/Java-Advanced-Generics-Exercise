package CustomListSorter;

import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Box<String> box = new Box<>();

        String input=sc.nextLine();

        while (!input.equals("END")){
            String[] tokens=input.split("\\s+");
            switch (tokens[0]){
                case "Add":
                    box.add(tokens[1]);
                    break;
                case "Remove":
                    int index=Integer.parseInt(tokens[1]);
                    box.remove(index);
                    break;
                case "Contains":
                    System.out.println(box.contains(tokens[1]));
                    break;
                case "Swap":
                    int index1=Integer.parseInt(tokens[1]);
                    int index2=Integer.parseInt(tokens[2]);
                    box.swap(index1,index2);
                    break;
                case "Greater":
                    System.out.println(box.count(tokens[1]));
                    break;
                case "Max":
                    System.out.println(box.getMax());
                    break;
                case "Min":
                    System.out.println(box.getMin());
                    break;
                case "Print":
                    System.out.println(box);
                    break;
                case"Sort":
                    box.sort();
                        break;
            }
            input=sc.nextLine();
        }




    }
}


