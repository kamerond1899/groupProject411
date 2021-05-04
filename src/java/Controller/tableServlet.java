package Controller;

/**
 * 
 * IST 411 
 * tableServlet.java 
 * Purpose: Servlet class which controls the backend of the stateTable.jsp page. Takes the request attributes from
 * caseSElect, trendSelect, or vaccineSelect, and then uses it to determine what table will be created. Sends the table object
 * as a request attribute, which will then be displayed on stateTable.jsp.
 *  
 * 
 * @author Kameron Dangleben , River Martinez 4/20/21
 */

import SharedClasses.Database;
import SharedClasses.Dataset;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class tableServlet extends HttpServlet {
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
      @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String url ="/index.html"; //default fallback url
        String action = request.getParameter("action");
        if (action == null) {
            action = "confirm";  // default action
        }
        else if (action.equals("confirm")) {                
            String tableName = request.getParameter("name");
            String tableMonth = request.getParameter("month");
            String tableState = request.getParameter("state");
            
            String returnLink = ""; //Initialize return link, will be used to return user to their previous page
            
            ArrayList<Dataset> tableDataset = new ArrayList<>(); //This is the dataset that will be put into the HTML table
            
            //Start database
            Database db = new Database();
            try {
                tableDataset = db.selectData(tableName, tableMonth, tableState); //Select data @tableNAme, tableMonth, and tableState
            } catch (SQLException ex) {//Catch SQL errors
                Logger.getLogger(tableServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            String tableHTML = "";//Initialize table string *note: the whole table will be stored in this string
            String pageHeader = tableState + " " + tableName + " for " + tableMonth; //This will be the page title. ex: Alabama Monthly Cases and Death Data for January 2021
            
            
            //Begin creating table headers
            try{
            if(tableDataset.get(0).getConstructorFlag() == 2) //If the constructorFlag is 2(Cases Data), then set headers to:
                //Date, State , Cases, Deaths
            {
                returnLink = "caseSelect.html";
                tableHTML = "<tr>" +
            "                   <th> Date </th>" +
            "                   <th> State </th>" +
            "                   <th> Cases </th>" +
            "                   <th>Deaths</th>" +
            "               </tr>";
            }
            else if(tableDataset.get(0).getConstructorFlag() == 3)//If constructorFlag is 3(Vaccine Data), set headers to:
                //Date, State, Total Vacc, Total Dist, People Vaccinated, People Fully Vacc, Daily Vaccinated
            {
                returnLink = "vaccineSelect.html";
                tableHTML = "<tr>" +
            "                   <th> Date </th>" +
            "                   <th> State </th>" +
            "                   <th> Total Vaccines </th>" +
                        "       <th> Total Distributed </th>" +
            "                   <th> People Vaccinated </th>" +
            "                   <th> People Fully Vaccinated </th>" 
                             + "<th>Daily Vaccinated </th>" +
            "               </tr>";
            }
            else if(tableDataset.get(0).getConstructorFlag() == 4)
            {
                //If constructor flag is 4(Trends), add the appropriate headers to tableHTML
                //State, Cases, Deaths, Total Vac, Total Dist, People Vacc, People Fully Vacc, Daily Vacc
                returnLink = "trendSelect.html";
                tableHTML = "<tr>" +
            "                   <th> State </th>" +
                                    "                   <th> Cases </th>" +
            "                   <th>Deaths</th>" +
            "                   <th> Total Vaccines </th>" +
                        "       <th> Total Distributed </th>" +
            "                   <th> People Vaccinated </th>" +
            "                   <th> People Fully Vaccinated </th>" 
                             + "<th>Daily Vaccinated </th>" +
            "               </tr>";
            }
            else //If constructor flag is not set, no headers will be grabbed
            {
                returnLink = "index.html";
                tableHTML = "Unable to get headers. Please try again. <br><br><br>";//prompt
            }
            }
            catch(Exception e){ //In case there is no data for a particular month and state, display an in browser error message.
                returnLink = "index.html";
                tableHTML = "No data for " + tableMonth + " and " + tableState +
                        ".<br><br><i>Note: Many states lack data for January and February 2020.</i>"; 
            }//End creating table headers
            
            for(int i= 0; i < tableDataset.size();i++)//Starting at i, iterate through the tableDataset object
            {
                //Add the String representation of each object from tableDataset into 'tableHTML'. This is because JSP
                //can't directly parse ArrayList objects.
                tableHTML = tableHTML + tableDataset.get(i).toString();
            }
           
            request.setAttribute("tableHTML", tableHTML);//set the table as a request attribute
            request.setAttribute("pageHeader", pageHeader);//Page Header attribute
            request.setAttribute("returnLink", returnLink);
            url = "/stateTable.jsp";   // send to the final page
    }      
              getServletContext()
            .getRequestDispatcher(url)
            .forward(request, response);       
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Displays the data table from the Dataset object";
    }// </editor-fold>

}
