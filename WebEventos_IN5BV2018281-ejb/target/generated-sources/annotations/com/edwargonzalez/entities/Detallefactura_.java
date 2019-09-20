package com.edwargonzalez.entities;

import com.edwargonzalez.entities.Facturacion;
import com.edwargonzalez.entities.Productos;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-09-20T13:54:04")
@StaticMetamodel(Detallefactura.class)
public class Detallefactura_ { 

    public static volatile SingularAttribute<Detallefactura, String> descripcion;
    public static volatile SingularAttribute<Detallefactura, Double> precio;
    public static volatile CollectionAttribute<Detallefactura, Facturacion> facturacionCollection;
    public static volatile SingularAttribute<Detallefactura, Productos> productosIdproductos;
    public static volatile SingularAttribute<Detallefactura, Integer> cantidad;
    public static volatile SingularAttribute<Detallefactura, Integer> iddetallefactura;

}