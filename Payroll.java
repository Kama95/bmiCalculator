import java.util.*;

public class Payroll{
  Scanner input = new Scanner(System.in);

    public String getName(){
              
               System.out.println("Enter Your First Name");
              String firstName = input.nextLine();
               System.out.println("Enter Your Last Name");
             String lastName = input.nextLine();
               String name = firstName+" "+lastName;
               return name;
    }

    public String setName(String name){
        return name;
    }

    public double grossPAy(){
      System.out.println("Enter hours worked: ");
    double hoursWorked= input.nextDouble();
    System.out.println("Enter your hourly rate");
    double hourlyRate = input.nextDouble();
    double grossPay = hourlyRate * hoursWorked;
    return grossPay;

    }

    public double getFederalTax(){
        System.out.println("Enter Federal Tax rate: ");
      double federalTaxRate = input.nextDouble();
      double federalTaxPerc = federalTaxRate *100;
      return federalTaxPerc;

     
    }

    public double getGvtTax(){
       System.out.println("Enter Goverment Tax rate: ");
      double gvtTaxRate = input.nextDouble();
      double gvtTaxPerc = gvtTaxRate*100;
      return gvtTaxPerc;
    }
    


    public double deductions (double grossPay, double getFederalTax, double getGvtTax){
    
      double federalTax = (getFederalTax/100)*grossPay;
      System.out.println("Federal Tax Withholding: "+ federalTax);
      double GvtTax =(getGvtTax/100)*grossPay;
      System.out.println("Government Tax withholding "+ GvtTax);

      double totalDeductions = federalTax+GvtTax;

      return totalDeductions;

    }

    public double netPay (double grossPay, double deductions){
      double netPay = grossPay - deductions;
      return netPay;
    }

public static void main(String[] args) {
    Payroll payroll=new Payroll();
    
    String name = payroll.getName();
    String fullName = payroll.setName(name);
    System.out.println("Name:"+fullName);
    
    double grossPay = payroll.grossPAy();
    System.out.println("Gross Pay: "+"$"+grossPay);
    double federalTax = payroll.getFederalTax();
    double GvtTax =payroll.getGvtTax();

    double deductions = payroll.deductions(grossPay,federalTax,GvtTax);
    System.out.println("Total deductions are: "+ deductions);

    double netPay = payroll.netPay(grossPay, deductions);
    System.out.println("Netpay: "+ netPay);

    
}

}