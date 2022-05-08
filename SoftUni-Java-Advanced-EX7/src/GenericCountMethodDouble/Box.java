package GenericCountMethodDouble;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private List<T> box;

    public Box() {
        this.box = new ArrayList<>();
    }

    public void add(T e){
        this.box.add(e);
    }
    public void swap(int a,int b){
        T token=box.get(a);
        box.add(a,box.get(b));
        box.remove(a+1);
        box.add(b,token);
        box.remove(b+1);
    }

    public List<T> getBox() {
        return box;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        for (T e:this.box) {
            sb.append(String.format("%s: %s",e.getClass().getName(),e));
            sb.append(System.lineSeparator());
        }
        return String.valueOf(sb);
    }
}
