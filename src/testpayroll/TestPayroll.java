/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpayroll;

import java.util.Scanner;

/**
 *
 * @author Gurveer Singh
 */
public class TestPayroll 
{

    public static void main(String[] args) 
    {
        // TODO code application logic here
    
        Scanner input=new Scanner(System.in);// taking input for user
        Payroll prl=new Payroll();// creating an object
        
        System.out.println("Enter employee unique ID");
        for(int i=0;i<prl.getEmployeeId().length;i++){
            System.out.print("Id = ");
           int  Id=input.nextInt();

             prl.setEmployeeId(Id,i);
             Id++;
        }
        

        for(int i=0;i<prl.getEmployeeId().length;i++){
            System.out.print("Hours = ");   
            double hours=input.nextDouble();
            

              prl.setHours(hours,i);
            

        }

        for(int i=0;i<prl.getEmployeeId().length;i++)
        {
            System.out.print("PayRate = ");
            double payrate=input.nextDouble();
           
            prl.setPayrate(payrate,i);

        }

        System.out.println("ID  HOURS   PAYRATE  GROSSPAY");
        for(int i=0;i<prl.getEmployeeId().length;i++)
        {
      System.out.println(prl.getEmployeeId()[i]+"   "+prl.getHours()[i]+"  "+prl.getPayrate()[i]+" "+prl.Srch(prl.getEmployeeId()[i]) );
        
        }
        System.out.println("Enter employeeID for calculating Gross pay");
        int g=input.nextInt();

        
        System.out.println("Grosspay of employee= "+prl.Srch(g)+"  Highest Payrate = "+prl.getHst());
           //hi
        //Gurveer Singh
        }

    
    }
    

