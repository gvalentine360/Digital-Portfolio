//Garrett Valentine 

//Tax and Spend Program 

  

package TaxAndSpendPackage; 

import java.util.Scanner; 

import java.text.DecimalFormat; 

  

public class TaxAndSpendProgram 

{     

    public static void main(String[]args) 

    { 

        Scanner input = new Scanner(System.in);  //Scanner

        System.out.println("Please input your annual income: "); //Asks the user to input their annual income

        int income = input.nextInt(); //scanner input

         

        final double TAX_RATE = 0.03; // Tax rate constant

        double incomeTax = income * TAX_RATE; // multiply income and tax rate to get their income tax

         

        double infrastructure = incomeTax * 0.37; 

        double prisonReinforcement = incomeTax * 0.26; 

        double kryptoniteRemoval = incomeTax * 0.17; 

        double villainRehabilitation = incomeTax * 0.12; //Variables

        double supermanMuseum = incomeTax * 0.05; 

        double dailyPlanetSubsidy = incomeTax * 0.03; 

         

        DecimalFormat currency = new DecimalFormat("$#########0.00"); //Format to currency

         

        System.out.println("Your annual income is: "+  currency.format(income) +"\n"); // Tell user their annual income

        System.out.println("Your Metropolis income tax for this year is: " + currency.format(incomeTax) + "\n"); //income tax

        System.out.println("Here is where your income tax is being allocated to"); //Tells the user where their income tax is being allocated to

        System.out.println("\tInfrastructure: " + currency.format(infrastructure) + "\n");

        System.out.println("\tPrison Reinforcement: " + currency.format(prisonReinforcement) + "\n"); 

        System.out.println("\tKryptonite Removal Services:" + currency.format(kryptoniteRemoval) + "\n"); 

        System.out.println("\tVillain Rehibilation Program: " + currency.format(villainRehabilitation) + "\n"); 

        System.out.println("\tSuperman Museum: " + currency.format(supermanMuseum) + "\n" ); 

        System.out.println("\tDaily Planet Subsidy: " + currency.format(dailyPlanetSubsidy) + "\n"); 

        System.out.println("Thank you for contributing to help our society!"); 

         

         

 
    } 

} 