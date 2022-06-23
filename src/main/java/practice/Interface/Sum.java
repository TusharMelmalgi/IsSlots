package practice.Interface;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Sum {


    int intInputFromCommand() {
        int sum = 0;
        Scanner si = new Scanner(System.in);
        String args = si.nextLine();
        String[] number = args.split(" ");
        for (String num : number)
            sum += Integer.parseInt(num);
        return sum;
    }
    float floatInputFromCommand(){
        float sum=0;
        Scanner si = new Scanner(System.in);
        String args = si.nextLine();
        String[] number = args.split(" ");

        for(String num:number){
            sum += Float.parseFloat(num);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("enter numbers:");
        Sum sum1 = new Sum();
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(3);
      //  System.out.println("sum is:"+sum1.intInputFromCommand());
        System.out.println("sum is:"+df.format(sum1.floatInputFromCommand()));
    }
}
