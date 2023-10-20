package com.bridgeLabz;
/*
2) Java Program to find the frequency of each element in the array
 * */
public class PrintFrequency {
    public static void main(String[] args) {
        int[] arr = {20,12,34,13,12,20,22,31,31,20,4};

        int max = 0;
        for (int num : arr){
            if(num > max){
                max = num;
            }
        }

        int[] newArr = new int[max+1];
        for (int j : arr) {
            newArr[j]++;
        }

        for(int i =0;i<=max;i++){
            if(newArr[i]>0){
                System.out.println(i+" occurs "+newArr[i]+" times");
            }
        }
    }
}
