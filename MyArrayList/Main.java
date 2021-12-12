package MyArrayList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Size = ");
        int size = +scanner.nextInt();
        MyArrayList list = new MyArrayList(size);
        System.out.println(list.size());
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(0, 'a');
        System.out.println(list.toString());
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list.isEmpty());
    }
}