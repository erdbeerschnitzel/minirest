package org.asmus.minirest;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;


@RequestScoped
@Named
public class Handler {

    public boolean getActive() {
        return true;
    }
    
    public User getInfo() {
        return null;
    }
}
