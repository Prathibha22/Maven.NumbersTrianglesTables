package io.zipcoder.microlabs.mastering_loops;


//import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String result="";
        if(start%2==0)
            start+=1;
        for(int i=start;i<stop;i+=2)
            result+=i;

        return result;

    }


    public static String getOddNumbers(int start, int stop) {

        String result="";
        if(start%2!=0)
            start+=1;
        for(int i=start;i<stop;i+=2)
            result+=i;

        return result;

    }


    public static String getSquareNumbers(int start, int stop, int step) {

        String result="";
        for(int i=start;i<stop;i=i+step)
            result+=i*i;

        return result;
    }

    public static String getRange(int start) {
        int num=0;
        String output="";
        while(num<start){
            output+=num;
            num++;
        }
        return output;
    }

    public static String getRange(int start, int stop) {
        String result="";
        for(int i=start;i<stop;i++)
           result+=i;

        return result;
    }


    public static String getRange(int start, int stop, int step) {
        String result="";
        for(int i=start;i<stop;i=i+step)
            result+=i;

        return result;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String result="";
        for(int i=start;i<stop;i=i+step)
            result+=(int) Math.pow(i,exponent);

        return result;
    }
}
