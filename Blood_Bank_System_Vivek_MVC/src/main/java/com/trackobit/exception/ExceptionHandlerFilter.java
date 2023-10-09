package com.trackobit.exception;



import com.trackobit.exception.BloodBankException;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*")
public class ExceptionHandlerFilter implements Filter {
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        try {
            chain.doFilter(req, res);
        } catch (BloodBankException e) {
            // Handle BloodBankException
            req.setAttribute("errorMessage", e.getMessage());
            req.getRequestDispatcher("error.jsp").forward(req, res);
        }
    }

    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }
}
