package org.asmus.minirest;

import javax.xml.bind.annotation.XmlRootElement;
import org.asmus.testlib.Hummelrummel;

@XmlRootElement
public class User {
    
    public User() {
        new Hummelrummel().init();
    }
    
    public int number;
    public String name;
}
