package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Задание 1
        int[] a = new int [3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;

        double[] b = {1.57, 7.654, 9.986};

        int[] c = {55, 22, 18};

        // Задание 2
        for (int i=0; i < a.length; i++){
            if (i==a.length+1) {
                System.out.println(a[i]);
            }else {
                System.out.print(a[i] + ", ");
            }
        }
        System.out.println();

        for (int i=0; i < b.length; i++){
            if (i==b.length+1) {
                System.out.println(b[i]);
            }else {
                System.out.print(b[i] + ", ");
            }
        }
        System.out.println();
        for (int i=0; i < c.length; i++){
            if (i==c.length+1) {
                System.out.println(c[i]);
            }else {
                System.out.print(c[i] + ", ");
            }
        }
        // Задание 3
        System.out.println();
        for (int i=a.length-1; i >= 0; i--){
            if (i==a.length+1) {
                System.out.println(a[i]);
            }else {
                System.out.print(a[i] + ", ");
            }
        }
        System.out.println();
        for (int i=b.length-1; i >=0; i--){
            if (i==b.length+1) {
                System.out.println(b[i]);
            }else {
                System.out.print(b[i] + ", ");
            }
        }
        System.out.println();
        for (int i=c.length-1; i >=0; i--) {
            if (i==c.length+1) {
                System.out.println(c[i]);
            }else {
                System.out.print(c[i] + ", ");
            }
        }
        // Задание 4
        System.out.println();
        int[] e = {1, 2, 3};
        for (int i = 0; i < e.length; i++){
            if (e[i] % 2 != 0)
                System.out.println(e[i] += 1);
            else {
                System.out.println(e[i]);
            }
        }


    }
}
