package com.patron.estructural.composite;
/**
 * 🌳 Composite Pattern 
 * – Concepto Problema que resuelve: Permite tratar objetos
 * individuales y grupos de objetos de la misma forma.
 * 
 * Solución: Define una interfaz común para todos los objetos de una jerarquía,
 * tanto simples (hojas) como compuestos (contenedores).
 * 
 * Aplicable cuando:
 * 
 * Tienes una estructura jerárquica (como árboles).
 * 
 * Quieres que los clientes no distingan entre objetos individuales y
 * compuestos.
 * 
 * ✅ Ventajas 
 * Facilita el trabajo con estructuras jerárquicas (como árboles).
 * 
 * Simplifica el código del cliente (no necesita distinguir entre hoja y
 * compuesto).
 * 
 * Fomenta el principio de Open/Closed.
 * 
 * ⚠️ Desventajas 
 * Puede ser más complejo si no necesitas estructura jerárquica.
 * 
 * A veces cuesta limitar ciertas operaciones solo a hojas o a compuestos.
 */
