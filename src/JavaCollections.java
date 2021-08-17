import java.util.*;

public class JavaCollections {

    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(40);
        list.add(10);

        list.remove(4);
        list.add(4,100);
     //   System.out.println(list);

        List<Integer> list1=new ArrayList<>();
        list1.add(110);
        list1.add(120);
        list1.add(130);
        list1.add(140);

        list.addAll(list1);
        System.out.println(list);

        // Normal way
        Iterator<Integer> itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        Set<Integer> set=new HashSet<>();
        set.add(1000);
        set.add(2000);
        set.add(3000);
        set.add(4000);
        set.add(2000);
        System.out.println(set);
    }
}
