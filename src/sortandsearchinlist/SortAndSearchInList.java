
package sortandsearchinlist;

import java.util.ArrayList;
import java.util.Collections;

public class SortAndSearchInList {
     
    public static void main(String[] args) {
        
        ArrayList<Student> studentArr = new ArrayList<>();//implementirame comparable
        //i koristime compareTo za sporedba vnatre vo nizata
        
        studentArr.add(new Student("Kalleeee",45));
        studentArr.add(new Student("Olle",35));
        studentArr.add(new Student("Larrrs",25));
        studentArr.add(new Student("Mat",15));
        
        studentArr.sort(null);//ne prakame komparator, sortirame so null
        Collections.sort(studentArr);//so kolekcii sort
        
        System.out.println(studentArr);
  
        for (Student student : studentArr) {//gi dava edno pod drugo
            System.out.println(student);
            
        }
    }      
}
  

    

