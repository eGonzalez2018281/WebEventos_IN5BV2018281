package com.edwargonzalez.entities;

import com.edwargonzalez.entities.Areas;
import com.edwargonzalez.entities.Reservacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-09-20T13:54:04")
@StaticMetamodel(Sucursal.class)
public class Sucursal_ { 

    public static volatile SingularAttribute<Sucursal, String> descripcion;
    public static volatile CollectionAttribute<Sucursal, Reservacion> reservacionCollection;
    public static volatile SingularAttribute<Sucursal, Areas> areasIdareas;
    public static volatile SingularAttribute<Sucursal, Integer> idsucursal;

}