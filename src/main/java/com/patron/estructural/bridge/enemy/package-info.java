package com.patron.estructural.bridge.enemy;
/**
 * El patrón Bridge es un patrón de diseño estructural que separa una
 * abstracción de su implementación, permitiendo que ambas evolucionen de forma
 * independiente. Es especialmente útil cuando tienes jerarquías paralelas de
 * clases que pueden crecer de manera combinatoria si no se desacoplan.
 *
 *
 *🧩 Bridge Pattern – Concepto
 * Problema que resuelve: Evita la explosión de subclases al separar la
 * abstracción de la implementación.
 * 
 * Solución: Extrae la implementación a una interfaz separada, y luego hace que
 * la abstracción la use por composición.
 * 
 * Aplicable cuando:
 * 
 * Quieres separar interfaces de plataformas concretas.
 * 
 * Deseas cambiar implementaciones en tiempo de ejecución sin modificar la
 * abstracción.
 * 
 * Tienes múltiples dimensiones de cambio (por ejemplo: Forma y Color).
 *
 * ✅ Ventajas
 * Separación clara de responsabilidades.
 * 
 * Se puede extender la abstracción y la implementación de forma independiente.
 * 
 * Favorece la composición sobre la herencia.
 * 
 * ⚠️ Desventajas
 * Introduce más clases e interfaces.
 * 
 * Puede ser innecesario si el sistema es simple.
 */
