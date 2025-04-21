package org.example;

public class Main {

    private long ulamFunction(long n){
        if (n % 2 == 0) n/= 2;
        else n = n * 3 + 1;
        if (n > 1) return ulamFunction(n);
        return n;
    }

    public static void main(String[] args) {
        Main main = new Main();
        for (long i=1; i<1000000; i++){
            if (main.ulamFunction(i) != 1){
                System.out.println("Found exception! n = " + i+ ", Result = " + main.ulamFunction(i));
                return;
            }
        }
        System.out.println("No exception found");
    }
}