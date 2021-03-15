package Task2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.lang.*;

public class PersonRecord {
    public static void main(String[] args){
        personRecord();
    }

    public static void personRecord(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Name : " );
        String Name = scan.nextLine();

        System.out.print("Age : " );
        int Age = scan.nextInt();

        System.out.print("Gender(m/f) : " );
        char Gender = scan.next().charAt(0);

        System.out.print("Address : " );
        String Address = scan.next();

        System.out.print("Married(true/false) : " );
        boolean Married = scan.nextBoolean();

        System.out.print("Height(m) : " );
        float Height = scan.nextFloat();

        File file = new File("/Users/hongjinseok/desktop/Lab1_Assignment/src/Task2/" + Name + ".txt");

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write("Name : " + Name + "\n");
            writer.write("Age : " + Age + "\n");
            writer.write("Gender : " + Gender + "\n");
            writer.write("Address : " + Address + "\n");
            writer.write("Married : " + Married + "\n");
            writer.write("Height : " + Height + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Name : " + Name);
        System.out.println("Age : " + Age);
        System.out.println("Gender : " + Gender);
        System.out.println("Address : " + Address);
        System.out.println("Married : " + Married);
        System.out.println("Height : " + Height);
    }
}
