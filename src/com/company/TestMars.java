package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestMars {

    public static void main(String[] args) {



        try {
            System.out.println("Enter X coordinate:");
            String input,input1,input2,input3;
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            input=in.readLine();

            System.out.println("Enter Y coordinate:");
            BufferedReader in1 = new BufferedReader(new InputStreamReader(System.in));
            input1=in1.readLine();

            System.out.println("Enter Direction:");
            BufferedReader in2 = new BufferedReader(new InputStreamReader(System.in));
            input2=in2.readLine();


            MarsRover R=new MarsRover(Integer.parseInt(input),Integer.parseInt(input1),input2);
            R.showCurrent();

            System.out.println("Enter Input string:");
            BufferedReader in3 = new BufferedReader(new InputStreamReader(System.in));
            input3=in3.readLine();
            int i;
            for(i=0;i<input3.length();i++)
            {

                if((input3.charAt(i) == 'L') || (input3.charAt(i) == 'R'))
                {
                    R.moveLR(input3.charAt(i));
                }
                if(input3.charAt(i)=='M')
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
