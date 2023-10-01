import java.util.Arrays;

public class Array {
    public static void main(String[] args){
        /* int[] marks = new int [3];
        marks[0] = 97; 
        marks[1] = 98;
        marks[2] = 95; */

        int[] marks = {85,80,91};

        //int[][] finalMark = {{89,34,65},{98,54,65}};

        System.out.println(marks[0]);
        System.out.println(marks.length);

        Arrays.sort(marks);
        System.out.println(marks[0]);
    }
}
