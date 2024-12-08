import java.util.Scanner; //in order to receive user input we import the scanneer class

class TemperatureConverter{
    public static void main(String[] args){
        Scanner option = new Scanner(System.in);        //create a scanner object to read user input
       
        System.out.println("This is a temperature converter. What conversion would you like to do?");
        System.out.println("1. Celsius to Farenheit \n2. Farenheit to Celsius ");
        int select = option.nextInt();                  //declaring a variable to hold the selected option

        if(select==1){
            System.out.println("Enter the temperature in Celsius");
            double dtemp = option.nextDouble();          //creating a variable to store temperature for conversion
            double Farenheittemp = (dtemp*9/5) + 32;          //converion of celsius to farenheit
            System.out.println(dtemp + " degrees in farenheit is "+ Farenheittemp + " farenheit");
        }
        else if(select==2){
            System.out.println("Enter the temperature in Farenheit");
            double ftemp = option.nextDouble();
            Double Degreetemp = (ftemp-32)*5/9;
            System.out.println(ftemp + " degrees in farenheit is "+ Degreetemp + " degrees");
        }
        else{                                            //branch to prompt user for a valid input
            System.out.println("Invalid option selected. \nChoose a conversion. 1. Celsius to Farenheit \n2. Farenheit to Celsius ");
        }
        option.close();                                  //this is to close the object to prevent resource leaks
    }
   
}