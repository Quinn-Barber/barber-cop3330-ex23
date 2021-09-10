package org.example;
import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Quinn Barber
 */
public class App 
{
    public static void main( String[] args )
    {
        String in;
        Scanner input = new Scanner(System.in);
        System.out.println("Is the car silent when you turn the key?");
        in = input.nextLine();
        if( in.equals("y") ){
            System.out.println("Are the battery terminals corroded?");
            in = input.nextLine();
            if( in.equals("y") ){
                System.out.println("Clean the terminals and try starting again.");
            }
            else if( in.equals("n") ){
                System.out.println("Replace cables and try again.");
            }
        }
        else if( in.equals("n") ){
            System.out.println("Does the car make a slicking noise?");
            in = input.nextLine();
            if( in.equals("y") ){
                System.out.println("Replace the battery.");
            }
            else if( in.equals("n") ){
                System.out.println("Does the car crank up but fail to start?");
                in = input.nextLine();
                if( in.equals("y") ){
                    System.out.println("Check spark plug connections.");
                }
                else if( in.equals("n") ){
                    System.out.println("Does the engine start and then die?");
                    in = input.nextLine();
                    if( in.equals("y") ){
                        System.out.println("Does your car have fuel injection?");
                        in = input.nextLine();
                        if( in.equals("y") ){
                            System.out.println("Get it in for service.");
                        }
                        else if( in.equals("n") ){
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                    }
                    else if( in.equals("n") ){
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }
    }
}
