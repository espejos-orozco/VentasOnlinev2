package entities;

import entities.DireccionesClientes;
import entities.PedidosEncabezados;
import entities.TarjetasClientes;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-12-15T08:09:20")
@StaticMetamodel(Clientes.class)
public class Clientes_ { 

    public static volatile SingularAttribute<Clientes, String> apellidos;
    public static volatile SingularAttribute<Clientes, String> password;
    public static volatile SingularAttribute<Clientes, Integer> clienteId;
    public static volatile SingularAttribute<Clientes, Date> fechaRegistro;
    public static volatile CollectionAttribute<Clientes, DireccionesClientes> direccionesClientesCollection;
    public static volatile SingularAttribute<Clientes, String> telefono;
    public static volatile SingularAttribute<Clientes, String> nombre;
    public static volatile SingularAttribute<Clientes, String> correoElectronico;
    public static volatile SingularAttribute<Clientes, String> activo;
    public static volatile CollectionAttribute<Clientes, PedidosEncabezados> pedidosEncabezadosCollection;
    public static volatile CollectionAttribute<Clientes, TarjetasClientes> tarjetasClientesCollection;

}