package Unit3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class StudentObjects {
    public static void main(String[] args) {
        ArrayList<Student> stobj=new ArrayList<>();
        stobj.add(new Student(21,"Vijay",100));
        stobj.add(new Student(11,"Anjay",1));
        stobj.add(new Student(40,"Khushi",136));
        stobj.add(new Student(19,"Anju",120));
        stobj.add(new Student(81,"Anirudh",125));
        stobj.add(new Student(41,"Ajay",134));
        Collections.sort(stobj);
        for(Student st:stobj){
            System.out.println("Name-"+st.name+", Age-"+st.age+", Roll-"+st.rollNo);
        }
    }

}
