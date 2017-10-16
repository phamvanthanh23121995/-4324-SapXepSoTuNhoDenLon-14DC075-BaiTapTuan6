import java.rmi.*;
import java.rmi.server.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ImplSapXep extends UnicastRemoteObject implements SapXep{
    public ImplSapXep() throws RemoteException {
    }

    @Override
    public ArrayList<Integer> SapTang( int n){
	ArrayList<Integer> arrList=new ArrayList<>();
        int[] a=new int[n];
        
        for(int i=0;i<n;i++){
            arrList.add(a[i]);
        }
       
        return arrList;
    }
      
        
    }
    
    
