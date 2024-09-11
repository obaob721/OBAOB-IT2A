
package obaob.it2a;

import java.util.Scanner;

public class Implementor {
      Scanner input = new Scanner(System.in); 
    Execution [] imp = new Execution[100];
    
    public void manageApplication(){ 
       
        int i;    
        int numapp;    

        System.out.print("Enter number of Applications: ");
        numapp = input.nextInt();

        for(i = 0; i < numapp; i++) {
            System.out.println("\nEnter details of application "+ (i+1) +":");

            System.out.print("ID: ");
            int ID = input.nextInt();

            System.out.print("Name: ");
            String name = input.next();
            
            System.out.print("Age: ");
            int age = input.nextInt();
            
            System.out.print("BMI: ");
            double BMI = input.nextDouble();
            
            System.out.print("Fitness Goals: ");
            String fitness = input.next();
            
            imp[i] = new Execution();
            imp[i].addRecord(ID, name, age, BMI, fitness);
            
        }
    
        for(i = 0; i < numapp; i++) {
            imp[i].viewRecord();
        }    
    }
}

