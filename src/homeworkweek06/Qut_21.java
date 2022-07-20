package homeworkweek06;

public class Qut_21 {
//Main method
    public static void main (String[] args){

        String name = "My name is NAYAN Patel"; // String variable
        String name1 = "QA"; // String variable
// printing a name in staring variable and string method

        System.out.println("Length of String is "+name.length());
        System.out.println("Returns the character at the specified index (position) "+name.charAt(5));
        System.out.println(" combines specified string at the end of this string "+name.concat("qa"));
        System.out.println("return true if chars are found in the string "+name.contains("P"));
        System.out.println("checks if this string start with given sufix "+name.startsWith("N"));
        System.out.println("checks if this string end with given sufix "+name.endsWith("e"));
        System.out.println("compares the contents of two given strings "+name.equals(name1));
        System.out.println(" returns index of given character value or substring "+name.indexOf(name1));
        System.out.println("check if this string is empty "+name.isEmpty());
        System.out.println("return a string replacing all theold char to new char"+name.replace("My","I"));
        System.out.println(" returns a part of the string "+name.substring(4,6));
        System.out.println(" converts this string into character array  "+name.toCharArray());
        System.out.println("return the string in lowercase "+name.toLowerCase());
        System.out.println(" return ths string in uppercase"+name.toUpperCase());
        System.out.println(" eliminates leading and trailing spaces"+name.trim());




    }


}
