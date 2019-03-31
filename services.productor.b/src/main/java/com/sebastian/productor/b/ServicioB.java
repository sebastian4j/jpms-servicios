package com.sebastian.productor.b;

import com.sebastian.servicios.port.Servicio;

/**
 * utiliza servicio exponiendo la interface {@link Servicio}.
 *
 * @author Sebastián Ávila A.
 */
public class ServicioB implements Servicio {

  @Override
  public String identificar() {
    return "Hola desde el Servicio B";
  }
}
