import java.util.ArrayList;
import java.util.List;

public class Trial1 {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        list1.add(2);
        list1.add(3);
        list1.add(2);
        list1.add(2);
        list1.add(5);

        List<Integer>list2=new ArrayList<>();
        for(Integer w:list1){
            if(!list2.contains(w)){
                list2.add(w);
            }
        }
        System.out.println(list2);//[2, 3, 5]

    }
}
