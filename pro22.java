import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/pro22")
public class pro22 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        
        session.setAttribute("userName", "nikul");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String url = response.encodeURL("pro22_1");

        out.println("<html><body>");
        out.println("<h1>Session Started</h1>");
        out.println("<p>Welcome, " + session.getAttribute("userName") + "</p>");
        out.println("<p><a href=\"" + url + "\">Go to Next Page</a></p>");
        out.println("</body></html>");
        
        out.close();
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
