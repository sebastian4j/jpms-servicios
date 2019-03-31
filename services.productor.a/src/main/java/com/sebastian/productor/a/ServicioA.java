package com.sebastian.productor.a;

import com.sebastian.servicios.port.Servicio;

/**
 * utiliza servicio exponiendo la interface {@link Servicio}.
 *
 * @author Sebastián Ávila A.
 */
public class ServicioA implements Servicio {

  @Override
  public String identificar() {
    return "Hola desde el Servicio A";
  }
}
