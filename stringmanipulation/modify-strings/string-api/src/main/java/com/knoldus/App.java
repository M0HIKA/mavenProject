package com.knoldus;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void reverseString(String yourString)
    {
        char extractedCharacter;
        String stringAfterReversing="";
        for(int index=yourString.length()-1;index>=0;index--)
        {
            extractedCharacter=yourString.charAt(index);
            stringAfterReversing=stringAfterReversing+extractedCharacter;
        }
        System.out.println(yourString+" String after reversing is  "+stringAfterReversing);
    }
    public static void getStringLength(String yourString)
    {
        int count=0;
        char[] arrayToStoreCharactersOfString = yourString.toCharArray();
        for(char elementOneByOne:arrayToStoreCharactersOfString)
        {
            count++;
        }
        System.out.println("length of the input string is: "+count);
    }

}
