package com.patron.factory;

/**
 * El Patrón Factory es un patrón de diseño creacional que proporciona una
 * interfaz para crear objetos en una superclase, pero permite que las subclases
 * decidan qué clase instanciar. Permite delegar la lógica de creación de
 * objetos a clases especializadas, favoreciendo la encapsulación y el principio
 * de inversión de dependencias.
 * 
 * ✅ Beneficios del patrón Factory 
 * Separa la lógica de creación del uso de objetos.
 * 
 * Facilita la escalabilidad al agregar nuevas implementaciones sin modificar el
 * código cliente.
 * 
 * Reduce el acoplamiento entre el código cliente y las clases concretas.
 * 
 * 🧠 Cuándo usarlo 
 * Cuando no sabes de antemano qué clase concreta necesitas instanciar.
 * 
 * Cuando quieres centralizar y encapsular la lógica de creación de objetos.
 * 
 * Cuando trabajas con una jerarquía de clases o una interfaz común.
 */