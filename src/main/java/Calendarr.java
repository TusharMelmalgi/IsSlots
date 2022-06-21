
import java.util.*;

public class Calendarr {
    List<Persons> listofpersons = new ArrayList<>();

    public void CreateCalendar(Persons person1){

        listofpersons.add(person1);
    }
    public void Print(){
        for(Persons l1:listofpersons){
            System.out.println(l1.name+":"+l1.time.startTime+"-"+l1.time.endTime);
        }
    }


    boolean IsSlot(String name1,Integer a,Integer b){
        Persons required_p = null;  //a and b are start and end time for new appointment
        for(Persons l:listofpersons)
            if(l.name.equalsIgnoreCase(name1)){
                required_p = l;
                break;
            }
        if (required_p==null) {
            System.out.println("No such user");
            return false;
        }
        int n = required_p.time.startTime.size();
        for (int i = 0;i<n;i++) {
            int starttime = required_p.time.startTime.get(i);
            int endtime = required_p.time.endTime.get(i);
            if ( starttime< a && a < endtime || starttime < b && b < endtime)
                return false;
            else if (a == starttime || b == endtime)
                return false;
        }
        return true;
        
    }
}
