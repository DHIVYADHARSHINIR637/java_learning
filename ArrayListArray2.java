import java.util.ArrayList;
import java.util.Arrays;
class ArrayListArray2{
    public static void main(String[]  args)
    {
        
        ArrayList<String> list1=new ArrayList<>(Arrays.asList("watermelon"));
        list1.add("drange");
        list1.add("orange");
        list1.add("grapes");
        list1.add("apple");
        list1.add("jerry");
        ArrayList<String> list2=new ArrayList<>(Arrays.asList("watermelon"));
        list2.add("drange");
        list2.add("mango");
        list2.add("orange");
        list2.add("grapes");
        list2.add("apple");
        list2.add("jerry");
        list1.retainAll(list2);
         
        System.out.println(list1+" ");
    
    }
        
}
