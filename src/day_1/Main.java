package day_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1.
        String firstName = "Matías";
        String lastName = "Dure";
        int age = 26;
        System.out.println("Hi my name is "+firstName+" "+lastName+". And I'm "+age+" years old.");
        //2.
        System.out.println("Welcome "+firstName+" !");

        //3.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = scanner.nextInt();
        System.out.println("Enter number 2");
        int num2 = scanner.nextInt();
        System.out.println("Enter number 3");
        int num3 = scanner.nextInt();
        if (num1>num2 && num1>num3){
            System.out.println("Number 1 is the largest number.");
        }
        else if(num2>num1 && num2>num3){
            System.out.println("Number 2 is the largest number.");
        }
        else if(num3>num1 && num3>num2){
            System.out.println("Number 3 is the largest number");
        }

        //4.
        System.out.println("Enter a number to figure if it is even or odd:");
        int evenOdd = scanner.nextInt();
        if (evenOdd%2 == 0){
            System.out.println(evenOdd + " is an even number.");
        }
        else {
            System.out.println(evenOdd+" is an odd number.");
        }
        //5.
        System.out.println("Enter a string...");
        String str1 = scanner.next();
        System.out.println("Enter another string for comparison...");
        String str2 = scanner.next();
        if (str2.equals(str1)){
            System.out.println("The strings are the same.");
        }
        else{
            System.out.println("The strings are not equal.");
        }

        //6.
        System.out.println("Enter a number to figure if it's prime or not...");
        int primeOrnot = scanner.nextInt();
        is_prime_number(primeOrnot);

        //7.
        int[] array_numbers = {1,2,3,4,5,6};
        sum_odds_from_array(array_numbers);
        //8.
        sum_even_from_array(array_numbers);
        //9.
        calculator_menu();
        //11.
        bowlingMenu();
        //12.
        bowlingOptions();

    }
    public static void is_prime_number(int number){
        int count = 0;
        for (int i=1;i<=number;i++){
            if (number%i == 0){
                count += 1;
            }
    }
        if (number <= 1 || count >2){
            System.out.println(number+" is not a prime number");
        }
        else{
            System.out.println(number+" is a prime number");
        }
    }

    public static void sum_odds_from_array(int[] array){
        int sum_odd=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 != 0){
                sum_odd += array[i];
            }
        }
        System.out.println(sum_odd);
    }

    public static void sum_even_from_array(int[] array){
        int sum_odd=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 == 0){
                sum_odd += array[i];
                System.out.println(array[i]);
            }
        }
        System.out.println(sum_odd);
    }

    public static void calculator_menu(){
        System.out.println("Calculator Menu");
        System.out.println("1. Sum");
        System.out.println("2. Sub");
        System.out.println("3. Multi");
        System.out.println("4. Division");
        System.out.println("0. Exit calculator");
        Scanner scn = new Scanner(System.in);
        System.out.println("Type an option...");
        int i = scn.nextInt();
        switch (i){
            case 0:
                System.out.println("Bye bye!");
                break;
            case 1:
                sum();
                break;
            case 2:
                sub();
                break;
            case 3:
                mult();
                break;
            case 4:
                div();
                break;
            default:
                System.out.println("That's not an option.");
        }
    }
    public static void sum(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Type a number...");
        int num_1 = scn.nextInt();
        System.out.println("Type another number...");
        int num_2 = scn.nextInt();
        int sum = num_1 + num_2;
        System.out.println("The result is "+ sum);
    }
    public static void sub(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Type a number...");
        int num_1 = scn.nextInt();
        System.out.println("Type another number...");
        int num_2 = scn.nextInt();
        int sub = num_1 - num_2;
        System.out.println("The result is "+ sub);
    }
    public static void mult(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Type a number...");
        int num_1 = scn.nextInt();
        System.out.println("Type another number...");
        int num_2 = scn.nextInt();
        int mult = num_1 * num_2;
        System.out.println("The result is "+ mult);
    }
    public static void div() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Type a dividend...");
        int dividend = scn.nextInt();
        System.out.println("Type a divisor...");
        int divisor = scn.nextInt();
        if (divisor != 0) {
            int div = dividend / divisor;
            System.out.println("The result is " + div);
        } else {
            System.out.println("Error! cannot divide by zero!");
        }

    }
    //11.
    public static void bowlingMenu () {
        System.out.println("""
                    Welcome!
                    1. Data entry.
                    2. Avaiable capacity.
                    3. Money raised.
                    4. Log out.
                    """);
    }
    //12.
    public static void bowlingOptions(){
        String name = "";
        int ID;
        int age;
        String passcheck="";
        boolean pass;
        int money_raised = 5000;
        Scanner scn= new Scanner(System.in);
        int numberofpeople = 500;
        int option = scn.nextInt();

        switch(option){
            case 1:
                System.out.println("Enter your name");
                name = scn.next();
                System.out.println("Enter your ID");
                ID = scn.nextInt();
                System.out.println("Enter your age");
                age = scn.nextInt();
                System.out.println("Do you have a pass? (YES/NO)");
                passcheck = scn.next();
                if (passcheck.equals("YES")){
                    pass = true;
                }
                else {
                    pass = false;
                }
                if (age >=21){
                    System.out.println("You are allowed to enter!");
                    if (pass){
                        System.out.println("Do you want to use your pass? (YES/NO)");
                        String options_1 = scn.next();
                        if (options_1.equals("YES")){
                            System.out.println("Wich pass? (VIP/DISCOUNTED");
                            String options_3 = scn.next();
                            if (options_3.equals("VIP")){
                                if (numberofpeople <= 1500){
                                    numberofpeople += numberofpeople + 1;
                                    System.out.println("Your place is reserved");
                                }
                                else{
                                    System.out.println("The place is is full!");
                                }
                            }
                            else if (options_3.equals("DISCOUNTED")){
                                System.out.println("Your ticket will cost half price!");
                            }
                            }

                        else{
                            System.out.println("Do you want to buy a ticket (YES/NO)");
                            String options_2 = scn.next();
                            if (options_2.equals("YES")){
                                System.out.println("Do you want to buy a VIP TICKET (YES/NO)");
                                String options_4 = scn.next();
                                if (options_4.equals("YES")){
                                    System.out.println("The cost is 2000, thank you for your purchase!");
                                    money_raised += 2000;
                                }
                                else if (options_4.equals("NO")){
                                    System.out.println("The cost is 1500, thank you for your purchase!");
                                    money_raised += 1500;
                                }
                            }
                            else{
                                System.out.println("Bye bye!");
                            }
                        }
                    }

                }
                else{
                    System.out.println("You are not allowed to enter!");
                }
                break;
            case 2:
                int capacity_max = 1500;
                int capacity = 1500 - numberofpeople;
                System.out.println("Currently there are "+ capacity+ " available spaces.");
                break;
            case 3:
                System.out.println("Current money raised: " + money_raised);
                break;
            case 4:
                System.out.println("Bye bye!");
            default:
                break;
        }

    }
}


