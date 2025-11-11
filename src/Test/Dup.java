package Test;

import java.util.HashMap;
import java.util.Map;

public class Dup {

    public static void main(String[] args) {

        int array[] = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,6};

        Map<Integer,Integer> duplicates = new HashMap<>();

        for (int num:array) {

            if(duplicates.containsKey(num)) {

                duplicates.put(num, duplicates.get(num)+1);
            }
            else
                duplicates.put(num,1);
        }
        System.out.println(duplicates);
    }
}
