/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerImpl;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sachithra
 */
public class ServerStart {
    public static void main(String[] args) {
        try {
            Registry rmireg=LocateRegistry.createRegistry(5055);
            System.out.println("Server is starting...");
            rmireg.rebind("MessangerServer",new MessangerControllerImpl());
        } catch (RemoteException ex) {
            Logger.getLogger(ServerStart.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
