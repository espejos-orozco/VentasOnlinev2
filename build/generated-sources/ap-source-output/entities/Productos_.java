package entities;

import entities.Personal;
import entities.VariantesProductos;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-12-15T23:04:56")
@StaticMetamodel(Productos.class)
public class Productos_ { 

    public static volatile SingularAttribute<Productos, String> descripcion;
    public static volatile SingularAttribute<Productos, Integer> tipoProductoId;
    public static volatile SingularAttribute<Productos, Personal> personalId;
    public static volatile SingularAttribute<Productos, Integer> productoId;
    public static volatile SingularAttribute<Productos, Date> fechaRegistro;
    public static volatile SingularAttribute<Productos, String> nombre;
    public static volatile CollectionAttribute<Productos, VariantesProductos> variantesProductosCollection;
    public static volatile SingularAttribute<Productos, String> activo;

}