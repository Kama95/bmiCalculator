import java.util.Scanner;

public class bmiCalculator {
Scanner scanner = new Scanner(System.in);

//A function to get weight from the user
       double getWeight(){
        System.out.println ("Enter Weight");
        double weight = scanner.nextDouble();
        //double weight = Double.parseDouble(weightInput);
        return weight;
       }

       double getHeight(){
        System.out.println("Enter your height");
        double height = scanner.nextDouble();
        //double height = Double.parseDouble(heightInput);
        return height;
       }

       double calculateBMI (double weight, double height){
        height = height*height;
        double bmiResult = weight/height;
        return bmiResult;
       }
    String bmiCategory(double bmi){
        String bmiCatig ="";
          if (bmi <= 18.4){
            bmiCatig ="You are underweight";
          }
          else if(bmi >= 18.5 && bmi <= 24.9){
            bmiCatig ="Your weight is normal. Keep it up";
          }
          else if (bmi >25.0 && bmi < 39.9){
            bmiCatig ="You are overweight, Check your weight";
          }
          else if (bmi >=40.0){
            bmiCatig = "You are obese. Seek help";
         }
         return bmiCatig;
    }


    public static void main(String[] args) {

      bmiCalculator calculator = new bmiCalculator();// an instance of the bmiCalculator object, so we can able to call its methods.
        
      double Weight = calculator.getWeight();// gets input from user and store it in "weight variable"
      double Height = calculator.getHeight();
      double bmi = calculator.calculateBMI( Weight,Height);
      System.out.println("Your BMI is :" + bmi);
      String bmiCategory = calculator.bmiCategory(bmi);
      System.out.println(bmiCategory);
    
    }
    
}