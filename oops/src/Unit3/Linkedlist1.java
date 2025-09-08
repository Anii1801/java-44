package Unit3;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
public class Linkedlist1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedlist1 = new LinkedList<>();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            linkedlist1.add(sc.nextInt());
            Iterator itr=linkedlist1.listIterator();
            while(itr.hasNext())
            {
                System.out.println(itr.next());
            }
        }

    }
}