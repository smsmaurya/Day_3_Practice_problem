package com.bridgeLabz;

/*
3) Java Program to print the largest element in an array
4) Java Program to print the smallest element in an array
5) Java Program to print the elements of an array present on an even position
6) Java Program to print the elements of an array in reverse order
7) Java Program to print the elements of an array present on odd position
8) Java Program to print the duplicate elements of an array
9) Java Program to sort the elements of an array in ascending order
10) Find 2nd Largest Number in an Array

*/

public class OperationOnArray {
    public static void main(String[] args) {
        int[] arr = {3,4,7,22,45,7,8,4,7,22};
        System.out.println("The largest element of given array is : "+largeElementOfArray(arr));
        System.out.println("The smallest element of given array is : "+smallElementOfArray(arr));
        evenPositionElement(arr);
        oddPositionElement(arr);
        reverseArray(arr);
        printDuplicateElement(arr);
        printElementInAscendingOrder(arr);
        System.out.println("The second largest element is : "+secondLargestElement(arr));
    }

    public static int largeElementOfArray(int[] array){
        int largeElement = 0;
        for (int num : array){
            if(num > largeElement){
                largeElement = num;
            }
        }
        return largeElement;
    }

    public static int smallElementOfArray(int[] array){
        int smallElement = array[0];
        for(int i=1;i<array.length;i++){
            if(smallElement>array[i]){
                smallElement = array[i];
            }
        }
        return smallElement;
    }

    public static void evenPositionElement(int[] arr){
        System.out.println("Elements which are present on even position :");
        for(int i=0;i<arr.length;i++){
            if(i%2==0)
                System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void oddPositionElement(int[] arr){
        System.out.println("Elements which are present on odd position :");
        for(int i=0;i<arr.length;i++){
            if(i%2==1)
                System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void reverseArray(int[] arr){
        System.out.println("Printing the array element in reverse order : ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void printDuplicateElement(int[] arr){
        System.out.print("The duplicate elements are: ");
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
            if(newArr[i]==1){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void printElementInAscendingOrder(int[] arr){
        System.out.println("The elements arrange in ascending order :");
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }

    public static int secondLargestElement(int[] arr){
        int largestElement =0;
        int secondLargestElement =0;

        for (int j : arr) {
            //int secLarge = arr[i];
            secondLargestElement = j;
            if (largestElement < secondLargestElement) {
                int temp = largestElement;
                largestElement = secondLargestElement;
                secondLargestElement = temp;
            }
        }

        return secondLargestElement;
    }

}
