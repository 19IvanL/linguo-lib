package ams2.linguo.util;

import java.io.IOException;
import java.net.Socket;

import ams2.linguo.interfaces.*;
import ams2.linguo.queries.*;
import net.sf.lipermi.exception.LipeRMIException;
import net.sf.lipermi.handler.CallHandler;
import net.sf.lipermi.net.IServerListener;
import net.sf.lipermi.net.Server;

public class LipeRMIServer {

	private static Server server;
	final private static short PORT = 2460;

	public static void main(String[] args) {
		System.out.println("Loading server...");
		CallHandler callHandler = new CallHandler();
		try {
			callHandler.registerGlobal(ITestQueries.class, new TestQueries());
			//			callHandler.registerGlobal(ICourseQueries.class, new CourseQueries());
			//			callHandler.registerGlobal(ILessonQueries.class, new LessonQueries());
			openServer(PORT, callHandler);
		} catch (LipeRMIException e) {
			e.printStackTrace();
		}
	}

	public static void openServer(short port, CallHandler callHandler) {
		try {
			server = new Server();
			server.bind(PORT, callHandler);
			System.out.println("Server running\n");
			// Controlar la conexion de clientes al servidor
			server.addServerListener(new IServerListener() {
				@Override
				public void clientConnected(Socket arg0) {
					System.out.println("Client connected (" + arg0.getInetAddress() + ":" + arg0.getPort() + ")");
				}
				@Override
				public void clientDisconnected(Socket arg0) {
					System.out.println("Client disconnected\n");
				}
			});
		} catch (IOException e) {
			System.out.println("Error when trying to open server " + e.getMessage());
		}
	}

	public void closeServer() {
		server.close();
		System.out.println("Server closed successfully");
	}

}
