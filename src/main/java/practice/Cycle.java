package practice;

public interface Cycle {
    void printAll();
    void setTireWidth(int newValue);
    void speedUp(int increment);
}
class RoadBike extends Bicycle{
    int tireWidth;
    int speed;
    RoadBike(int cadence, int gear,int tireWidth,int speed){
        super(cadence,gear,speed);
        this.tireWidth = tireWidth;

    }
    public void printAll(){
        System.out.println("speed:"+speed+"\n tirewidth:"+tireWidth);
    }

    public void setTireWidth(int newValue) {
        this.tireWidth = newValue;
    }

    public void speedUp(int increment) {
        this.speed +=increment;
    }

}
