import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.IOException;

import java.util.Random;
import java.util.Scanner;

import java.util.ArrayList;

public class main {
    public static void main(String args[]) throws FileNotFoundException{
        Scanner keyboard=new Scanner(System.in);
        PrintStream outAdmin=null,outComputer=null;
        try {
            outAdmin = new PrintStream("Out data for admin.txt");
            outComputer = new PrintStream("Out data for computer.txt");
            Scanner scan = new Scanner(new File("Out data for admin.txt"));
        }catch (FileNotFoundException exception){
            System.out.println("File not found");
        }

        Random generator=new Random();

        System.out.print("Enter value users: ");
        int valueUser=keyboard.nextInt();

        User arrayUsers[]=new User[valueUser];

        enterUserData(arrayUsers,keyboard);
        createOutDataForAdmin(arrayUsers,outAdmin);
        createOutDataForComputer(arrayUsers,outComputer);

        Check check=new Check();
        System.out.printf("#To access the system, enter your username and password#\nEnter username: ");
        check.setName(keyboard.next());
        System.out.printf("\nEnter password: ");
        check.setPassword(keyboard.next());
        System.out.println();
        check.accessVerification();

    }
    public static void enterUserData(User arrayUsers[], Scanner keyboard){
        for(int i=0;i<arrayUsers.length;i++){
            arrayUsers[i]=new User();

            System.out.printf("#%d USER\nEnter username: ",i+1);
            arrayUsers[i].setNickname(keyboard.next());
            System.out.printf("Enter password: ");
            arrayUsers[i].setPassword(keyboard.next());
            System.out.printf("\n");
        }
    }
    public static void createOutDataForAdmin(User arrayUsers[],PrintStream outAdmin){
        for (int i=0;i<arrayUsers.length;i++){
            outAdmin.printf("USER #%d\nNICKNAME: %s\nPASSWORD: %s\n\n",i+1,arrayUsers[i].getNickname(),arrayUsers[i].getPassword());
        }
    }
    public static void createOutDataForComputer(User arrayUsers[],PrintStream outComputer){
        for (int i=0;i<arrayUsers.length;i++){
            outComputer.println(arrayUsers[i].getNickname());
            outComputer.println(arrayUsers[i].getPassword());
        }
    }
}
