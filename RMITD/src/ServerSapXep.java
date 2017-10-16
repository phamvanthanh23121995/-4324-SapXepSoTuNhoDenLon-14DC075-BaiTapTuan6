/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.rmi.*;

import com.sun.corba.se.impl.orbutil.LogKeywords;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class ServerSapXep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       new ServerSapXep().run();
    }
    private void run(){
        int port=6394;
        try {
            ImplSapXep tangdan = new ImplSapXep();
            Registry registry = LocateRegistry.createRegistry(port);
            Naming.rebind("rmi://localhost:"+port+"/ImplSapXep", tangdan);
            System.out.println("Server is running ...");
        } catch (RemoteException ex) {
            Logger.getLogger(ServerSapXep.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ServerSapXep.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
}
