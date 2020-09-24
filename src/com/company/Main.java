package com.company;

public class Main {

    public static void main(String[] args) {
	    int a = 10;
	    int b = 2;
	    int c = a / b;

        System.out.println(c);

        double d = (double) a / b;
        System.out.println(d);

        int e = a % b;

        System.out.println(e);

        if (a%2 == 0){
            System.out.println("a is even");
        } else System.out.println("a is odd");

        String f = String.valueOf(a);
        System.out.println(f);

        String g = "120";
        int h = Integer.valueOf(g);
        System.out.println(h+5);

        Integer k = 713;
        System.out.println(k.toString().length());

        int counter = 0;
        for (Integer i = 100000; i <999999 ; i++) {
            String str = i.toString();
            int firstDigit = Integer.valueOf(str.charAt(0));
            int secondDigit = Integer.valueOf(str.charAt(1));
            int thirdDigit = Integer.valueOf(str.charAt(2));
            int fourthDigit = Integer.valueOf(str.charAt(3));
            int fivesDigit = Integer.valueOf(str.charAt(4));
            int sixthDigit = Integer.valueOf(str.charAt(5));

            if (firstDigit + secondDigit + thirdDigit == fourthDigit + fivesDigit + sixthDigit) {
                System.out.println(i + " Lucky");
                counter += 1;
            }


        }
        System.out.println(counter);

    }


}
