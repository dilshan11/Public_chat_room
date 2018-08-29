/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import Controller.MessangerController;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Sachithra
 */
public class ObserevrImpl extends UnicastRemoteObject implements MessangerController{
      private ObsetverWindow obsetverWindow;
       
    public ObserevrImpl(ObsetverWindow obsetverWindow) throws RemoteException{
        this.obsetverWindow=obsetverWindow;
    }
     

     

    @Override
    public void update(String message) throws RemoteException {
        obsetverWindow.operate(message);
    }
}
