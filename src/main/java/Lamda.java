import org.w3c.dom.NameList;

import java.util.*;
import java.util.Calendar;
import java.util.stream.*;



public class Lamda {
    public static void main(String arg[]) {
        Timing time1 = new Timing(Arrays.asList(10,12,15),Arrays.asList(11,13,17));
        Timing time2 = new Timing(Arrays.asList(9,12),Arrays.asList(10,13));

        Scanner sc= new Scanner(System.in); //System.in is a standard input stream
        System.out.print("Enter a Name: ");
        String name1= sc.nextLine();
        System.out.print("Enter start of timeslot- ");
        int st_time= sc.nextInt();
        System.out.print("Enter end of timeslot- ");
        int ed_time= sc.nextInt();
        Calendarr C = new Calendarr();
        C.CreateCalendar(new Persons("Tushar",time1));
        C.CreateCalendar(new Persons("Akshay",time2));
        C.Print();
        System.out.println("Available:"+C.IsSlot(name1,st_time,ed_time));
        }
    }

