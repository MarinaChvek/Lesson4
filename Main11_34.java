package com.company;

public class Main11_34 {
    public static void main(String[] args) {
        int [] array = new int [30];

        for (int i = 0; i < 30; i++) {
            array[i] = (int) (Math.random()*10);
            System.out.print(array[i] + " ");
            // write your code here
        }
        for (int k=1; k<=3; k++){
            int j=0 ;
            for(int i=(1+10*(k-1));i<=(10+10*(k-1));i++) {
                j= j+array[i];
                System.out.println(садков за "+k+ " декаду  "+ j);
            }
        }
    }
}