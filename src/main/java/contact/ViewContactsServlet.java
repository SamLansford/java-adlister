package contact;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet("/contacts")
public class ViewContactsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Contact> contacts = new ArrayList<>(Arrays.asList(
        new Contact( 1,"Sam", "sam@gmail.com","123 Sam Way, TX", "4322145954", false),
        new Contact( 2,"Carlos", "carlos@gmail.com","123 Carlos Way, TX", "1231234123", true),
        new Contact( 3,"Micheal", "micheal@gmail.com","123 Micheal Way, TX", "1231232424", false),
        new Contact( 4,"Jacob", "jacob@gmail.com","123 Jacob Way", "2341345234", true)
        ));

        request.setAttribute("contacts", contacts);
        request.getRequestDispatcher("contacts.jsp").forward(request,response);
    }


}
