import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;

public class CalendarTest {
    /*
person not in calendar - return false
time extends between 2 slots - return false
time overlaps on top of slot - return false
time independent of other slots -return true
    */
    @Test
    public void isSlotTest_personNotInCalendar(){

        Calendarr testCalendar = new Calendarr();
        int startTime = 9;
        int endTime = 10;
        String personNameNotInCalendar = "test";
        boolean slotAvailable = testCalendar.isSlot(personNameNotInCalendar,startTime,endTime);
        Assertions.assertFalse(slotAvailable);
    }
    @Test
    public void isSlotTest_timeOverlapsSlots(){
        Timing time1 = new Timing(Arrays.asList(9,12,15),Arrays.asList(11,13,16));
        Calendarr cal = new Calendarr();
        cal.createCalendar(new Persons("Tushar",time1));
        int startTime = 15;
        int endTime = 16;
        String personNameInCalendar = "Tushar";
        boolean slotAvailable = cal.isSlot(personNameInCalendar,startTime,endTime);
        Assertions.assertFalse(slotAvailable);
    }

    /*@Test
    public void isSlotTest_timeCompletelyOverlapsSlot(){
        Timing time1 = new Timing(Arrays.asList(9,12,15),Arrays.asList(11,13,16));
        Calendarr cal = new Calendarr();
        cal.createCalendar(new Persons("Tushar",time1));
        int startTime = 9;
        int endTime = 11;
        String personNameInCalendar = "Tushar";
        boolean slotAvailable = cal.isSlot(personNameInCalendar,startTime,endTime);
        Assertions.assertFalse(slotAvailable);
    }*/
    @Test
    public void isSlotTest_timeSlotAvailable(){
        Timing time1 = new Timing(Arrays.asList(9,12,15),Arrays.asList(11,13,16));
        Calendarr cal = new Calendarr();
        cal.createCalendar(new Persons("Tushar",time1));
        int startTime = 11;
        int endTime = 12;
        String personNameInCalendar = "Tushar";
        boolean slotAvailable = cal.isSlot(personNameInCalendar,startTime,endTime);
        Assertions.assertTrue(slotAvailable);
    }

}
