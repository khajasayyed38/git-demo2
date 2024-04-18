package student_details;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentImpl {
    public static List<Student> getStudent(){
        List<Student> list= new ArrayList<>();
        list.add(new Student(101,"Khaja","Moinuddin","A",150000));
        list.add(new Student(102,"Rahul","Kansure","B",200000));
        list.add(new Student(103,"Pavan","Mane","C",750000));
        list.add(new Student(104,"Vijay","Samadare","D",500000));
        list.add(new Student(105,"Venkatesh","Jadhav","E",600000));
        return list;
    }

    public static void main(String[] args) {
        List<Student> l= getStudent();
//        l.stream().forEach(System.out::println);
        l.stream().filter(student -> student.getFirstName().startsWith("V")).forEach(System.out::println);
        Map<Boolean, List<Student>> v = l.stream().collect(Collectors.groupingBy(student -> student.getFirstName().startsWith("V")));
        System.out.println(v);
        List<Student> collect = l.stream().filter(student -> student.getSalary() > 200000).collect(Collectors.toList());
        System.out.println(collect);

    }
}
