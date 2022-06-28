
import java.util.*;

public class Calendarr {
    //List<Persons> listOfPersons = new ArrayList<>();
    HashMap<String,Persons> calendarSchedule = new HashMap<>();

    public void createCalendar(Persons person1){

        //listOfPersons.add(person1);
        calendarSchedule.put(person1.name,person1);
    }
    public void print(){
        /*for(Persons l1:listOfPersons){
            System.out.println(l1.name+":"+l1.time.startTime+"-"+l1.time.endTime);
        }*/
        for (Map.Entry<String, Persons> entry : calendarSchedule.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue().time.startTime+"-"+entry.getValue().time.endTime);

        }
    }
    /*boolean isPerson(Persons p1){


    }*/


    boolean isSlot(String name1,Integer a,Integer b){
        Persons requiredPerson = null;  //a and b are start and end time for new appointment
        /*for(Persons l:listOfPersons)
            if(l.name.equalsIgnoreCase(name1)){
                requiredPerson = l;
                break;
            }*/
        requiredPerson = calendarSchedule.get(name1);
        if (requiredPerson==null) {
            System.out.println("No such user");
            return false;
        }
        int n = requiredPerson.time.startTime.size();
        for (int i = 0;i<n;i++) {
            int starttime = requiredPerson.time.startTime.get(i);
            int endtime = requiredPerson.time.endTime.get(i);
            if ( starttime< a && a < endtime || starttime < b && b < endtime)
                return false;
            else if (a == starttime || b == endtime)
                return false;
        }
        return true;
        
    }
}



