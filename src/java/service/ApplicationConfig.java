/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author LeoNa
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(service.ClientesFacadeREST.class);
        resources.add(service.DireccionesClientesFacadeREST.class);
        resources.add(service.EstatusPedidosFacadeREST.class);
        resources.add(service.PedidosDetallesFacadeREST.class);
        resources.add(service.PedidosEncabezadosFacadeREST.class);
        resources.add(service.PersonalFacadeREST.class);
        resources.add(service.ProductosFacadeREST.class);
        resources.add(service.SucursalesFacadeREST.class);
        resources.add(service.TarjetasClientesFacadeREST.class);
        resources.add(service.VariantesProductosFacadeREST.class);
    }
    
}
