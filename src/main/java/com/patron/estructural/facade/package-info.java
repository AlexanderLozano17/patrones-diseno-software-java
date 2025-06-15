package com.patron.estructural.facade;
/**
 * 🏛️ Facade Pattern 
 * – Concepto Problema que resuelve: Oculta la complejidad de
 * un sistema grande ofreciendo una única interfaz de alto nivel.
 * 
 * Solución: Introducir una clase "fachada" que agrupe y coordine las llamadas a
 * múltiples clases del sistema.
 * 
 * Aplicable cuando:
 * 
 * Hay un sistema complejo y necesitas simplificar su uso externo.
 * 
 * Quieres desacoplar el cliente del subsistema.
 * 
 * Estás construyendo APIs públicas o SDKs.
 * 
 * ✅ Ventajas 
 * Oculta la complejidad del subsistema.
 * 
 * Reduce el acoplamiento entre cliente y clases internas.
 * 
 * Hace que el código cliente sea más limpio y fácil de mantener. 
 * 
 * ⚠️ Desventajas
 * Puede convertirse en una clase "Dios" si no se organiza bien.
 * 
 * Si se abusa de ella, puede ocultar detalles útiles del subsistema.
 */
