package com.app.rest;

import com.app.runnables.URLHealthProcessor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Resource;
import javax.enterprise.concurrent.ManagedScheduledExecutorService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author neels
 */
@Path("urlCheck")
public class URLHealthResource {
    
    @Resource(lookup = "java:comp/DefaultManagedScheduledExecutorService")
    private ManagedScheduledExecutorService scheduledExecutorService;
    
    @GET
    public String checkHealthOfApp(){
        String message ="";
        scheduledExecutorService.schedule(new URLHealthProcessor(), 1, TimeUnit.SECONDS);
        
        message="Health check initiated";
        return message;
        
    }
    
}
