package murach.inf;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;
import murach.business.*;

public class InformationServlet extends HttpServlet{
	
    @Override
    protected void doPost(HttpServletRequest request, 
                          HttpServletResponse response) 
                          throws ServletException, IOException {

        String url = "/index.html";

        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";  // default action
        }
        // perform action and set URL to appropriate page
        if (action.equals("join")) {
            url = "/index.html";    // the "join" page
        }
        else if (action.equals("add")) {                
            // get parameters from the request	
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String date = request.getParameter("dateOfBirth");
            String hear = request.getParameter("heardFrom");
            String receive_up = request.getParameter("wantsUpdates");
            String receive_email = request.getParameter("emailOK");
            String contact = request.getParameter("contactVia");

            // store data in User object and save User object in db
            User user = new User(firstName, lastName, email, date);
            UserSelection choose = new UserSelection(hear, receive_up, receive_email, contact);
            
            // set User object in request object and set URL
            request.setAttribute("user", user);
            request.setAttribute("choose", choose);
            url = "/result.jsp";   // the "thanks" page
        }
        
        // forward request and response objects to specified URL
        getServletContext()
            .getRequestDispatcher(url)
            .forward(request, response);
    }
    @Override
    protected void doGet(HttpServletRequest request, 
                         HttpServletResponse response) 
                         throws ServletException, IOException {
        doPost(request, response);
    }    
	
}
