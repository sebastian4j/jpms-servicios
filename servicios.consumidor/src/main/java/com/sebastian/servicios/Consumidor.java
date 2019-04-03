package com.sebastian.servicios;

import java.util.ServiceLoader;
import java.util.ServiceLoader.Provider;
import java.util.stream.Collectors;
import com.sebastian.servicios.port.Servicio;

/**
 * utiliza servicio exponiendo la interface {@link Servicio}.
 *
 * compilar:
 *
 * mvn clean package
 *
 * lanzar:
 *
 * java --module-path mods --module servicios.consumidor/com.sebastian.servicios.Consumidor
 *
 * lanzar y ver la resolucion de modulos:
 *
 * java --show-module-resolution --module-path mods --module
 * servicios.consumidor/com.sebastian.servicios.Consumidor
 *
 *
 * @author Sebastián Ávila A.
 */
public class Consumidor {
  public static void main(String[] args) {
    ServiceLoader.load(Servicio.class).stream().map(Provider::get).collect(Collectors.toList())
        .forEach(s -> System.out.println(s.identificar()));
    ServiceLoader.load(Servicio.class).stream().map(Provider::get).collect(Collectors.toList())
        .forEach(s -> System.out.println(s.identificar()));
    ServiceLoader.load(Servicio.class).stream().map(Provider::get).collect(Collectors.toList())
        .forEach(s -> System.out.println(s.identificar()));
    ServiceLoader.load(Servicio.class).stream().map(Provider::get).collect(Collectors.toList())
        .forEach(s -> System.out.println(s.identificar()));
  }
}

