package entities;

import entities.Productos;
import entities.Sucursales;
import entities.VariantesProductos;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-12-15T08:09:20")
@StaticMetamodel(Personal.class)
public class Personal_ { 

    public static volatile SingularAttribute<Personal, Date> fechaIngresoDate;
    public static volatile SingularAttribute<Personal, Integer> personalId;
    public static volatile SingularAttribute<Personal, String> accesoSistema;
    public static volatile CollectionAttribute<Personal, Sucursales> sucursalesCollection;
    public static volatile SingularAttribute<Personal, Date> fechaRegistro;
    public static volatile CollectionAttribute<Personal, Productos> productosCollection;
    public static volatile SingularAttribute<Personal, String> nombre;
    public static volatile SingularAttribute<Personal, Date> fechaNacimientoDate;
    public static volatile SingularAttribute<Personal, String> password;
    public static volatile SingularAttribute<Personal, String> apellido;
    public static volatile SingularAttribute<Personal, String> usuario;
    public static volatile CollectionAttribute<Personal, VariantesProductos> variantesProductosCollection;
    public static volatile SingularAttribute<Personal, String> activo;

}