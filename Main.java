package com.TW;

public class Main {
    private String constructString(int n, String x){
        StringBuilder fullstring = new StringBuilder("");
        fullstring.ensureCapacity(n);
        for(int i=0; i<n; i++) fullstring.append(x);
        return fullstring.toString();
    }
    private void ex1(){
        System.out.println("*");
    }
    private void ex2(int n){
        String answer = constructString(n,"*");
        System.out.println(answer);
    }
    public static void main(String[] args) {

    }
}
