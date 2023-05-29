import java.rmi.*;


interface ServerIntf extends Remote{
	
	
	public int addition (int num1, int num2) throws RemoteException;
	
}
