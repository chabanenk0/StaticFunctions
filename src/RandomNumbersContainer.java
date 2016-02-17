package com.company;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Random;

/**
 * Created by dmitry on 17.02.16.
 */
public class RandomNumbersContainer {
    public static int N = 100;

    protected static int numberOfObjects;
    private static double[]mas;

    public RandomNumbersContainer()
    {
        numberOfObjects++;
    }

    public int getNumberOfObjects()
    {
        return numberOfObjects;
    }
    public static void init()
    {
        Random r = new Random();
        mas = new double[N];
        for(int i=0; i<N; i++) {
            mas[i] = r.nextDouble();
        }
    }
    public static double getRandomByPosition(int i)
    {
        return mas[i];
    }

    public static void writeRandomsToAFile(String fileName)
    {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(fileName, "UTF-8");
            writer.print(mas[0]);
            for(int i = 1; i < N; i++) {
                writer.print("," + mas[i]);
            }
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
