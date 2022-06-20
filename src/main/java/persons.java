import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

class timing{
    public List<Integer> starttime;
    public List<Integer> endtime;
    timing(List starttime,List endtime){
        this.starttime = starttime;
        this.endtime = endtime;
    }
}
public class persons {
    public String Name;
    public timing T;

    persons(String Name, timing T) {
        this.Name = Name;
        this.T= T;

    }
}
