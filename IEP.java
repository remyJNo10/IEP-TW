package com.TW;

import java.util.ArrayList;
import java.util.Arrays;

public class IEP {
    static private String ntimes(int n, String x){

        StringBuilder fullstring = new StringBuilder("");
        fullstring.ensureCapacity(n);
        for(int i=0; i<n; i++) fullstring.append(x);
        return fullstring.toString();
    }
    static private void ex1(){
        System.out.println("*");
    }
    static private void ex2(int n){
        String answer = ntimes(n,"*");
        System.out.println(answer);
    }
    static private void ex3(int n){
        StringBuilder answer= new StringBuilder("");
        for(int i=0; i<n; i++){
            answer.append("*\n");
        }
        System.out.println(answer.toString());
    }
    static private void ex4(int n){
        StringBuilder answer = new StringBuilder("");
        for(int i=1; i<=n; i++) answer.append(ntimes(i, "*")).append("\n");
        System.out.println(answer.toString());
    }
    static private void ex5(int n){
        StringBuilder answer = new StringBuilder("");
        for(int i=1; i<=n; i++){
//            assert (n-i) > 0;
            answer.append(ntimes(n-i," ")).append(ntimes(2*i-1,"*")).append("\n");
        }
        System.out.println(answer.toString());
    }
    static private void ex6(int n){
        StringBuilder answer = new StringBuilder("");
        for(int i=1; i<=n; i++){
//            assert (n-i) > 0;
            answer.append(ntimes(n-i," ")).append(ntimes(2*i-1,"*")).append("\n");
        }
        for(int i=n-1; i>=1; i--){
//            assert (n-i) > 0;
            answer.append(ntimes(n-i," ")).append(ntimes(2*i-1,"*")).append("\n");
        }
        System.out.println(answer.toString());

    }
    static private void ex7(int n, String name){
        StringBuilder answer = new StringBuilder("");
        for(int i=1; i<n; i++){
//            assert (n-i) > 0;
            answer.append(ntimes(n-i," ")).append(ntimes(2*i-1,"*")).append("\n");
        }
//        System.out.println((n-name.length())/2);
        answer.append(ntimes((2*n-1-name.length())/2," ")).append(name).append("\n");
        for(int i=n-1; i>=1; i--){
//            assert (n-i) > 0;
            answer.append(ntimes(n-i," ")).append(ntimes(2*i-1,"*")).append("\n");
        }
        System.out.println(answer.toString());

    }
    static private void fizzBuzz(){
        for (int i = 1; i <= 100; i++) {
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else if(i%3==0){
                System.out.println("Fizz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
    static private void fizzBuzzAlt(){
        for (int i = 1; i <= 100; i++) {
            String s = "";
            if(i%3==0){
                s += "Fizz";
            }
            if(i%5==0){
                s += "Buzz";
            }
            if(s.length()>0){
                System.out.println(s);
            }
            else{
                System.out.println(i);
            }
        }
    }
    private static void generate(int n){
        int[] a = new int[n+1];
//        System.out.println(Arrays.toString(a));
        for (int i = 2; i < n; i++) {
            if(n%i==0) a[i] = i;
        }
        for (int i = 2; i < n; i++) {
            if(a[i] != 0){
                for(int j=i+1; j<n; j++){
                    if(a[j]%a[i]==0){
                        a[j] = 0;
                    }
                }
            }

        }
//        System.out.println(Arrays.toString(a));
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 2; i < n-1; i++) {
            if(a[i]!=0) answer.add(a[i]);
        }
        System.out.println(Arrays.toString(answer.toArray()));
    }
    public static void main(String[] args) {
        ex1();
        System.out.println();
        ex2(5);
        System.out.println();
        ex3(5);
        System.out.println();
        ex4(5);
        System.out.println();
        ex5(5);
        System.out.println();
        ex6(5);
        System.out.println();
        ex7(5,"Billy");
        System.out.println();
        fizzBuzz();
        System.out.println();
        fizzBuzzAlt();
        System.out.println();
        generate(30);
    }
}
