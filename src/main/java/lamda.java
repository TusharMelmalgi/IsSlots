import org.w3c.dom.NameList;

import java.util.*;
import java.util.stream.*;
import java.util.function.Consumer;
class person{
    public String Name;
    public Hashtable<Integer, Integer> dict = new Hashtable<Integer,Integer>();

    person(String Name,Hashtable dict){
        this.Name = Name;
        this.dict = dict;

    }
    boolean isSlot(Integer a,Integer b){
        Integer k,v = 0,flag=0;
        Set<Integer> keys = dict.keySet();
        for (Integer ke:keys) {
            v = dict.get(ke);
            if (ke < a && a < v || ke < b && b < v)
                return true;
            else if (a == ke || b == v)
                return false;
        }
        return true;

    }
}
public class lamda {
    public static void main(String arg[]) {
        Hashtable<Integer,Integer> dict1  = new Hashtable<>();
        dict1.put(12,14);
        dict1.put(9,10);
        dict1.put(10,11);
        List<person> list1 = new ArrayList<person>();
        person p1 = new person("Tushar",dict1);
        list1.add(p1);
        Hashtable<Integer,Integer> dict2  = new Hashtable<>();
        dict2.put(10,12);
        dict2.put(13,14);
        list1.add(new person("Akshay",dict2));
        System.out.print("The calender is:");
        for(person l:list1){
            System.out.println(l.Name+":"+l.dict);
        }
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream
        System.out.print("Enter a Name: ");
        String name1= sc.nextLine();
        System.out.print("Enter first number- ");
        int x= sc.nextInt();
        System.out.print("Enter second number- ");
        int y= sc.nextInt();
        for(person l:list1){
            if(l.Name.equalsIgnoreCase(name1))
                System.out.println(l.isSlot(x,y));
        }
    }
}
