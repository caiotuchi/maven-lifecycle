package com.project;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloServletIT {

    @Test
    void testHelloServlet() {
        HelloServlet helloServlet = new HelloServlet();
        assertEquals("/WEB-INF/views/hello.jsp", helloServlet.getJspPath());
    }
}
