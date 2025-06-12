package com.patron.creacional.prototype;
/**
 * 🧬 Patrón Prototype El patrón Prototype es un patrón de diseño creacional que
 * permite copiar objetos existentes sin depender de sus clases concretas,
 * utilizando una operación de clonación.
 * 
 * Este patrón se basa en el método clone() para crear nuevas instancias a
 * partir de un prototipo ya existente.
 * 
 * ✅ ¿Cuándo usar Prototype? Cuando la creación de un objeto es costosa (por
 * ejemplo, por procesos complejos o consumo de recursos).
 * 
 * Cuando se quiere duplicar objetos dinámicamente en tiempo de ejecución.
 * 
 * Cuando se necesita mantener la independencia del sistema respecto de las
 * clases concretas.
 * 
 * 
 * 🧠 Ventajas
 * ✅ Evita el uso repetido de new y constructores complejos.
 * 
 * ✅ Reduce el acoplamiento al permitir clonar sin conocer la clase exacta.
 * 
 * ✅ Útil para juegos, editores gráficos, y generación masiva de objetos
 * similares.
 */