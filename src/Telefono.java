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

public class Telefono {
 
    // Definimos los atributos privados nadie fuera de esta clase puede acceder directamente
    private String marca;
    private String modelo;
    private double precio;
 
    
    //inicializamos constructor  del teléfono con sus valores de partida.
    //Se reutiliza el setter de precio para aplicar la validación
     
    public Telefono(String marca, String modelo, double precio) {
        this.marca  = marca;
        this.modelo = modelo;
        setPrecio(precio); // Usamos el setter para validar desde el inicio
    }

    //Inicializamos los getters y los retornamos
    public String getMarca() {
        return marca;
    }
 
    // Retorna el modelo del teléfono
    public String getModelo() {
        return modelo;
    }
 
    //Retorna el precio del teléfono 
    public double getPrecio() {
        return precio;
    }
 
    // Inicializamos los setters y modifica la marca del teléfono
    public void setMarca(String marca) {
        this.marca = marca;
    }
 
    // Modifica el modelo del teléfono
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
 