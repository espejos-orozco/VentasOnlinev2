package entities;

import entities.Clientes;
import entities.PedidosEncabezados;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-12-15T08:09:21")
@StaticMetamodel(TarjetasClientes.class)
public class TarjetasClientes_ { 

    public static volatile SingularAttribute<TarjetasClientes, Integer> codigoSeguridad;
    public static volatile SingularAttribute<TarjetasClientes, Clientes> clienteId;
    public static volatile SingularAttribute<TarjetasClientes, Date> fechaRegistro;
    public static volatile SingularAttribute<TarjetasClientes, Integer> tarjetaClienteId;
    public static volatile SingularAttribute<TarjetasClientes, String> fechaExpiracion;
    public static volatile SingularAttribute<TarjetasClientes, String> numeroTarjeta;
    public static volatile SingularAttribute<TarjetasClientes, String> nombre;
    public static volatile SingularAttribute<TarjetasClientes, String> activo;
    public static volatile CollectionAttribute<TarjetasClientes, PedidosEncabezados> pedidosEncabezadosCollection;

}