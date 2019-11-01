public class Main3 {
    public static void main(String[] args) {
        int[] mas;
        mas = new int[20];
        System.out.println("числа Фибоначчи");
        for(int i=0; i<mas.length; i++){
            if(i<2){
                mas[i]=1;
            }
            else {
                mas[i]=mas[i-2]+mas[i-1];
            }

            System.out.print(mas[i] + " , ");
        }
    }
}
