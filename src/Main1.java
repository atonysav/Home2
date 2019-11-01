import java.util.Random;

public class Main1 {
    public static void main(String[] args){
        Random rand = new Random();
        int a=rand.nextInt(100);
        System.out.println("a = " + a);
        int b;
        String s="";
        do{
            b=a%2;
            s=b+s;
            a=a/2;
        }
        while (a>=1 || a==2);
        System.out.println("в двоичной системе: \n" + s);

        String i = "";
        //Random rand = new Random();
        int k = rand.nextInt(1000);
        System.out.println(k);

        do {
            int m = k % 16;
            if (m == 10) {
                i = "A" + i;
            } else if (m == 11) {
                i = "B" + i;
            } else if (m == 12) {
                i = "C" + i;
            } else if (m == 13) {
                i = "D" + i;
            } else if (m == 14) {
                i = "E" + i;
            } else if (m == 15) {
                i = "F" + i;
            } else {
                i = m + i;
            }

            k /= 16;
        } while(k >= 15);

        if (k == 10) {
            i = "A" + i;
        } else if (k == 11) {
            i = "B" + i;
        } else if (k == 12) {
            i = "C" + i;
        } else if (k == 13) {
            i = "D" + i;
        } else if (k == 14) {
            i = "E" + i;
        } else if (k == 15) {
            i = "F" + i;
        } else {
            i = k + i;
        }

        System.out.println("в шестнадцатиричной системе: \n" + i);

        int m = 545, core, add;
        System.out.println(m);
        String n = "";
        while (m / 8 >= 7 || m == 8) {
            core = m / 8;
            add = m % 8;
            n = add + n;
            m = core;
        }
        s = m + s;
        System.out.println("в восмеричной системе: \n" + m);
    }
}
