package Unit3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList <String> products=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of product name:");
        int n=sc.nextInt();
        for (int i=0;i<n;i++) {
            products.add(sc.next());
        }
        Iterator itr=products.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}