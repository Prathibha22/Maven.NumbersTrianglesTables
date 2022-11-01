package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder sb =new StringBuilder();
        for(int i=1;i<numberOfRows;i++) {
            for(int j = 1;j <= i;j++) {
                sb.append('*');
            }
            sb.append('\n');
        }
        return sb.toString();
    }


    public static String getRow(int numberOfStars) {
        StringBuilder sb =new StringBuilder();
        for(int i=0;i<numberOfStars;i++)
            sb.append('*');
        return sb.toString();
    }

    public static String getSmallTriangle() {
        StringBuilder sb =new StringBuilder();
        for(int i=0;i<4;i++) {
            for(int j = 0;j <= i;j++) {
                sb.append('*');
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    public static String getLargeTriangle() {
        StringBuilder sb =new StringBuilder();
        for(int i=1;i<10;i++) {
            for(int j = 1;j <= i;j++) {
                sb.append('*');
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
