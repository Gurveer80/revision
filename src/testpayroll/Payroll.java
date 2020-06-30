/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpayroll;

import java.util.Arrays;

/**
 *
 * @author Gurveer Singh
 */
public class Payroll 
{
    //declaring an array
    private int[] employeeId =new int[5]; 
    private double[] hrs   =new double [5];
    private double[] pr =new double[5];
    
    public void setEmployeeId(int newe,int i){
        employeeId[i]=newe;
    }
     public int[] getEmployeeId(){
       return employeeId;
        
    }
    public void setHours(double newhr,int i){
        hrs[i]= newhr;
        
    }
     public double[] getHours(){
       return hrs;
    }
    public void setPayrate(double newpay,int i){
        pr[i]=newpay;
    }


    public double[] getPayrate(){
        return pr;
    }
    //search method for printing gross pay of employee
    public double Srch(int Id){
        Arrays.sort(employeeId);
        int i=Arrays.binarySearch(employeeId,Id);
        double Grosspay=hrs[i]*pr[i];  
      
      return Grosspay;
        }
    
    public double getHst()
    {
       double hst=pr[0];
       for(int i=0;i<getPayrate().length;i++)
        {
          if(pr[i]>hst)
          
           hst=pr[i];
        }
        return hst;
        

    }

    }
    

