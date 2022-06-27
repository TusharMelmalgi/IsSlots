package practice;

import org.openjdk.jol.vm.VM;

class SingletonExample {
    private static SingletonExample singleton_instance =null;
    private final Integer count;
    private  SingletonExample(){
        count = 100;
    }
    public static SingletonExample getInstance(){
        if(singleton_instance == null)
            singleton_instance = new SingletonExample();
        return singleton_instance;
    }
}

public class Singleton{
    public static void main(String[] args) {
        SingletonExample s1 = SingletonExample.getInstance();
        SingletonExample s2 = SingletonExample.getInstance();
        if(s1 == s2){
            System.out.println("Instances are same");
        }
        else{
            System.out.println("not a single object");
        }
    }
}
