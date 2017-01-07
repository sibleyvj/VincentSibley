/*  Vincent Sibley
    COP2258
    BankAccount.java
    12/3/15
 */

import java.util.Scanner;

public class BankAccount{
    
    
    // create a new scanner object per method
    
        //Declare and initialize a global variable - current balance to $5000.  
        //This variable is accessible to ALL functions (SCOPE) to update
	//**THIS IS DONE FOR YOU BELOW!**
        //public static double curbalance = 5000.00;

        //Main Function
        public static void main(String []args){
        
                //Declare a Scanner object
                Scanner keyboard = new Scanner(System.in);
                
            
                //Declare other variables as needed
                double curbalance = 5000.00;

         
                //Display the welcome message -  (The 'Boss' does NOT need a value returned!)
                //HINT:  The 'Boss' does NOT need a value returned.
                //Call the welecomeMessage() function
                welcomeMessage();

                //Prompt the user to enter the account number 
                //HINT:  The 'Boss' needs the account number returned!  Assign the call statement to a variable.
                //Call the accountInfo() function
                int accountNum = accountInfo();
            
         
                //Process menu using a Do-While loop and Switch statement
                //This will Display the menu and Call the Function(s) based on the user's choice until the user enters X 

                char menuChoice = 'x';
                
            
                do{
                        //Call the menuSelection function to display the menu and ask the user for their choice 
                        //HINT:  The 'Boss' needs the choice returned!  Assign the call statement to a variable.
                        //Call the displayMenu() function

                        menuChoice = menuSelection();
                                     
                    
                        //Switch statement is used to determine which function is called based on the user’s choice
                        //Each case represents the ‘Boss’ calling a function or the ‘Helper’ to perform some task
                        if (menuChoice == 'd')
                        {
             
                           curbalance = deposit(curbalance);
                        }
                        else if (menuChoice == 'w')
                        {
              
                            curbalance = withdrawFunds(curbalance);
             
                        }
                        else if (menuChoice == 'b')
                        {
                            balance(accountNum, curbalance);
           
                        }
                        //else
                          //  System.out.println("ERROR: Please enter a D, W, B, or X: ");
     
             
                   }while(menuChoice != 'x');  
        
            
            //Display final message
            System.out.println("Thank you for being a loyal Seminole Bank customer!");
            
        }//end of main
             
        /**************************************************** FUNCTION DEFINITIONS *****************************************************/
  
         //Display welcome message and DO NOT RETURN anything to the “BOSS”
         public static void welcomeMessage(){             
             
                System.out.println("**************************************************");
                System.out.println("Welcome to Seminole Bank!");
                System.out.println("************************************************** \n");
             
             
         }//end of welcomeMessage
         
         //Prompt and Read users’ account number.  RETURN the account number to the “BOSS”.
         public static int accountInfo (){

              System.out.print("Please enter your five digit account number: ");
      
              Scanner keyboard = new Scanner(System.in);
              int account = keyboard.nextInt();           
              return account;
             
         }//end of accountInfo
         
        
         //Display menu choices to the user and Read the users’ banking choice.  RETURN the user’s menu choice to the “BOSS”
         public static char menuSelection (){

             System.out.print("Enter D for deposit, W for withdrawal, B for balance or X to exit the menu: ");
      
             Scanner keyboard2 = new Scanner(System.in);
             String selection = keyboard2.nextLine().toLowerCase();
             char menuChoice = selection.charAt(0);
             
             return menuChoice;
         
                          
             
         }//end of menuSelection
         
         
         //Prompt the user for the amount to deposit and Read deposit amount.  Update the current balance and RETURN the current balance to the “BOSS”
         public static double deposit(double curbalance){
          
             Scanner keyboard3 = new Scanner(System.in);
             
             System.out.println("Enter the amount of the deposit");
                            double deposit = keyboard3.nextDouble();
                            curbalance +=deposit;
             
             return curbalance;
                          
         }//end of deposit
         
    
         //Prompt the user for the amount to withdraw and Read withdrawal amount.  Update the current balance and RETURN the current balance to the “BOSS”
         public static double withdrawFunds (double curbalance){
             
             Scanner keyboard4 = new Scanner(System.in);
             
             System.out.println("Enter the amount of the withdrawal: ");
                            double withdrawal = keyboard4.nextDouble();
                            curbalance -= withdrawal;
             
             return curbalance;
             
         }//end of withdrawFunds
     
         //Display the current balance and DO NOT RETURN anything to the “BOSS”
         public static void balance(int accountNum, double curbalance){
             
             System.out.printf("Account Number: " + accountNum + " " + "has a current balance of: $%.2f\n", curbalance);
               
         }//end of balance
    
    
                  
        /**************************************************END OF FUNCTION DEFINITIONS **************************************************/
    
    
}//end of BankAccount Class
