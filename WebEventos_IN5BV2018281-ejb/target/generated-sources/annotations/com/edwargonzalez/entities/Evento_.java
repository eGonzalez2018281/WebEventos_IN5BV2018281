package com.edwargonzalez.entities;

import com.edwargonzalez.entities.Reservacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-09-20T13:54:04")
@StaticMetamodel(Evento.class)
public class Evento_ { 

    public static volatile SingularAttribute<Evento, Integer> idevento;
    public static volatile CollectionAttribute<Evento, Reservacion> reservacionCollection;
    public static volatile SingularAttribute<Evento, String> tipoevento;

}