package JAVA_inheritance;

public class CheckDemo {
    public static void main(String[] arg){
        //do something........
        int[] a = { 1, 2 ,3, 5, 7, 9, 2, 1, 1};
        int[] b;
        b = Demo.TranslateArray1(a);
        for (int i = 0; i < (b.length); i++) {
            System.out.println(b[i]);
        }

    }
}
