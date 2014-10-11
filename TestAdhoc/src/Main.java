import client.Client;
import gui.ClientUI;
import gui.ServerUI;
import server.Server;


public class Main {

	public static void main(String[] args) {
		
		Server serv = new Server("127.0.0.1", 14423);
		ServerUI sui = new ServerUI(serv);
		serv.addObserver(sui);
		
		//Client user1 = new Client();
		ClientUI cui = new ClientUI(14423);
		
		
	}

}
