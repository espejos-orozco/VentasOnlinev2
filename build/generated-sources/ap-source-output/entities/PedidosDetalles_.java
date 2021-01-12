package entities;

import entities.PedidosEncabezados;
import entities.VariantesProductos;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-12-15T23:04:56")
@StaticMetamodel(PedidosDetalles.class)
public class PedidosDetalles_ { 

    public static volatile SingularAttribute<PedidosDetalles, Integer> pedidoEncabezadoId;
    public static volatile SingularAttribute<PedidosDetalles, String> precio;
    public static volatile SingularAttribute<PedidosDetalles, PedidosEncabezados> pedidosEncabezados;
    public static volatile SingularAttribute<PedidosDetalles, Date> fechaRegistro;
    public static volatile SingularAttribute<PedidosDetalles, VariantesProductos> varianteProductoId;

}