package CustomList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Box<T extends Comparable<T>> {
    private List<T> box;



    public Box() {
        this.box=new ArrayList<T>();
    }



    public  void add(T element){
        this.box.add(element);
    }

    public  void remove(int place){
        if (place>this.box.size()-1){
            throw new IllegalStateException("Invalid index!!!");
        }
        this.box.remove(place);
    }



    public void swap(int first , int second){
        if (first<0){
            return;
        }else if(second>this.box.size()-1){
            return;
        }
        T temp=this.box.get(first);
        T temp2=this.box.get(second);
        this.box.add(first,temp2);
        this.box.remove(first+1);
        this.box.add(second,temp);
        this.box.remove(second+1);
        return;
    }

    public  void sort(){
        Collections.sort(this.box);
    }

    public  int count(T element){
        int count=0;
        for (T el:this.box) {
            if (el.compareTo(element)>0){
                count++;
            }
        }
        return count;

    }


    public boolean contains(T element){
        for (T el:this.box) {
            if (el.compareTo(element)==0){
                return true;
            }
        }
        return false;
    }


    public T getMax(){
        if (this.box.isEmpty()){
            throw new IllegalStateException("Empty list!!!");
        }
        T max=this.box.get(0);
        for (T el:this.box) {
            if (max.compareTo(el)<0){
                max=el;
            }
        }
        return max;

    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < this.box.size(); i++) {
            sb.append(this.box.get(i));
            if (i!=this.box.size()-1){
                sb.append(System.lineSeparator());
            }
        }

        return sb.toString();
    }

    public T getMin(){
        if (this.box.isEmpty()){
            throw new IllegalStateException("Empty list!!!");
        }
        T min=this.box.get(0);
        for (T el:this.box) {
            if (min.compareTo(el)>0){
                min=el;
            }
        }
        return min;

    }




}
