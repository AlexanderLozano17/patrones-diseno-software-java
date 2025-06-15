package com.patron.estructural.proxy;
/**
 * El patrón Proxy es un patrón de diseño estructural que actúa como un
 * sustituto o intermediario de otro objeto para controlar el acceso a él. Se
 * usa cuando necesitas agregar lógica adicional antes o después de acceder al
 * objeto real (por ejemplo, control de acceso, carga diferida o registro).
 *
 * 
 * 🧠 Proxy Pattern – Concepto Problema que resuelve: 
 * Permite controlar el
 * acceso a un objeto sin cambiar su interfaz.
 * 
 * Solución: Crear una clase proxy que implemente la misma interfaz que el
 * objeto real y contenga una referencia a él.
 * 
 * Aplicable cuando:
 * 
 * Quieres agregar lógica sin modificar la clase original.
 * 
 * El objeto real es costoso de crear o acceder (carga diferida, lazy loading).
 * 
 * Necesitas seguridad, cache, logs, etc.
 * 
 * ✅ Ventajas 
 * Controla el acceso al objeto real sin modificarlo.
 * 
 * Permite implementar lazy loading, autenticación, cache, logging, etc.
 * 
 * Se puede usar para encapsular recursos costosos.
 * 
 * ⚠️ Desventajas 
 * Aumenta la complejidad y número de clases.
 * 
 * Puede ocultar comportamientos que el cliente debería conocer.
 */
