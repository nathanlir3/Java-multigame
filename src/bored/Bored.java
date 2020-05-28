/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bored;


import java.util.Random;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Nathan
 */
public class Bored {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int choice, log = 0;
        String u,psw;
        boolean menu = true;
        //All our vars...
        
        Scanner out = new Scanner(System.in);
        run();
        /*
        
        System.out.println("This is your first time! Please make an account...");    
        System.out.println("Please enter a username...");
        u = out.nextLine();       
        System.out.println("Please enter a password...");
        psw = out.nextLine();
        save(u,psw);
        //Registers Account details to txt
        */      
  
        
       System.out.println("##### Welcome to the Main Menu #####\n");
       System.out.println("##### 1 = Guessing Game        #####\n");
       System.out.println("##### 2 = See if you are gay   #####\n");
       System.out.println("##### 3 = Wheres that nigga    #####\n");
       
       //Displays Main menu screen
  
       do {
           choice = out.nextInt();
       switch (choice) {
           case 1:
               guessGame();
               menu = false;
               break;
           case 2:
               System.out.println("Hello World");
               menu = false;
               break;
           case 3:
               System.out.println("Hello World");
               menu = false;
               break;
           default:
               System.out.println("Incorrected key try again...");
       }
       }while (menu == true);
    }//loop so user has to pick a number between 1 and 3
       
public static void run() throws FileNotFoundException {
    Scanner scan = new Scanner (new File("out.txt"));
    Scanner keyboard = new Scanner (System.in);
    String user = scan.nextLine();
    String pass = scan.nextLine(); // looks at selected file in scan
    System.out.print("Enter your usename...");
    String inpUser = keyboard.nextLine();
    System.out.print("Enter your password...");
    String inpPass = keyboard.nextLine(); // gets input from user

    if (inpUser.equals(user) && inpPass.equals(pass)) {
        System.out.print("your login message");
    } else {
        System.out.print("your error message");
    }
}
         
       
    
  
public static void save(String u,String psw) throws IOException {
     File file = new File("out.txt");
       FileWriter  fw = new FileWriter(file, true);
       PrintWriter pw = new PrintWriter(fw);      
       pw.println("Username: " + u);
       pw.println("Password: " + psw);
       
       pw.close();
}//File writing function to save credentials

public static void read(String u) throws FileNotFoundException {
    Scanner scanner = new Scanner("out.txt");
    FileReader fr = new FileReader("out.txt");
    BufferedReader br = new BufferedReader(fr);
    String test;
}//File reading function to read credentials
    
    
    
    public static void guessGame() {
        Random r = new Random();
        Scanner in = new Scanner (System.in);
        int Rando = r.nextInt(50) + 1;
        //Declaring all instances
       
        
        int guess;
        boolean terminal = true;
        //All vars
        
        System.out.println("##### Welcome to the number guessing game! #####");
        System.out.println("        Guess a number between 1 and 50..."); 
       
       do {
        int Lebo = r.nextInt(10) + 1;
        guess = in.nextInt();
        if (guess > Rando) {
            System.out.println("You over shot this one buddy try again.\nTry again dropkick...");
           Bored.insult(Lebo);
           System.out.println("");
           System.out.println("");
        } else 
            if (guess < Rando) {
                System.out.println("You under shot this! Do your parents hate you?\nTry again dropkick...");
                Bored.insult(Lebo);
                System.out.println("");
                System.out.println("");
            } else 
                if (guess == Rando) {
                    System.out.println("Well Done! You manage to bullshit this one LOL");
                    terminal = false;
                }
        }while (terminal == true);
    }
    
    
    
    
    
    
    
    
    public static void insult(int insult) { // Random insult genetator 
        Random l = new Random();
        int Rando = l.nextInt(10) + 1;
   
        
        switch (insult) {
            case 1:
                System.out.println("Reckon your mum thinks you are as dumb as china faking COVID?");
                break;
            case 2:
                System.out.println("A wise man once told me that if you try hard enough you will die");
                break;
            case 3:
                System.out.println("ahahahahaha kys dog cunt 123");
                break;
            case 4:
                System.out.println("This is my country stop trying to guess this number");
                break;
            case 5:
                System.out.println("Well well well your mums gagging on my cock again uhhhhhhhhhhhhhhhhhhh");
                break;
            case 6:
                System.out.println("DiD yOuR mUm BuY tHat BuTtErFlYKnIfE?!?!?!");
                break;
            case 7:
                System.out.println(" gay");
                break;
            case 8:
                System.out.println(" gay");
                break;
            case 9:
                System.out.println("8");
                break;
            case 10:
                System.out.println("Fag");
                break;
            case 11:
                System.out.println("Your mums teeth look like stone henge");
                break;
        }
        
    }    
}
