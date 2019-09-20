package com.edwargonzalez.entities;

import com.edwargonzalez.entities.Cotizacion;
import com.edwargonzalez.entities.Productos;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-09-20T13:54:04")
@StaticMetamodel(Detallecotizacion.class)
public class Detallecotizacion_ { 

    public static volatile SingularAttribute<Detallecotizacion, String> descripcion;
    public static volatile SingularAttribute<Detallecotizacion, Double> precio;
    public static volatile CollectionAttribute<Detallecotizacion, Cotizacion> cotizacionCollection;
    public static volatile SingularAttribute<Detallecotizacion, Integer> iddetallecotizacion;
    public static volatile SingularAttribute<Detallecotizacion, Productos> productosIdproductos;
    public static volatile SingularAttribute<Detallecotizacion, Integer> cantidad;

}