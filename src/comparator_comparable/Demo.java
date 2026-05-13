package comparator_comparable;

import java.util.*;

class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "age=" + age + ", name='" + name + '\'';
    }

    @Override
    public int compareTo(Student that) {
        return this.name.compareTo(that.name);
    }
}

public class Demo {
    public static void main(String[] args) {
        /*List<Integer> nums = Arrays.asList(32,15,27,16,91);
        Comparator<Integer> com = (i,j) -> (i%10 > j%10) ? 1 : -1;

        Collections.sort(nums, (i,j) -> (i%10 > j%10) ? 1 : -1);
        System.out.println(nums);*/

        /*Student s1 = new Student(20, "John");
        System.out.println(s1);*/

        List<Student> stds = new ArrayList<>();
        stds.add(new Student(20, "aaa"));
        stds.add(new Student(18, "bb"));
        stds.add(new Student(22, "cccc"));
        stds.add(new Student(15, "d"));

        //1ere methode : tri personnalisée à travers Comparator et Collections.sort(list, comparator)
        /*Comparator<Student> com1 = (s1,s2) -> s1.name.length() - s2.name.length(); //si le resultat positif : swap sinon pas de swap
        Comparator<Student> com2 = (s1,s2) -> s1.name.compareTo(s2.name);
        Comparator<Student> com3 = (s1,s2) -> s1.age - s2.age;

        Collections.sort(stds, com3);
        System.out.println(stds);*/

        /*String str1 = "Apple";
        String str2 = "Banana";
        System.out.println(str1.compareTo(str2));*/

        //2eme méthode : implementer l'interface Comparable / redefinir la methode compareTo / Collections.sort(list)

        /*Collections.sort(stds);
        System.out.println(stds);*/

        //3eme methode : Comparator.comparing()

        stds.sort(Comparator.comparing(Student::getAge));
        System.out.println(stds);

        stds.sort(Comparator.comparing(Student::getName));
        System.out.println(stds);



    }
}
