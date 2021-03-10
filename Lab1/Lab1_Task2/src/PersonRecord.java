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
        String Name = scan.nextLine();
        int Age = scan.nextInt();
        char Gender = scan.next().charAt(0);
        String Address = scan.nextLine();
        boolean Married = scan.nextBoolean();
        float Height = scan.nextFloat();

        File file = new File("/desktop/Lab1_Task2/text.txt");

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write("Name : " + Name);
            writer.write("Age : " + Age);
            writer.write("Gender : " + Gender);
            writer.write("Address : " + Address);
            writer.write("Married : " + Married);
            writer.write("Height : " + Height);
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
