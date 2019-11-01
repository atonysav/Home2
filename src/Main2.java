import java.util.Arrays;
import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        Random random = new Random();
        //String masArray = "";
        int[] mas = new int[random.nextInt(10) + 1];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(100);
        }

        /*for(int i : mas){
            masArray += i + " ";
        }*/
        System.out.println(Arrays.toString(mas));
        /*System.out.println(masArray);
        masArray="";*/


        //bubble(mas);
        insertion(mas);
        System.out.println(Arrays.toString(mas));
    }

    //Bubble sort
    public static void bubble(int[] mas){
        int temp;
        boolean iteration = true;
        while (iteration) {
            iteration = false;
            for (int i = 1; i < mas.length; i++) {
                if (mas[i] < mas[i - 1]) {
                    temp = mas[i];
                    mas[i] = mas[i - 1];
                    mas[i - 1] = temp;
                    iteration = true;
                }
            }
        }
    }

    //Insertion sort
    public static void insertion(int[] mas){
        for(int i=0; i<mas.length; i++){
            int val = mas[i];
            int k = i-1;
            for(; k>=0; k--){
                if(val < mas[k]){
                    mas[k+1] = mas[k];
                }
                else {
                    break;
                }
            }
            mas[k+1]=val;
        }
    }

}

