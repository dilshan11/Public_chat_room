/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerImpl;

import Controller.MessangerController;
import Controller.MessangerServerControlller;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author Sachithra
 */
public class MessangerControllerImpl extends UnicastRemoteObject implements MessangerServerControlller{
    String message;
    ArrayList<MessangerController> allmessagers=new ArrayList<>();
    public MessangerControllerImpl() throws RemoteException{
        
    }
    @Override
    public void addMessanger(MessangerController messangerController) throws RemoteException{
         allmessagers.add(messangerController);
    }

    @Override
    public void removeMessanger(MessangerController messangerController) throws RemoteException{
         allmessagers.remove(messangerController);
    }

 
    public void notifyMessanger(String messages) throws RemoteException{
       for(MessangerController msg:allmessagers){
           msg.update(messages);
           System.out.println(messages);
       }
    }
    
}
