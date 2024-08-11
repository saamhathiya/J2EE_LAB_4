import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pro17")
public class pro17 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        
        String correctUsername = "nikul";
        String correctPassword = "nikul123";

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

                if(username.equals(correctUsername) && password.equals(correctPassword)) {
                      out.println("<html><body>");
            out.println("<h1>Welcome, " + username + "!</h1>");
            out.println("</body></html>");
        } else {
          
            out.println("<html><body>");
            out.println("<h1>Login Failed</h1>");
            out.println("<p>Invalid username or password. Please try again.</p>");
            out.println("<a href=\"login.html\">Go Back to Login</a>");
            out.println("</body></html>");
        }

        out.close();
    }
}
