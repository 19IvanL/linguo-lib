package ams2.linguo.util;

import ams2.linguo.interfaces.ICourseQueries;
import ams2.linguo.model.Course;
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
			ICourseQueries remoteObject = (ICourseQueries)client.getGlobal(ICourseQueries.class);
			if (client != null) {
				System.out.println("Connection successful\n");
				System.out.println("Querying data...");
				for (Course course : remoteObject.getCoursesByBaseAndTargetLanguages("ES", "")) {
					System.out.println(course.getId());
				}
				System.out.println();
			}
			client.close();
			System.out.println("Connection closed successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
