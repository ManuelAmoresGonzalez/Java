package com.PrimerAspecto.PrimerAspecto;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class TargetObject {

    private static final Logger log = (Logger) LoggerFactory.getLogger(TargetObject.class);

    public void hello(String message){
        log.info(message);
    }

}
