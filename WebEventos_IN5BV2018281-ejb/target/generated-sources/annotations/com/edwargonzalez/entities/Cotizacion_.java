package com.edwargonzalez.entities;

import com.edwargonzalez.entities.Detallecotizacion;
import com.edwargonzalez.entities.Facturacion;
import com.edwargonzalez.entities.Reservacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-09-20T13:54:04")
@StaticMetamodel(Cotizacion.class)
public class Cotizacion_ { 

    public static volatile SingularAttribute<Cotizacion, Reservacion> reservacionIdreservacion;
    public static volatile SingularAttribute<Cotizacion, Integer> idcotizacion;
    public static volatile CollectionAttribute<Cotizacion, Facturacion> facturacionCollection;
    public static volatile SingularAttribute<Cotizacion, Detallecotizacion> detallecotizacionIddetallecotizacion;

}