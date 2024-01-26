package day_4;

import java.util.Scanner;

public class Calculator implements CalculatorOperations, CalculatorMenu{
    Scanner scn = new Scanner(System.in);
    String operation = "";
    @Override
    public void addition() {
        operation = "add";
       System.out.println("""
                #ADDITION MENU#
                Type a number...
                """);
        Float num_1 = scn.nextFloat();
        System.out.println("Type another number");
        Float num_2 = scn.nextFloat();
        Float add = num_1 + num_2;
        System.out.println("The result is " + add);
        showMenu();
        optionSelector();
    }

    @Override
    public void substraction() {
        operation = "sub";
        System.out.println("""
                #SUBSTRACTION MENU#
                Type a number...
                """);
        Float num_1 = scn.nextFloat();
        System.out.println("Type another number");
        Float num_2 = scn.nextFloat();
        Float sub = num_1 - num_2;
        System.out.println("The result is " + sub);
        showMenu();
        optionSelector();

    }

    @Override
    public void multiplication() {
        operation = "mult";
        System.out.println("""
                #ADDITION MENU#
                Type a number...
                """);
        Float num_1 = scn.nextFloat();
        System.out.println("Type another number");
        Float num_2 = scn.nextFloat();
        Float mult = num_1 * num_2;
        System.out.println("The result is " + mult);
        showMenu();
        optionSelector();
    };


    @Override
    public void divison() {
        operation = "div";
        System.out.println("""
                #ADDITION MENU#
                Type a dividend...
                """);
        Float num_1 = scn.nextFloat();
        System.out.println("Type a divisor");
        Float num_2 = scn.nextFloat();
        if (num_2 != 0){
            Float div = num_1 / num_2;
            System.out.println("The result is " + div);
        }
        else{
            System.out.println("Cannot divide by zero!");
        }
        showMenu();
        optionSelector();
    }

    @Override
    public void showMenu() {
        System.out.println("""
                Select an option:
                1-Repeat calculation.
                2-Exit
                """);
    }
    
    @Override
    public void optionSelector() {
        int option = scn.nextInt();
        switch (option){
            case 1:
                if (operation.equals("add")){
                    addition();
                }
                else if (operation.equals("sub")){
                    substraction();
                }
                else if (operation.equals("mult")){
                    multiplication();
                }
                else if (operation.equals("div")){
                    divison();
                }
                break;
            case 2:
                goodbyeMsg();
                break;
            default:
                System.out.println("No es una opción válida!");
                init();
                break;

        }
    }

    @Override
    public void goodbyeMsg() {
        System.out.println("Good Bye!");
    }

    @Override
    public void init() {

    }
}
