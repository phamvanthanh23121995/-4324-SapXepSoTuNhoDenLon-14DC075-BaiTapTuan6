/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.rmi.*;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Admin
 */
public class ClientSapXep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new ClientSapXep().run();
    }
    private void run(){
        int port=6394;
        int n = 0 ;
         
        try {
            SapXep sapxep = (SapXep)Naming.lookup("rmi://localhost:"+port+"/ImplSapXep");
            
            Scanner nhap = new Scanner(System.in);
            System.out.print("Nhap so phan tu: ");
            n=nhap.nextInt();
            int[] a = new int[n]; 
                    for(int i=0;i<n;i++) 
                    { 
                        System.out.print("a["+i+"] = "); 
                        a[i]=nhap.nextInt(); 
                    } 
               Arrays.sort(a);      
            System.out.println("==== Day sau khi sap tang ===="); 
           for(int i =0;i<sapxep.SapTang(n).size();i++){
                
                System.out.print(a[i]+" ");
            }
            System.out.println("");
            
           
            System.out.println("");
        } catch (NotBoundException ex) {
            Logger.getLogger(ClientSapXep.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ClientSapXep.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ClientSapXep.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
