package com.ethen.rpncalc;

import java.util.Scanner;

/**
 * @author:jianwentao
 * @Description:
 * @Date:2019/8/14 9:45
 * @Modified By:
 */
public class App {
    private static final String EXIT="exit";
    public static void main(String args[]) {
        RPNCalc calc = new RPNCalc();
        boolean running=true;

        while (running) {
            try {
                System.out.println("Welcome to RPN Calc!");
                System.out.println("Please enter number/operator splited with white space");
                Scanner scanner = new Scanner(System.in);
                String rpn = scanner.nextLine();
                if(EXIT.equalsIgnoreCase(rpn.trim())){
                    break;
                }
                calc.process(rpn);
            } catch (Exception e) {
                System.err.println("Error!Please check your input!");
                System.err.println("Error message:" + e.getMessage());
            }
        }
    }
}
