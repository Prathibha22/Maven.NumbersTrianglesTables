package io.zipcoder.microlabs.mastering_loops;


//import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        StringBuilder sb=new StringBuilder();
        if(start%2==0)
            start+=1;
        for(int i=start;i<stop;i+=2)
            sb.append(i);

        return sb.toString();

    }


    public static String getOddNumbers(int start, int stop) {

        StringBuilder sb=new StringBuilder();
        if(start%2!=0)
            start+=1;
        for(int i=start;i<stop;i+=2)
            sb.append(i);

        return sb.toString();

    }


    public static String getSquareNumbers(int start, int stop, int step) {

        StringBuilder sb=new StringBuilder();
        for(int i=start;i<stop;i=i+step)
            sb.append(i*i);

        return sb.toString();
    }

    public static String getRange(int start) {
        int num=0;
        StringBuilder sb=new StringBuilder();
        while(num<start){
            sb.append(num);
            num++;
        }
        return sb.toString();
    }

    public static String getRange(int start, int stop) {
        StringBuilder sb=new StringBuilder();
        for(int i=start;i<stop;i++)
            sb.append(i);

        return sb.toString();
    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder sb=new StringBuilder();
        for(int i=start;i<stop;i=i+step)
            sb.append(i);

        return sb.toString();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder sb=new StringBuilder();
        for(int i=start;i<stop;i=i+step)
            sb.append((int) Math.pow(i,exponent));

        return sb.toString();
    }
}
