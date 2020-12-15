package entities;

import entities.PedidosEncabezados;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-12-15T08:09:20")
@StaticMetamodel(EstatusPedidos.class)
public class EstatusPedidos_ { 

    public static volatile SingularAttribute<EstatusPedidos, String> descripcion;
    public static volatile SingularAttribute<EstatusPedidos, Integer> estatusPedidoId;
    public static volatile CollectionAttribute<EstatusPedidos, PedidosEncabezados> pedidosEncabezadosCollection;

}