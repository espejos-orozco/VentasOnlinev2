package entities;

import entities.Clientes;
import entities.PedidosEncabezados;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-12-15T08:09:21")
@StaticMetamodel(DireccionesClientes.class)
public class DireccionesClientes_ { 

    public static volatile SingularAttribute<DireccionesClientes, String> principal;
    public static volatile SingularAttribute<DireccionesClientes, Integer> direccionClienteId;
    public static volatile SingularAttribute<DireccionesClientes, String> codigoPostal;
    public static volatile SingularAttribute<DireccionesClientes, Clientes> clienteId;
    public static volatile SingularAttribute<DireccionesClientes, Date> fechaRegistro;
    public static volatile SingularAttribute<DireccionesClientes, String> calle;
    public static volatile CollectionAttribute<DireccionesClientes, PedidosEncabezados> pedidosEncabezadosCollection1;
    public static volatile SingularAttribute<DireccionesClientes, String> localidad;
    public static volatile SingularAttribute<DireccionesClientes, String> region;
    public static volatile SingularAttribute<DireccionesClientes, String> colonia;
    public static volatile CollectionAttribute<DireccionesClientes, PedidosEncabezados> pedidosEncabezadosCollection;

}