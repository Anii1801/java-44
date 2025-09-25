package Unit3;

import java.util.ArrayList;

public class ArrayList1 {
    public static  void main(String[]args){
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(12);
        al.add(13);
        al.add(20);
        for(int alistl:al){
            System.out.println(alistl);
        }
    }
}