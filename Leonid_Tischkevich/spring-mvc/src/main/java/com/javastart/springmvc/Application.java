package com.javastart.springmvc;

import com.javastart.springmvc.config.ApplicationConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class Application implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext annotationContext = new AnnotationConfigWebApplicationContext();
        annotationContext.register(ApplicationConfig.class);
        servletContext.addListener(new ContextLoaderListener(annotationContext));

        ServletRegistration.Dynamic servletRegistration = servletContext.addServlet("dispatcher",
                new DispatcherServlet(annotationContext));

        servletRegistration.addMapping("/");
        servletRegistration.setLoadOnStartup(1);
    }
}