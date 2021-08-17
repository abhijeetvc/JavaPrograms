import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaMap {
    public static void main(String[] args) {

        List<Map<String,Object>> mapList=new ArrayList();

        Map<String,String> map1=new HashMap();
        map1.put("A","Apple");  // Entry
        map1.put("B","Bat");
        map1.put("C","Cat");

        for(Map.Entry entry:map1.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}

// Iteration of List<Map<String,Object>>
// Stack using Java -> Collection