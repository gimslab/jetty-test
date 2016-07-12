package jettytest;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;

public class HelloWorldServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) throws Exception {

		Server server = new Server(8080);
		ServletHandler handler = new ServletHandler();
		server.setHandler(handler);
		
		handler.addServletWithMapping(HelloWorldServlet.class, "/");
		handler.addServletWithMapping(HelloWorldServlet2.class, "/2");

		server.start();
		server.join();
//		Thread.sleep(5000);
//		server.stop();
//		System.out.println("stopped");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        response.setStatus(HttpServletResponse.SC_OK);
        response.getWriter().println("<h1>Hello from HelloServlet</h1>");	}
}
