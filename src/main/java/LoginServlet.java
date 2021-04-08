import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/htm");
        String output = "";
        output += "<h1>Login Page";
        output += "<form>";
        output += "<input name='username' placeholder='Enter username' />";
        output += "<button>Submit</button>";
        output += "</form>";
        out.println(output);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        if (username.equals("sam")) {
            System.out.println("LOGIN POST REQUEST SUBMITTED");
            resp.sendRedirect("/hello");
        } else {
            resp.sendRedirect("/about");
        }
    }
}
