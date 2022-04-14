package org.sid.compteservice.entites;


import org.springframework.data.rest.core.config.Projection;

@Projection(name = "p1",types = Compte.class)
public interface CompteProJ1 {
    public  Long getCode();
    public  double getSolde();

}
