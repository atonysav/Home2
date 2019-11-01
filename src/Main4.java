public class Main4 {
    public static void main(String[] args) {
        double[] mas = {4, 2, 6, -1, 7, 0, 5, -34, 8, 23, 10, 4,12 };
        //тип дабл, для того, что бы проверить поиск медианы
        //для массива с парным количеством чисел

        for (int i = 0; i < mas.length - 1; i++) {
            int min = i;
            for (int k = i + 1; k < mas.length; k++) {
                if (mas[k] < mas[min]) {
                    min = k;
                }

            }
            double temp = mas[min];
            mas[min] = mas[i];
            mas[i] = temp;

        }
        for(double all:mas){
            System.out.print(all+" ");
        }

        if((mas.length%2)!=0){
            System.out.println("медиана: "+mas[mas.length/2]);
        }
        else {
            double mediana = (((mas[mas.length/2]+mas[mas.length/2-1])/2));
            System.out.println("медиана: "+mediana);
        }
    }
}
