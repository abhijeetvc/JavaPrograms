import java.util.Arrays;
import java.util.List;

public class MethodReference {

    public static void main(String[] args) {

        List<String> myList= Arrays.asList("India","US","Japan","France");

//        for(int i=0;i<myList.size();i++){
//            System.out.println(myList.get(i));
//        }

//        for(String s:myList){
//            System.out.println(s);
//        }

      //  myList.forEach(str-> System.out.println(str));
      //  myList.forEach(System.out::println);

      //  myList.forEach(CheckMReference::display);
        CheckMReference c=new CheckMReference();
        myList.forEach(c::display1);
    }
}

class CheckMReference{

    public static void display(String s){
        System.out.println(s);
    }

    public void display1(String str){
        System.out.println(str);
    }
}