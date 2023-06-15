package veterinaria_gui;

// Clase Controlador
public class Controlador {

    // Atributos para el modelo y la vista
    private Veterinaria modelo;
    private Vista vista;

    // Constructor
    public Controlador(Veterinaria modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setControlador(this); // Asignar el controlador a la vista
    }

    // Método para inicializar la vista
    public void iniciarVista() {
        vista.setVisible(true); // Hacer visible la ventana
        vista.actualizarLista(modelo.get_listaAnimales()); // Actualizar la lista de animales con los datos del modelo
    }

    // Método para agregar un animal al modelo y a la vista
    public void agregarAnimal(String nombre, String tipo, String pais, double costo, boolean vacuna, String raza, String color) {
        Animal animal; // Declarar una variable de tipo Animal
        if (tipo.equalsIgnoreCase("perro")) { // Si el tipo es perro
            animal = new Perro(nombre, vacuna,costo, pais,  raza); // Crear un objeto Perro con los datos ingresados
        } else if (tipo.equalsIgnoreCase("gato")) { // Si el tipo es gato
            animal = new Gato(nombre, vacuna,costo, pais, color); // Crear un objeto Gato con los datos ingresados
        } else { // Si el tipo no es válido
            vista.mostrarMensaje("Tipo de animal inválido"); // Mostrar un mensaje de error en la vista
            return; // Terminar la función sin agregar nada al modelo ni a la vista
        }
        modelo.agregarAnimal(animal); // Llamar al método del modelo para agregar el animal a la lista
        vista.actualizarLista(modelo.get_listaAnimales()); // Llamar al método de la vista para actualizar la lista de animales con los datos del modelo
        vista.mostrarMensaje("Animal agregado con éxito."); // Mostrar un mensaje de confirmación en la vista
    }
       // Método para buscar un animal por su nombre en el modelo y mostrarlo en la vista
    public void buscarAnimal(String nombre) {
        Animal animal = modelo.buscarAnimal(nombre); // Llamar al método del modelo para buscar el animal por su nombre
        if (animal != null) { // Si se encontró el animal
            vista.mostrarAnimal(animal); // Llamar al método de la vista para mostrar los datos del animal en los campos de texto
            vista.mostrarMensaje("Animal encontrado."); // Mostrar un mensaje de confirmación en la vista

        } else { // Si no se encontró el animal
            vista.mostrarMensaje("No se encontró ningún animal con ese nombre."); // Mostrar un mensaje de error en la vista
        }
    }

}
package veterinaria_gui;

// Clase Controlador
public class Controlador {

    // Atributos para el modelo y la vista
    private Veterinaria modelo;
    private Vista vista;

    // Constructor
    public Controlador(Veterinaria modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setControlador(this); // Asignar el controlador a la vista
    }

    // Método para inicializar la vista
    public void iniciarVista() {
        vista.setVisible(true); // Hacer visible la ventana
        vista.actualizarLista(modelo.get_listaAnimales()); // Actualizar la lista de animales con los datos del modelo
    }

    // Método para agregar un animal al modelo y a la vista
    public void agregarAnimal(String nombre, String tipo, String pais, double costo, boolean vacuna, String raza, String color) {
        Animal animal; // Declarar una variable de tipo Animal
        if (tipo.equalsIgnoreCase("perro")) { // Si el tipo es perro
            animal = new Perro(nombre, vacuna,costo, pais,  raza); // Crear un objeto Perro con los datos ingresados
        } else if (tipo.equalsIgnoreCase("gato")) { // Si el tipo es gato
            animal = new Gato(nombre, vacuna,costo, pais, color); // Crear un objeto Gato con los datos ingresados
        } else { // Si el tipo no es válido
            vista.mostrarMensaje("Tipo de animal inválido"); // Mostrar un mensaje de error en la vista
            return; // Terminar la función sin agregar nada al modelo ni a la vista
        }
        modelo.agregarAnimal(animal); // Llamar al método del modelo para agregar el animal a la lista
        vista.actualizarLista(modelo.get_listaAnimales()); // Llamar al método de la vista para actualizar la lista de animales con los datos del modelo
        vista.mostrarMensaje("Animal agregado con éxito."); // Mostrar un mensaje de confirmación en la vista
    }
       // Método para buscar un animal por su nombre en el modelo y mostrarlo en la vista
    public void buscarAnimal(String nombre) {
        Animal animal = modelo.buscarAnimal(nombre); // Llamar al método del modelo para buscar el animal por su nombre
        if (animal != null) { // Si se encontró el animal
            vista.mostrarAnimal(animal); // Llamar al método de la vista para mostrar los datos del animal en los campos de texto
            vista.mostrarMensaje("Animal encontrado."); // Mostrar un mensaje de confirmación en la vista

        } else { // Si no se encontró el animal
            vista.mostrarMensaje("No se encontró ningún animal con ese nombre."); // Mostrar un mensaje de error en la vista
        }
    }

}