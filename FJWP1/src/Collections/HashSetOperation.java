package Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetOperation {
    public static void main(String[] args) {
       
        Set<Integer> numberSet = new HashSet<>();

       
        numberSet.add(5);
        numberSet.add(10);
        numberSet.add(15);
        numberSet.add(20);
        numberSet.add(25);

       
        System.out.println("Elements in the HashSet: " + numberSet);

     
        if (numberSet.contains(10)) {
            System.out.println("HashSet contains the number 10");
        } else {
            System.out.println("HashSet does not contain the number 10");
        }

       
        numberSet.remove(15);

        
        System.out.println("Size of the HashSet: " + numberSet.size());
    }
}