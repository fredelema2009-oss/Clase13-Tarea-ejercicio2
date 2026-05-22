/*
Clase 13 - Tarea: Practicas básicas de Java POO 
Ejercicio 2 — Clase Telefono

Autor: Frederick Lema
Fecha: 22 de mayo del 2026

Enunciado:Crea una clase llamada Telefono que represente un teléfono.
La clase debe tener los siguientes atributos privados:
• marca
• modelo
• precio
Lo que debes hacer
1. Crear la clase Telefono.
2. Declarar los atributos como private.
3. Crear un constructor para inicializar los datos.
4. Crear los getters necesarios para consultar los valores.
5. Crear los setters necesarios para modificar los datos.
6. Validar que el precio no sea negativo.
7. Crear un método llamado mostrarInfo() que imprima la información del
teléfono.
8. En la clase principal App, crear un objeto de tipo Telefono, mostrar su
información, cambiar algunos datos con setters y volver a mostrar el
resultado.
*/

// Clase principal donde se ejecuta el programa
public class App {
    public static void main(String[] args) {
        System.out.println("═════════════════════════════════");
        System.out.println("     EJERCICIO 2 — TELEFONO      ");
        System.out.println("═════════════════════════════════");
 
        // Creación del objeto Telefono con valores iniciales
        Telefono telefono1 = new Telefono("Samsung", "A15", 250.0);
 
        // Mostramos la información inicial usando el método de la clase
        System.out.println("-- Estado inicial --");
        telefono1.mostrarInfo();
 
        // Prueba de setter VÁLIDO: cambiamos el precio a un valor correcto
        System.out.println("-- Cambio de precio válido (350.0) --");
        telefono1.setPrecio(350.0);
        telefono1.mostrarInfo();
 
        // Prueba de setter INVÁLIDO: intentamos asignar un precio negativo
        System.out.println("-- Intento de precio inválido (-50.0) --");
        telefono1.setPrecio(-50.0);   // Debe mostrar mensaje de error y NO cambiar el precio
        telefono1.mostrarInfo();      // El precio debe seguir siendo 350.0
 
        // También podemos leer atributos individualmente usando los getters
        System.out.println("-- Lectura individual con getters --");
        System.out.println("Marca   : " + telefono1.getMarca());
        System.out.println("Modelo  : " + telefono1.getModelo());
        System.out.println("Precio  : $" + telefono1.getPrecio());
    }
}