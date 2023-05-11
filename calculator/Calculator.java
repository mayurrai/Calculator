import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arith=-1;
        int conver = -1;
        int digi =-1;
        try{
            System.out.println("Scientific Calculator");
            System.out.println("Select the type of Operation: \n 1. Press A for Arithemetic Operations \n 2. Press B for Conversion Operations \n 3. Press C for Digital Operations \n 4. Press D to exit" );
            String operation = scanner.nextLine();
            //while(operation != "D"){
            switch(operation){
                case "A": 
                {
                    System.out.println("Welcome to Arithemetic ");
                    while(arith!=0)
                    {
                    System.out.println("Enter an option: \n 1. Press 1 for Addition(+) \n 2. Press 2 for Subtraction(-) \n 3. Press 3 for Multiplication(*) \n 4. Press 4 for Division(/)\n 5. Press 5 for Modulus(%)\n 6. Press 6 for Square \n 7. Press 7 for Cube \n 8. Press 8 for Square-Root \n 0. Press 0 to Exit");
                    arith = scanner.nextInt();
                    switch (arith)
                    {
                        case 1:
                            System.out.println("Enter first number:");
                            double a = scanner.nextDouble();
                            System.out.println("Enter second number:");
                            double b = scanner.nextDouble();
                            System.out.println("------------------------");
                            System.out.println("|                      |");
                            System.out.println("|       "+(a+b)+"           |");
                            System.out.println("|                      |");
                            System.out.println("------------------------");
                            System.out.println("Sum of "+a +"& "+b+" is: " + (a+b));
                            break;
                            case 2:
                            System.out.println("Enter first number:");
                            double minuend = scanner.nextDouble();
                            System.out.println("Enter second number:");
                            double subtrahend = scanner.nextDouble();
                            System.out.println("------------------------");
                            System.out.println("|                      |");
                            System.out.println("|       "+(minuend-subtrahend)+"           |");
                            System.out.println("|                      |");
                            System.out.println("------------------------");
                            System.out.println("Result: " + (minuend - subtrahend));
                            break;
                            case 3:
                            System.out.println("Enter first number:");
                            double multiplicand = scanner.nextDouble();
                            System.out.println("Enter second number:");
                            double multiplier = scanner.nextDouble();
                            System.out.println("------------------------");
                            System.out.println("|                      |");
                            System.out.println("|        "+(multiplicand*multiplier)+"         |");
                            System.out.println("|                      |");
                            System.out.println("------------------------");
                            System.out.println("Result: " + (multiplicand * multiplier));
                            break;
                            case 4:
                            System.out.println("Enter numerator:");
                            double numerator = scanner.nextDouble();
                            System.out.println("Enter denominator:");
                            double denominator = scanner.nextDouble();
                            if (denominator == 0) {
                                System.out.println("------------------------");
                                System.out.println("|                      |");
                                System.out.println("|       "+"Error"+"                       |");
                                System.out.println("|                      |");
                                System.out.println("------------------------");
                                System.out.println("Error: Division by zero");
                            } else {
                                System.out.println("------------------------");
                                System.out.println("|                      |");
                                System.out.println("|        "+(numerator/denominator)+"           |");
                                System.out.println("|                      |");
                                System.out.println("------------------------");
                                System.out.println("Result: " + (numerator / denominator));
                            }
                            break;
                            case 5:
                            System.out.println("Enter first number:");
                            double dividend = scanner.nextDouble();
                            System.out.println("Enter second number:");
                            double divisor = scanner.nextDouble();
                            if (divisor == 0) {
                                System.out.println("------------------------");
                                System.out.println("|                      |");
                                System.out.println("|"+"Error"+"                    |");
                                System.out.println("|                      |");
                                System.out.println("------------------------");
                                System.out.println("Error: Division by zero");
                            } else {
                                System.out.println("------------------------");
                                System.out.println("|                      |");
                                System.out.println("|          "+(dividend % divisor)+"         |");
                                System.out.println("|                      |");
                                System.out.println("------------------------");
                                System.out.println("Result: " + (dividend % divisor));
                            }
                            break;
                            case 6:
                            System.out.println("Enter the number:");
                            double num = scanner.nextDouble();
                            System.out.println("------------------------");
                            System.out.println("|                      |");
                            System.out.println("|          "+(num*num)+"         |");
                            System.out.println("|                      |");
                            System.out.println("------------------------");
                            System.out.println("Result: " + (num*num));
                            break;
                            case 7:
                            System.out.println("Enter the number:");
                            double num2 = scanner.nextDouble();
                            System.out.println("------------------------");
                            System.out.println("|                      |");
                            System.out.println("|          "+(num2*num2*num2)+"         |");
                            System.out.println("|                      |");
                            System.out.println("------------------------");
                            System.out.println("Result: " + (num2*num2*num2));
                            break;
                            case 8:
                            System.out.println("Enter the number:");
                            double num1 = scanner.nextDouble();
                            if (num1 < 0) {
                                System.out.println("------------------------");
                                System.out.println("|                      |");
                                System.out.println("|"+("Error")+"                    |");
                                System.out.println("|                      |");
                                System.out.println("------------------------");
                            System.out.println("Cannot take the square root of a negative number!");
                            break;
                            }
                            double sqrt = Math.sqrt(num1);
                            System.out.println("sqrt(" + num1 + ") = " + sqrt);
                            break;
                            case 0:
                            System.out.println("------------------------");
                            System.out.println("|                      |");
                            System.out.println("|         "+("Exiting...")+"   |");
                            System.out.println("|                      |");
                            System.out.println("------------------------");
                            System.out.println("Exiting...");
                            System.exit(0);
                        }
                    }
                }
                
                case "B":
                {
                    System.out.println("Welcome to Conversion");
                    while(conver!=0){
                        System.out.println("Enter an option: \n 1. Press 1 for Liters-milliliters \n 2. Press 2 for Kilometers-meters \n 3. Press 3 for Centimeters-millimeters \n 4.Press 4 for Meters-centimeters \n 0.Press 0 for Exit");
                        conver = scanner.nextInt();
                        switch (conver)
                        {
                            case 1:
                                System.out.println("Enter value in liters:");
                                double liters = scanner.nextDouble();
                                double milliliters = liters * 1000;
                                System.out.println("----------------------------------");
                                System.out.println("|                                |");
                                System.out.println("|"+(liters + " liters = " + milliliters + " milliliters")+"|");
                                System.out.println("|                                |");
                                System.out.println("----------------------------------");
                                System.out.println(liters + " liters = " + milliliters + " milliliters");
                                break;

                            case 2:
                                System.out.println("Enter value in kilometers:");
                                double kilometers = scanner.nextDouble();
                                double meters = kilometers * 1000;
                                System.out.println("----------------------------------");
                                System.out.println("|                                |");
                                System.out.println("|"+(kilometers + " kilometers = " + meters + " meters")+"|");
                                System.out.println("|                                |");
                                System.out.println("----------------------------------");
                                System.out.println(kilometers + " kilometers = " + meters + " meters");
                                break;

                            case 3:
                                System.out.println("Enter value in centimeters:");
                                double centimeters = scanner.nextDouble();
                                double millimeters = centimeters * 10;
                                System.out.println("----------------------------------");
                                System.out.println("|                                |");
                                System.out.println("|"+(centimeters + " centimeters = " + millimeters + " millimeters")+"|");
                                System.out.println("|                                |");
                                System.out.println("----------------------------------");
                                System.out.println(centimeters + " centimeters = " + millimeters + " millimeters");
                                break;

                            case 4:
                                System.out.println("Enter value in meters:");
                                double m = scanner.nextDouble();
                                double cm = m * 100;
                                System.out.println("----------------------------------");
                                System.out.println("|                                |");
                                System.out.println("|"+(m + " meters = " + cm + " centimeters")+"|");
                                System.out.println("|                                |");
                                System.out.println("----------------------------------");
                                System.out.println(m + " meters = " + cm + " centimeters");
                                break;

                            case 0:
                                System.out.println("----------------------------------");
                                System.out.println("|                                |");
                                System.out.println("|"+("Exiting...")+"|");
                                System.out.println("|                                |");
                                System.out.println("----------------------------------");
                                System.out.println("Exiting...");
                                System.exit(0);
                                break;

                            default:
                                System.out.println("Invalid choice!");
                        }
                    }
                }
                case "C":
                {
                    System.out.println("Welcome to Digital");
                    while(digi!=0)
                    {
                        System.out.println("Enter an option: \n 1. Press 1 for Binary-to-Decimal Conversion \n 2. Press 2 for Decimal-to-Binary Conversion \n 3. Press 3 for Decimal-to-Hexadecimal Conversion \n 0. Press 0 for Exit");
                        digi = scanner.nextInt();
                        switch (digi)
                        {
                
                        case 1:
                            System.out.println("Enter a binary number: ");
                            scanner.nextLine();
                            String binaryStr = scanner.nextLine();
                            int decimal = 0, power = 0;
                            for (int i = binaryStr.length() - 1; i >= 0; i--) {
                                if (binaryStr.charAt(i) == '1') {
                                    decimal += Math.pow(2, power);
                                }
                                power++;
                            }
                            System.out.println("----------------------------------");
                            System.out.println("|                                |");
                            System.out.println("|"+("Decimal equivalent: " + decimal)+"|");
                            System.out.println("|                                |");
                            System.out.println("----------------------------------");
                            System.out.println("Decimal equivalent: " + decimal);
                            break;
                        case 2:
                            System.out.println("Enter decimal number:");
                            int deciml = scanner.nextInt();
                            String binary = Integer.toBinaryString(deciml);
                            System.out.println("----------------------------------");
                            System.out.println("|                                |");
                            System.out.println("|"+("Binary equivalent: " + binary)+"|");
                            System.out.println("|                                |");
                            System.out.println("----------------------------------");
                            System.out.println("Binary equivalent: " + binary);
                            break;
                        case 3:
                            Scanner input = new Scanner(System.in);
                            System.out.print("Enter a decimal number: ");
                            int deci = input.nextInt();
                            String hexadecimal = "";
                            
                            while (deci > 0) {
                                int remainder = deci % 16;
                                if (remainder < 10) {
                                    hexadecimal = remainder + hexadecimal;
                                } else {
                                    char hexChar = (char) ('A' + remainder - 10);
                                    hexadecimal = hexChar + hexadecimal;
                                }
                                deci /= 16;
                            }
                            System.out.println("----------------------------------");
                            System.out.println("|                                |");
                            System.out.println("|"+("The hexadecimal equivalent is: " + hexadecimal)+"|");
                            System.out.println("|                                |");
                            System.out.println("----------------------------------");
                            System.out.println("The hexadecimal equivalent is: " + hexadecimal);
                            break;
                        case 0:
                                System.out.println("Exiting...");
                            System.exit(0);
                        default:
                            System.out.println("Error: Unsupported operation");
                            break;
                        }
                    } 
                }   
            }
        }
        catch(Exception e){
            System.out.println("SOMETHING WENT WRONG!! CHECK YOUR INPUT!! THANKYOU !!");
        }   
            scanner.close();
        System.out.println("Exit...");
    }
}
