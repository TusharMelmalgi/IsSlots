import org.w3c.dom.NameList;

import java.util.*;
import java.util.Calendar;
import java.util.stream.*;



public class lamda {
    public static void main(String arg[]) {
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream
        System.out.print("Enter a Name: ");
        String name1= sc.nextLine();
        System.out.print("Enter start of timeslot- ");
        int st_time= sc.nextInt();
        System.out.print("Enter end of timeslot- ");
        int ed_time= sc.nextInt();
        Calendarr C = new Calendarr();
        C.createCalendar();
        C.print();
        System.out.println("Available:"+C.isSlot(name1,st_time,ed_time));
        }
    }

