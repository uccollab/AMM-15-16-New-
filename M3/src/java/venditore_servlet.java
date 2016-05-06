import M3_package.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
/**
 *
 * @author Simone Balloccu
 */
@WebServlet(name = "venditore_servlet", urlPatterns = {"/venditore_servlet"})
public class venditore_servlet extends HttpServlet 
{
 
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
            throws ServletException, IOException 
            {
                response.setContentType("text/html;charset=UTF-8");
                HttpSession session = request.getSession(true);
                request.setAttribute("Nome","CIAO");
                if(session.getAttribute("loggato") != null && session.getAttribute("loggato").equals(true))
                {
                    if(session.getAttribute("Classe").equals("Venditore"))
                    {
                        //request.getRequestDispatcher("venditore.jsp").forward(request, response);
                        if(request.getParameter("button") != null)
                        {
                            String Nome = request.getParameter("Nome");
                            String URL = request.getParameter("URL");
                            String Descrizione = request.getParameter("Descrizione");
                            String Prezzo = request.getParameter("Prezzo");
                            String Quantita = request.getParameter("Quantita");
                            //Articolo Riepilogo= new Articolo();
                            //Riepilogo.setId(0006);
                            //Riepilogo.setNome(Nome);
                            //Riepilogo.setFoto(URL);
                            //Riepilogo.setPrezzo(Double.parseDouble(Prezzo));
                            //Riepilogo.setDisponibili(Integer.parseInt(Quantita));
                            if("".equals(Nome))
                            {
                                request.setAttribute("Nome","CIAO");
                                //request.setAttribute("Nome",Nome);
                                //request.setAttribute("URL", URL);
                                //request.setAttribute("Descrizione",Descrizione);
                                //request.setAttribute("Prezzo",Prezzo);
                                //request.setAttribute("Quantita",Quantita);  
                            } 
                        }
                    }
                    else
                    {
                        request.getRequestDispatcher("descrizione.jsp").forward(request, response);
                    }
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