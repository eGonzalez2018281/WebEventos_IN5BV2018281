package com.edwargonzalez.entities;

import com.edwargonzalez.entities.Areas;
import com.edwargonzalez.entities.Clientes;
import com.edwargonzalez.entities.Cotizacion;
import com.edwargonzalez.entities.Evento;
import com.edwargonzalez.entities.Sucursal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-09-20T13:54:04")
@StaticMetamodel(Reservacion.class)
public class Reservacion_ { 

    public static volatile SingularAttribute<Reservacion, String> descripcion;
    public static volatile SingularAttribute<Reservacion, Date> fechainicio;
    public static volatile SingularAttribute<Reservacion, Evento> idevento;
    public static volatile CollectionAttribute<Reservacion, Cotizacion> cotizacionCollection;
    public static volatile SingularAttribute<Reservacion, Areas> areasIdareas;
    public static volatile SingularAttribute<Reservacion, Date> fechafin;
    public static volatile SingularAttribute<Reservacion, Sucursal> idsucursal;
    public static volatile SingularAttribute<Reservacion, Integer> idreservacion;
    public static volatile SingularAttribute<Reservacion, Clientes> idcliente;

}