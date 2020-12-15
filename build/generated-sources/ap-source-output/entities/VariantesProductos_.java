package entities;

import entities.PedidosDetalles;
import entities.Personal;
import entities.Productos;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-12-15T08:09:21")
@StaticMetamodel(VariantesProductos.class)
public class VariantesProductos_ { 

    public static volatile SingularAttribute<VariantesProductos, String> descripcion;
    public static volatile SingularAttribute<VariantesProductos, Integer> disponibilidad;
    public static volatile SingularAttribute<VariantesProductos, BigDecimal> precio;
    public static volatile SingularAttribute<VariantesProductos, Personal> personalId;
    public static volatile SingularAttribute<VariantesProductos, Integer> varianteProductoId;
    public static volatile SingularAttribute<VariantesProductos, Date> fechaRegistro;
    public static volatile SingularAttribute<VariantesProductos, Productos> productoId;
    public static volatile CollectionAttribute<VariantesProductos, PedidosDetalles> pedidosDetallesCollection;
    public static volatile SingularAttribute<VariantesProductos, String> activo;

}