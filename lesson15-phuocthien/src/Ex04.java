import model.DataModel;
import model.Student;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex04 {
    public static void main(String[] args) {

        List<Student> list1 = DataModel.getStudent();
        System.out.println("cac hoc sinh co diem tang dan");
        List<Student> list2 = list1.stream().sorted((o1, o2) -> Float.compare(o1.getDiem(), o2.getDiem())).collect(Collectors.toList());
        printList_set(list2);
        System.out.println("cac hoc sinh diem >8");
        List<Student> list3 = list1.stream().filter(student -> student.getDiem() >8.0f).collect(Collectors.toList());
        printList_set(list3);
        System.out.println("cac hoc sinh nu");
        List<Student> list4 = list1.stream().filter(student -> "Nu".equals(student.getGioitinh())).collect(Collectors.toList());
        printList_set(list4);
        Map<Student,Integer> map ;
    }

    public static <E> void printList_set(Collection<E> list) {
        for (E element : list) {
            System.out.println(element);
        }
    }
}
