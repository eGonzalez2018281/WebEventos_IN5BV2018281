package com.edwargonzalez.entities;

import com.edwargonzalez.entities.Reservacion;
import com.edwargonzalez.entities.Sucursal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-09-20T13:54:04")
@StaticMetamodel(Areas.class)
public class Areas_ { 

    public static volatile SingularAttribute<Areas, String> descripcion;
    public static volatile CollectionAttribute<Areas, Reservacion> reservacionCollection;
    public static volatile CollectionAttribute<Areas, Sucursal> sucursalCollection;
    public static volatile SingularAttribute<Areas, Integer> idareas;

}