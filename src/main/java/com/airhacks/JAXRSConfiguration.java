package com.airhacks;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
public class JAXRSConfiguration extends Application {

    @Override
    public Set<Object> getSingletons() {
        final HashSet<Object> singletons = new HashSet<>();
        singletons.add(new CacheResource());
        return singletons;
    }
}
