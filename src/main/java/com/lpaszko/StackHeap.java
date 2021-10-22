package com.lpaszko;

import java.util.Scanner;

class StackHeap {
    private static String message = "Do You wan't to know something about input Yes[y]/No[n]?";

    static String stack(Scanner input){
        StringBuilder lineOne = new StringBuilder("String s1 = \"Java\";\nString s2 = \"Java\";\nString s3 = s1;");

        String msg = message.replace("input","stack(stos)");
        System.out.println(msg);

        String in = input.nextLine();

        if(in.equals("y")){

            System.out.println("===STOS===");
            String s1 = "Java";
            String s2 = "Java";
            String s3 = s1;
            Boolean a = s1==s2;
            Boolean b = s3==s1;
            lineOne.append("\ns1 == s2 ? ");
            lineOne.append(a);
            lineOne.append("\ns3 == s1 ? ");
            lineOne.append(b);
            System.out.println(lineOne.toString());

        }else{
            return "";
        }
        return lineOne.toString();
    }

    static String heap(Scanner input){
        StringBuilder lineOne = new StringBuilder("String s1 = new String(\"Java\");\nString s2 = new String(s1);\nString s3 = s1;");

        String msg = message.replace("input","heap(sterta)");
        System.out.println(msg);

        String in = input.nextLine();

        if(in.equals("y")) {

            System.out.println("==STERTA==");
            String s1 = new String("Java");
            String s2 = new String(s1);
            String s3 = s1;
            Boolean a = s1 == s2;
            Boolean b = s3 == s1;
            lineOne.append("\ns1 == s2 ? ");
            lineOne.append(a);
            lineOne.append("\ns3 == s1 ? ");
            lineOne.append(b);
            System.out.println(lineOne.toString());

        }else{
            return "";
        }
        return lineOne.toString();
    }
}
