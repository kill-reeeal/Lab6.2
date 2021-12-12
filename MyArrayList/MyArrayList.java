package MyArrayList;

import java.util.Arrays;

public class MyArrayList {
    private Object[] list;
    private int size;

    MyArrayList(){};
    MyArrayList(int size){
        list = new Object[size];
    }

    public void clear(){
        list = new Object[0];
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        if (size == 0)
            return true;
        else
            return false;
    }
    public void add (Object item){
        Object[] list1 = new Object[list.length + 1];
        for (int i = 0; i < list.length; i++) {
            list1[i] = list[i];
        }
        list = list1;
        list[size] = item;
        size++;
    }

    public void add (int index, Object item){
        Object[] list1 = new Object[list.length + 1];
        for (int i = 0; i < index; i++) {
            list1[i] = list[i];
        }
        list1[index] = item;
        for (int i = index + 1; i < list.length + 1; i++) {
            list1[i] = list[i - 1];
        }
        list = list1;
        size++;
    }

    public String toString(){
        return Arrays.toString(list);
    }
}