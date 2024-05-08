package com.assignment.restfulemployee.RESTApi.Resource;

import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/api")
public class EmployeeApplication extends Application {

	@Override
    public Set<Class<?>> getClasses() {
        return super.getClasses();
    }
}
