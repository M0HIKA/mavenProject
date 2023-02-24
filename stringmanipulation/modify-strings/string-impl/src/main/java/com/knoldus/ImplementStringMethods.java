package com.knoldus;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class ImplementStringMethods
{
            public static void main( String[] args )
            {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter a string");
                String inputString=sc.nextLine();
                 App obj=new App();
                obj.reverseString(inputString);
                obj.getStringLength(inputString);
            }

        }
