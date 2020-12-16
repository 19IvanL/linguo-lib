package ams2.linguo.util;

import ams2.linguo.interfaces.ITestQueries;
import net.sf.lipermi.handler.CallHandler;
import net.sf.lipermi.net.Client;

public class LipeRMIClient {

	public static void main(String[] args) {
		CallHandler callHandler = new CallHandler();
		String remoteHost = "90.170.204.160";
		int port = 2460;
		try {
			System.out.println("Loading connection...");
			Client client = new Client(remoteHost, port, callHandler);
			ITestQueries remoteObject = (ITestQueries)client.getGlobal(ITestQueries.class);
			if (client != null) {
				System.out.println("Connection successful\n");
				System.out.println("Querying data...\n");
				System.out.println(remoteObject.getHelloWorld());
				System.out.println();
			}
			client.close();
			System.out.println("Connection closed successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
