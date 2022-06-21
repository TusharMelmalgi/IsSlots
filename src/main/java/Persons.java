import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

class Timing{
    List<Integer> startTime;
    List<Integer> endTime;
    Timing(List<Integer> startTime,List<Integer> endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
public class Persons {
    public String name;
    public Timing time;

    Persons(String name, Timing time) {
        this.name = name;
        this.time= time;

    }
}
