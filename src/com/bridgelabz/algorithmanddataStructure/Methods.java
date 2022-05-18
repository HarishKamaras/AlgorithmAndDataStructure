package com.bridgelabz.algorithmanddataStructure;

import java.util.Arrays;

public class Methods <T extends Comparable>{
    public void insertionSort1(T[] a) {
        Integer n = a.length;
        T value = null;
        for (Integer i = 1; i <= n - 1; i++) {
            value = a[i];
            Integer index = i;
            while (index > 0 && a[index - 1].compareTo(value) > 0) {
                a[index] = a[index - 1];
                index = index - 1;
            }
            a[index] = value;
        }
        for (T k : a) {
            System.out.println(k);
        }

    }

    void bubbleSort(T[] arr) {
        Integer n = arr.length;
        System.out.println("lenght" + arr.length);
        T temp = null;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[j - 1].compareTo(arr[j]) > 0) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        for (T k : arr) {
            System.out.println(k);
        }

    }

    void isAnagram(String str1, String str2) {
        //String str1 = "Race";
        //String str2 = "Care";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // check if length is same
        if (str1.length() == str2.length()) {

            // convert strings to char array
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            // sort the char array
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // if sorted char arrays are same
            // then the string is anagram
            boolean result = Arrays.equals(charArray1, charArray2);

            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagram.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagram.");
            }
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagram.");
        }
    }

    void prime(){
        int i,count;

        System.out.print("Enter n value : ");
        // Scanner sc=new Scanner(System.in);
        int n=1000;
        System.out.println("Prime numbers between 1 to "+n+" are ");
        for(int j=2;j<=n;j++)
        {
            count=0;
            for(i=1;i<=j;i++)
            {
                if(j%i==0)
                {
                    count++;
                }
            }
            if(count==2) {
                System.out.print(j + " prime number:  ");
                palindrome(j);
            }
        }



    }
    void palindrome(int n){
        int r,sum=0,temp;
        //It is the number variable to be checked for palindrome
        temp=n;
        while(n>0){
            r=n%10;  //getting remainder
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }
}
