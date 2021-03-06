package activity2;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cgonz
 */
@WebServlet(name = "PageGenerator", urlPatterns = {"/pager"})
public class PageGenerator extends HttpServlet {
    private static final int NUM_ROWS_TABLE = 12;
    private static final int NUM_COLUMNS_TABLE = 5;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Sample Page Generator</title>");
            out.println("<link rel=\"stylesheet\" "
                    + "type=\"text/css\" href=\"indexStyleSheet.css\">");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Sample Servlet PageGenerator at " + 
                    request.getContextPath() + "</h1>");
            out.println("<table border='5'>");
            for(int j =1 ; j < NUM_COLUMNS_TABLE+1; j++){
                    out.println("<th > heading " + j);
                    out.println("</th>");
                }
            for(int i = 1 ; i < NUM_ROWS_TABLE+1 ; i++){
                out.println("<tr>");
                for(int j =1 ; j < NUM_COLUMNS_TABLE+1 ; j++){
                    out.println("<td> row " + i + " cell " + j);
                    out.println("</td>");
                }
                out.println("</tr>");
            }
            out.println("</table>");
            out.println("<br>");
            out.println("<a href=\"index.jsp\"> Back to Home </a>");
            out.println("<br>");
            out.println("<br>");
            out.println("<footer> 2017 Chris Gonzalez ");
            out.println("</footer>");
            out.println("</body>");
            out.println("</html>");
        }catch(Exception e ){
            request.setAttribute("errMsg", e.getMessage());
        }
    }

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
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
