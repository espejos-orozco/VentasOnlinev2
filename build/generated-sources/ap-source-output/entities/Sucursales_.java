package entities;

import entities.Personal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-12-15T08:09:21")
@StaticMetamodel(Sucursales.class)
public class Sucursales_ { 

    public static volatile SingularAttribute<Sucursales, Date> fechaInauguracion;
    public static volatile SingularAttribute<Sucursales, Integer> sucursalId;
    public static volatile CollectionAttribute<Sucursales, Personal> personalCollection;
    public static volatile SingularAttribute<Sucursales, String> alias;
    public static volatile SingularAttribute<Sucursales, String> activo;

}