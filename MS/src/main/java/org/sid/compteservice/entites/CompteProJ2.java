package org.sid.compteservice.entites;


import org.sid.compteservice.enmus.TypeCompte;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "p2",types = Compte.class)
public interface CompteProJ2 {

    public  double getSolde();
    public TypeCompte getType();

}
