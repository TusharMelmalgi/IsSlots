import sun.security.util.Length;

import java.util.*;

public class Calendarr {
    List<Integer> l1 = new ArrayList<Integer>();
    timing t1 = new timing(Arrays.asList(10,12,15),Arrays.asList(11,13,17));
    timing t2 = new timing(Arrays.asList(9,12),Arrays.asList(10,13));
    List<persons> listofpersons = new ArrayList<persons>();
    public void createCalendar(){

        listofpersons.add(new persons("Akshay",t2));
        listofpersons.add(new persons("tushar",t1));

    }
    public void print(){
        for(persons l1:listofpersons){
            System.out.println(l1.Name+":"+l1.T.starttime+"-"+l1.T.endtime);
        }
    }


    boolean isSlot(String name1,Integer a,Integer b){
        persons required_p = null;  //a and b are start and end time for new appointment
        for(persons l:listofpersons)
            if(l.Name.equalsIgnoreCase(name1)){
                required_p = l;
                break;
            }
        int n = required_p.T.starttime.size();
        for (int i = 0;i<n;i++) {
            int starttime = required_p.T.starttime.get(i);
            int endtime = required_p.T.endtime.get(i);
            if ( starttime< a && a < endtime || starttime < b && b < endtime)
                return false;
            else if (a == starttime || b == endtime)
                return false;
        }
        return true;
        
    }
}
