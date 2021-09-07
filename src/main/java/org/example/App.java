/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hao Nguyen
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        String monthS;
        int monthN;

        System.out.print("Please enter the number of the month: ");
        try {
            monthN = input.nextInt();
        } catch (Exception e) {
            System.out.print("Invalid month.");
            return;
        }

        switch (monthN)
        {
            case 1:
                monthS = "January";
                break;
            case 2:
                monthS = "February";
                break;
            case 3:
                monthS = "March";
                break;
            case 4:
                monthS = "April";
                break;
            case 5:
                monthS = "May";
                break;
            case 6:
                monthS = "June";
                break;
            case 7:
                monthS = "July";
                break;
            case 8:
                monthS = "August";
                break;
            case 9:
                monthS = "September";
                break;
            case 10:
                monthS = "October";
                break;
            case 11:
                monthS = "November";
                break;
            case 12:
                monthS = "December";
                break;
            default:
                System.out.print("Invalid month.");
                return;
        }
        System.out.printf("The name of the month is %s.", monthS);
    }
}
