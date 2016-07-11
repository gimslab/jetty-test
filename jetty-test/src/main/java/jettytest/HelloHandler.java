package jettytest;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;

public class HelloHandler implements Handler {

	public void start() throws Exception {
		// TODO Auto-generated method stub

	}

	public void stop() throws Exception {
		// TODO Auto-generated method stub

	}

	public boolean isRunning() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isStarted() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isStarting() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isStopping() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isStopped() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isFailed() {
		// TODO Auto-generated method stub
		return false;
	}

	public void addLifeCycleListener(Listener listener) {
		// TODO Auto-generated method stub

	}

	public void removeLifeCycleListener(Listener listener) {
		// TODO Auto-generated method stub

	}

	public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException {
		// TODO Auto-generated method stub

	}

	public void setServer(Server server) {
		// TODO Auto-generated method stub

	}

	public Server getServer() {
		// TODO Auto-generated method stub
		return null;
	}

	public void destroy() {
		// TODO Auto-generated method stub

	}

}
