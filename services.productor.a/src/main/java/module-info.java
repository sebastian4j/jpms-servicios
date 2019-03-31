/**
 * @author Sebastian Avila A.
 */
module services.productor.a {
  requires services.consumidor;

  provides com.sebastian.servicios.port.Servicio with com.sebastian.productor.a.ServicioA;
}
