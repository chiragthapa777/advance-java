/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8.RmiDemo;

import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

public class Server extends UnicastRemoteObject implements Calculator {

    public Server() throws RemoteException {
        super();
    }

    @Override
    public int add(int num1, int num2) throws RemoteException {
        return num1 + num2;
    }

    public static void main(String[] args) {
        // Create an instance of the remote object
        try {
            
            
            Calculator calculator = new Server();

            Registry registry = LocateRegistry.createRegistry(1010);

            // Bind the remote object to the registry with a unique name
            registry.bind("CalculatorService", calculator);

            System.out.println("Server is running and ready to accept requests.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
