package com.TW;

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

    public static void main(String[] args) {
//        ex7(6,"Billy");
//        ex6(5);
        fizzBuzzAlt();

    }
}
