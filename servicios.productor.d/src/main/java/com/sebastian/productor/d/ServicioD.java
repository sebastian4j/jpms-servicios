package com.sebastian.productor.d;

import java.util.concurrent.atomic.AtomicInteger;
import com.sebastian.servicios.port.Servicio;

/**
 * utiliza servicio exponiendo la interface {@link Servicio}.
 *
 * carga de servicios anterior a los modulos
 *
 * java --class-path mods/servicios.productor.c.jar --show-module-resolution --module-path mods
 * --module servicios.consumidor/com.sebastian.servicios.Consumidor
 *
 * como no es un modulo y queda en el module path termina en como automatic module y es cargado como
 * un servicio antiguo, si fuera un modulo explicito seria ignorado (servicio C)
 *
 * @author Sebastián Ávila A.
 */
public final class ServicioD implements Servicio {
  private final AtomicInteger ai = new AtomicInteger();

  @Override
  public String identificar() {
    return "hola desde el servicio D " + ai.incrementAndGet() + " " + this;
  }

}
