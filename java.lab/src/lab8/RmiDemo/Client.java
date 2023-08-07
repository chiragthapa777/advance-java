/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8.RmiDemo;

import java.rmi.registry.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            // Obtain a reference to the RMI registry running on the server
            Registry registry = LocateRegistry.getRegistry("localhost",1010);

            // Lookup the remote object by its registered name
            Calculator calculator = (Calculator) registry.lookup("CalculatorService");

            // Invoke the remote method and get the result
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = calculator.add(a, b);

            System.out.println("Result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}