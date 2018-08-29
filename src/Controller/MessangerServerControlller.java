/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Sachithra
 */
public interface MessangerServerControlller extends Remote{
    public void addMessanger(MessangerController messangerController) throws RemoteException;
    public void removeMessanger(MessangerController messangerController) throws RemoteException;
    public void notifyMessanger(String message) throws RemoteException;
}
