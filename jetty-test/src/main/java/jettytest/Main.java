package jettytest;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.server.handler.HandlerCollection;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class Main {

	public static void main(String[] args) throws Exception {
		Server server = new Server();

		ServerConnector connector = new ServerConnector(server);
		connector.setPort(8888);
		server.setConnectors(new Connector[] { connector });

		ServletContextHandler context = new ServletContextHandler();
		context.setContextPath("/");
		context.addServlet(HelloServlet.class, "/hello");
		context.addServlet(AsyncEchoServlet.class, "/echo/*");
		context.setHandler(new HelloHandler());

		HandlerCollection handlers = new HandlerCollection();
//		handlers.setHandlers(new Handler[] { context, new DefaultHandler() });
//		handlers.addHandler(context);
		handlers.setHandlers(new Handler[] { new DefaultHandler() , context});

		server.start();
		server.join();
	}

}
