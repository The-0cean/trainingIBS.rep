package EsheRaz;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int [] array= new int[]{1,2,3,4,5};

        array[0]=1;
        array[1]=2;
        array[2]=3;
        array[3]=4;
        array[4]=5;
        array[0]= array[4];
        array[4]= 1;
        System.out.println(Arrays.toString(array));
        int sum= 0;
        for (int i=0; i< array.length; i++)
            sum= array[0]+ array[2];
        System.out.println("сумма элементов"+ "="+sum);
    }
}
