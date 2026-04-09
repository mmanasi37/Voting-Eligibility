/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votingeligibility;

/**
 *
 * @author MANASI Mekere
 */
import java.util.Scanner;
public class VotingEligibility {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int age;
        
        System.out.print("Please enter your age :");
        age = input.nextInt();
        
        if(age >= 18)
        {
            System.out.println("You are eligible to Vote");
        
        
            
        }
        else
        {
            System.out.println("You are NOT eligible to Vote! ");
        }
    }
    
}
