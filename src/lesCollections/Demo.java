package lesCollections;

//Collection API -- concept
//Collection -- Interface
//Collections -- Classe


import java.util.*;

public class Demo {
    public static void main(String[] args) {

        /*int num = 5;
        int[] niums = new int[5];
        Set<Integer> nums = new TreeSet<>();
        nums.add(12);
        nums.add(65);
        nums.add(58);
        nums.add(28);
        nums.add(63);
        nums.add(17);

        Iterator<Integer> it = nums.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }


        //System.out.println(nums.indexOf(6));
        //System.out.println(nums.get(2));
        System.out.println(nums);

*//*        for (int n : nums){
            System.out.println(n);
        }*/
        Map<String, Integer> notes = new HashMap<>();
        notes.put("John", 45);
        notes.put("Jane", 23);
        notes.put("Mark",58);
        notes.put("Suzy", 95);
        notes.put("John", 81);

        notes.remove("Jane");

        System.out.println(notes.keySet());

        System.out.println(notes);

        for (String key : notes.keySet()){
            System.out.println(key + " : " + notes.get(key));
        }

    }
}
