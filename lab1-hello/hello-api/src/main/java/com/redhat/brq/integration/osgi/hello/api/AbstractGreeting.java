package com.redhat.brq.integration.osgi.hello.api;

import org.osgi.service.log.LogService;


public abstract class AbstractGreeting implements Greeting {

    protected LogService logginService;

    public LogService getLogginService() {
        return logginService;
    }

    public void setLogginService(LogService logginService) {
        this.logginService = logginService;
    }

    protected void print(String msg) {
        logginService.log(LogService.LOG_INFO, msg);
        System.out.println(msg);
    }
}
