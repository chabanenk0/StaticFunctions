package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Program beginning:");
//        System.out.println("Static field RandomNumbersContainer.N = " + RandomNumbersContainer.N);
//        RandomNumbersContainer.init();
//        double x = RandomNumbersContainer.getRandomByPosition(0);
//        System.out.println("x=" + x);
//        RandomNumbersContainer.writeRandomsToAFile("randoms.txt");
        RandomNumbersContainer c1 = new RandomNumbersContainer();
        RandomNumbersContainer c2 = new RandomNumbersContainer();
        RandomNumbersContainer c3 = new RandomNumbersContainer();
        System.out.println("NumberOfObjects = " + c1.getNumberOfObjects());

    }
}
