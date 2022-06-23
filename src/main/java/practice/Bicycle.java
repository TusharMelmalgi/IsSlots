package practice;
import java.util.*;

public class Bicycle{
    int cadence;
    int speed;
    int gear;

    Bicycle(Integer cadence,Integer speed,Integer gear){
        this.cadence = cadence;
        this.speed = speed;
        this.gear = gear;
    }
    void changeCadence(Integer newCadence){
        cadence = newCadence;
    }
    void changeGear(Integer newGear){
        gear = newGear;
    }
    void speedUp(Integer increment){
        speed+=increment;
    }
    void printAll(){
        System.out.println("cadence:"+cadence+"\n"+"gear:"+gear+"\n"+"speed:"+speed);
    }
}
class Mountainbike extends Bicycle{
    int tireWidth;
    Mountainbike(int cadence,int gear,int speed,int tireWidth){
        super(cadence,gear,speed);
        this.tireWidth = tireWidth;
    }


}
