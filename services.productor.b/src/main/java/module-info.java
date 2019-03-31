/**
 * @author Sebastian Avila A.
 */
module services.productor.b {
  requires services.consumidor;

  provides com.sebastian.servicios.port.Servicio with com.sebastian.productor.b.ServicioB;
}
