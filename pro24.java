import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pro24")
public class pro24 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String cookieName = "nikul";
        String cookieValue = "1232";
        boolean cookieExists = false;

        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals(cookieName)) {
                    cookieExists = true;
                    break;
                }
            }
        }

        if (!cookieExists) {
            Cookie newCookie = new Cookie(cookieName, cookieValue);
            newCookie.setMaxAge(60 * 60 * 24); 
            response.addCookie(newCookie);
            out.println("<p>Cookie 'user' created with value 'guest'.</p>");
        } else {
            out.println("<p>Cookie 'user' already exists.</p>");
        }

        out.println("<h2>All Cookies:</h2>");
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                out.println("<p>Name: " + cookie.getName() + ", Value: " + cookie.getValue() + "</p>");
            }
        } else {
            out.println("<p>No cookies found.</p>");
        }

        out.close();
    }
}
