package day_4;

import java.util.Scanner;

public class CalculatorWithMenu implements CalculatorMenu{
    Calculator calc = new Calculator();
    @Override
    public void showMenu() {
        System.out.print("""
                Welcome to the calculator! Select an option...
                1-Addition
                2-Substraction
                3-Multiplication
                4-Divison
                5-Exit
                """);
    }
    @Override
    public void goodbyeMsg() {
        System.out.println("Good bye!");
    }

    @Override
    public void init() {
        showMenu();
        optionSelector();
    }

    @Override
    public void optionSelector() {
        Scanner scn = new Scanner(System.in);
        int option = scn.nextInt();
        switch (option){
            case 1:
                calc.addition();
                break;
            case 2:
                calc.substraction();
                break;
            case 3:
                calc.multiplication();
                break;
            case 4:
                calc.divison();
                break;
            case 5:
                goodbyeMsg();
                break;
            default:
                System.out.println("No es una opción válida!");
                init();

        }
    }


}
