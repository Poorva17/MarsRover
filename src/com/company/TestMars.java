package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestMars {

    public static void main(String[] args) {

        MarsRover R=new MarsRover(3,3,"E");
        R.showCurrent();
        String input;
        System.out.println("Enter Input string:");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            input=in.readLine();
            int i;
            for(i=0;i<input.length();i++)
            {

                if(input.charAt(i)=='L'||input.charAt(i)=='R')
                {
                    R.moveLR(input.charAt(i));
                }
                if(input.charAt(i)=='M')
                {
                    R.move();
                }

            }
            System.out.println("Final answer:");
            R.showCurrent();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
