package entities;

import entities.Clientes;
import entities.DireccionesClientes;
import entities.EstatusPedidos;
import entities.PedidosDetalles;
import entities.TarjetasClientes;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-12-15T08:09:21")
@StaticMetamodel(PedidosEncabezados.class)
public class PedidosEncabezados_ { 

    public static volatile SingularAttribute<PedidosEncabezados, Integer> pedidoEncabezadoId;
    public static volatile SingularAttribute<PedidosEncabezados, DireccionesClientes> direccionClienteId;
    public static volatile SingularAttribute<PedidosEncabezados, String> visible;
    public static volatile SingularAttribute<PedidosEncabezados, Date> fechaRegistro;
    public static volatile SingularAttribute<PedidosEncabezados, String> facturar;
    public static volatile SingularAttribute<PedidosEncabezados, EstatusPedidos> estatusPedidoId;
    public static volatile SingularAttribute<PedidosEncabezados, Date> fechaPago;
    public static volatile SingularAttribute<PedidosEncabezados, DireccionesClientes> direccionClienteFacturacionId;
    public static volatile SingularAttribute<PedidosEncabezados, String> monto;
    public static volatile SingularAttribute<PedidosEncabezados, String> pagado;
    public static volatile SingularAttribute<PedidosEncabezados, Clientes> clienteId;
    public static volatile SingularAttribute<PedidosEncabezados, String> borrado;
    public static volatile SingularAttribute<PedidosEncabezados, TarjetasClientes> tarjetaClienteId;
    public static volatile SingularAttribute<PedidosEncabezados, PedidosDetalles> pedidosDetalles;

}