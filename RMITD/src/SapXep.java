import java.rmi.*;
import java.util.ArrayList;

public interface SapXep extends Remote{
    public ArrayList<Integer> SapTang( int n) throws RemoteException;

}
