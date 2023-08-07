/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8.RmiDemo;

import java.rmi.*;

/**
 *
 * @author DELL
 */

public interface Calculator extends Remote {
    int add(int num1, int num2) throws RemoteException;
}
