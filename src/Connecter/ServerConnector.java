/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connecter;


import Controller.MessangerController;
import Controller.MessangerServerControlller;
import ControllerImpl.MessangerControllerImpl;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author niroth
 */
public class ServerConnector {
    private MessangerServerControlller messangerServerControlller;
    private static  ServerConnector serverConnector;
    private ServerConnector() throws NotBoundException, MalformedURLException, RemoteException{
       messangerServerControlller=(MessangerServerControlller) Naming.lookup("rmi://192.168.56.1:5055/MessangerServer");
    }
    public static ServerConnector getInstance() throws NotBoundException, MalformedURLException, RemoteException{
        if(serverConnector==null){
            serverConnector=new ServerConnector();
        }
        return serverConnector;
    }
    public MessangerServerControlller getMessangerController(){
        return messangerServerControlller;
    }
}
