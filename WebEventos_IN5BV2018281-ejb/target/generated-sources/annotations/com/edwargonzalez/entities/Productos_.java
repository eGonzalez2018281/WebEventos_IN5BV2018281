package com.edwargonzalez.entities;

import com.edwargonzalez.entities.Detallecotizacion;
import com.edwargonzalez.entities.Detallefactura;
import com.edwargonzalez.entities.Tipoproducto;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-09-20T13:54:04")
@StaticMetamodel(Productos.class)
public class Productos_ { 

    public static volatile SingularAttribute<Productos, String> descripcion;
    public static volatile SingularAttribute<Productos, Integer> idproductos;
    public static volatile CollectionAttribute<Productos, Detallefactura> detallefacturaCollection;
    public static volatile SingularAttribute<Productos, Double> precioventa;
    public static volatile SingularAttribute<Productos, Date> fechavencimiento;
    public static volatile CollectionAttribute<Productos, Detallecotizacion> detallecotizacionCollection;
    public static volatile SingularAttribute<Productos, Tipoproducto> tipoproductoIdtipoproducto;

}