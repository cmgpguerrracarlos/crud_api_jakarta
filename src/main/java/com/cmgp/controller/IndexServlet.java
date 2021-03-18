package com.cmgp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class IndexServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {   
        req.getRequestDispatcher("home.jsp").forward(req, res);
    }
}
