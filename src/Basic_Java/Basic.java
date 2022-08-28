package Basic_Java;

import javax.swing.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;
import java.util.*;
    public class Basic {public static void main(String[] args) throws IOException {
        //1. variables with literals
        /*byte b = 3;
        short s = 100;
        int i = 12345;
        long l = 12345678;
        float f = 12.2f;
        double d = 123.45678;
        boolean bl= true;
        char c = 'a';
        String str = "Manish";
        //constant
        final int a = 123;
        //print variables
        System.out.println(" value of b = "+ b);
        System.out.println(" value of s = "+ s);
        System.out.println(" value of i = "+ i);
        System.out.println(" value of l = "+ l);
        System.out.println(" value of f = "+ f);
        System.out.println(" value of d = "+ d);
        System.out.println(" value of bl = "+ bl);
        System.out.println(" value of c = "+ c);
        System.out.println(" value of str = "+ str);*/

        //2.Scanner Class
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("My name is "+ name);*/

        //3.JOptionPane Class for user input with dialog box
        /*String subject ;
        subject = JOptionPane.showInputDialog("enter subject name");
        JOptionPane.showMessageDialog(null,"My favorite subject is "+subject);*/

        //4. Working with file
        PrintWriter file = new PrintWriter("Demo.txt");
        file.println("This is demo for working with file in java");
        file.println("We use PrintWriter class to create or open file");
        file.println("We use println method to write in file");
        file.println("We use close() method to close the file");
        file.close();
        // To read file
        File f = new File("demo.txt");
        if(f.exists()){
            Scanner sc = new Scanner(f);
            while(sc.hasNext()){
                System.out.println(sc.nextLine());
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"File not Found");
        }

        //5.Read file and put it in to array
        /*int [] values = new int[7];
        int i = 0;
        File file = new File("Values.txt");
        if(file.exists()){
            Scanner inputFile = new Scanner(file);
            while (inputFile.hasNext() && i< values.length){
                values[i] = inputFile.nextInt();
                i++;
            }
            inputFile.close();
        }
        for (int value: values) {
            System.out.println(value);
        }*/

        //6. ArrayList Class
        /*ArrayList<String> s = new ArrayList<>();
        s.add("Java");
        s.add("Android");
        s.add("Kotlin");
        s.add("123");
        s.set(3,"development");
        for (int i = 0; i <=3; i++) {
            System.out.println(s.get(i));
        }*/
    }
}
