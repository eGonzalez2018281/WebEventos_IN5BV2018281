package com.edwargonzalez.entities;

import com.edwargonzalez.entities.Productos;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-09-20T13:54:04")
@StaticMetamodel(Tipoproducto.class)
public class Tipoproducto_ { 

    public static volatile SingularAttribute<Tipoproducto, String> descripcion;
    public static volatile SingularAttribute<Tipoproducto, Integer> idtipoproducto;
    public static volatile CollectionAttribute<Tipoproducto, Productos> productosCollection;

}