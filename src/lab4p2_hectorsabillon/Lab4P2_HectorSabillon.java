package lab4p2_hectorsabillon;

import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab4P2_HectorSabillon {

    static ArrayList<Transporte> transportes = new ArrayList();
    static ArrayList lista = new ArrayList();

    public static void main(String[] args) {
        Scanner pochita = new Scanner(System.in);
        int opc = 0;
        while (opc != 6) {
            System.out.print("---Menu---\n\n"
                    + "1.Crear\n"
                    + "2.Modificar\n"
                    + "3.Listar\n"
                    + "4.Eliminar\n"
                    + "5.Viajar\n"
                    + "6.Salir\n"
                    + "Elegir una opcion: ");
            opc = pochita.nextInt();
            System.out.println("");
            switch (opc) {
                case 1:
                    System.out.print("---Crear---\n\n"
                            + "1.Crear Ingeniero\n"
                            + "2.Crear Primate\n"
                            + "3.Crear Planeta\n"
                            + "4.Crear Transporte Aereo Normal\n"
                            + "5.Crear Transporte Espacial\n"
                            + "Elegir una opcion: ");
                    pochita = new Scanner(System.in);
                    opc = pochita.nextInt();
                    String nombre,
                     grupoSanguineo,
                     Sexo = "";
                    int altura,
                     peso,
                     galones,
                     distancia = 0;
                    double tanque = 0;
                    switch (opc) {
                        case 1:
                            System.out.print("Ingrese el nombre: ");
                            nombre = pochita.nextLine();
                            pochita = new Scanner(System.in);
                            System.out.print("Ingrese el grupo sanguineo: ");
                            grupoSanguineo = pochita.nextLine();
                            System.out.print("Ingrese el sexo: ");
                            Sexo = pochita.nextLine();
                            pochita = new Scanner(System.in);
                            System.out.print("Ingrese la altura: ");
                            altura = pochita.nextInt();
                            System.out.print("Ingrese el peso: ");
                            peso = pochita.nextInt();
                            System.out.print("Ingrese el numero de RRHH: ");
                            int RRHH = pochita.nextInt();
                            System.out.print("Ingrese el usuario: ");
                            String usuario = pochita.nextLine();
                            System.out.print("Ingrese la contrasena: ");
                            String contrasena = pochita.nextLine();
                            lista.add(new Ingenieros(RRHH, usuario, contrasena, nombre, grupoSanguineo, Sexo, altura, peso));
                            break;
                        //fin opc 1
                        case 2:
                            System.out.print("Ingrese el nombre: ");
                            nombre = pochita.nextLine();
                            pochita = new Scanner(System.in);
                            System.out.print("Ingrese el grupo sanguineo: ");
                            grupoSanguineo = pochita.nextLine();
                            System.out.print("Ingrese el sexo: ");
                            Sexo = pochita.nextLine();
                            pochita = new Scanner(System.in);
                            System.out.print("Ingrese la altura: ");
                            altura = pochita.nextInt();
                            System.out.print("Ingrese el peso: ");
                            peso = pochita.nextInt();
                            System.out.print("Ingrese la cantidad de comida: ");
                            int cantCom = pochita.nextInt();
                            System.out.print("Ingrese la cantidad de comida que come pos KM: ");
                            int comKM = pochita.nextInt();
                            pochita = new Scanner(System.in);
                            System.out.print("Ingrese el lugar de nacimiento: ");
                            String nacimiento = pochita.nextLine();
                            lista.add(new Primates(cantCom, comKM, nacimiento, nombre, grupoSanguineo, Sexo, altura, peso));
                            break;
                        //fin opc 2
                        case 3:
                            break;
                        //fin opc 3
                        case 4:
                            break;
                        //fin opc 4.
                        case 5:
                            break;
                        //fin opc 5
                        default:
                            throw new AssertionError();
                    }
                    break;
                //fin opc 1
                case 2:
                    System.out.print("---Modificar---\n\n"
                            + "1.Modificar Ingeniero\n"
                            + "2.Modificar Primate\n"
                            + "3.Modificar Planeta\n"
                            + "4.Modificar Transporte Aereo Normal\n"
                            + "5.Modificar Transporte Espacial\n"
                            + "Elegir una opcion: ");
                    pochita = new Scanner(System.in);
                    opc = pochita.nextInt();
                    switch (opc) {
                        case 1:
                            System.out.print("---Ingeniero---\n\n"
                                    + "1.Modificar numero de RRHH\n"
                                    + "2.Modificar Usuario\n"
                                    + "3.Modificar Contrasena\n"
                                    + "4.Modificar Nombre\n"
                                    + "5.Modificar Grupo Sanguineo\n"
                                    + "6.Modificar Sexo\n"
                                    + "7.Modificar Altura\n"
                                    + "8.Modificar Peso\n"
                                    + "Elegir una opcion: ");
                            pochita = new Scanner(System.in);
                            opc = pochita.nextInt();
                            System.out.println("");
                            switch (opc) {
                                case 1:

                                    break;
                                //fin opc 1
                                case 2:
                                    break;
                                //fin opc 2
                                case 3:
                                    break;
                                //fin opc 3
                                case 4:
                                    break;
                                //fin opc 4
                                case 5:
                                    break;
                                //fin opc 5
                                case 6:
                                    break;
                                //fin opc 6
                                case 7:
                                    break;
                                //fin opc 7
                                case 8:
                                    break;
                                //fin opc 8
                                default:
                                    throw new AssertionError();
                            }
                            break;
                        //fin opc 1
                        case 2:
                            System.out.print("---Primate---\n\n"
                                    + "1.Asignar Medio de Transporte\n"
                                    + "2.Modificar Cantidad de Comida\n"
                                    + "3.Modificar Cuanto Come por KM\n"
                                    + "4.MOdificar Lugar de Nacimiento\n"
                                    + "5.Modificar Nombre\n"
                                    + "6.Modificar Grupo Sanguineo\n"
                                    + "7.Modificar Sexo\n"
                                    + "8.Modificar Altura\n"
                                    + "9.Modificar Peso\n"
                                    + "Elegir una opcion: ");
                            pochita = new Scanner(System.in);
                            opc = pochita.nextInt();
                            System.out.println("");
                            switch (opc) {
                                case 1:

                                    break;
                                //fin opc 1
                                case 2:
                                    break;
                                //fin opc 2
                                case 3:
                                    break;
                                //fin opc 3
                                case 4:
                                    break;
                                //fin opc 4
                                case 5:
                                    break;
                                //fin opc 5
                                case 6:
                                    break;
                                //fin opc 6
                                case 7:
                                    break;
                                //fin opc 7
                                case 8:
                                    break;
                                //fin opc 8
                                case 9:
                                    break;
                                //fin opc 9
                                default:
                                    throw new AssertionError();
                            }
                            break;
                        //fin opc 2
                        case 3:
                            System.out.print("---Planeta---\n\n"
                                    + "1.Modificar Nombre\n"
                                    + "2.Modificar Distancia de la Tierra\n"
                                    + "Elegir una opcion: ");
                            pochita = new Scanner(System.in);
                            opc = pochita.nextInt();
                            switch (opc) {
                                case 1:

                                    break;
                                case 2:
                                    break;
                                default:
                                    throw new AssertionError();
                            }
                            break;
                        //fin opc 3
                        case 4:
                            System.out.print("---Aereo normal---\n\n"
                                    + "1.Modificar Cantidad Maxima de Pasajeros\n"
                                    + "3.Modificar Longitud Normal\n"
                                    + "4.Modificar Cantidad de Motores\n"
                                    + "5.Modificar Porcentaje del Tanque\n"
                                    + "6.Modificar Cantidad de KM que puede recorrer\n"
                                    + "7.Asignar Primates\n"
                                    + "Elegir una opcion: ");
                            pochita = new Scanner(System.in);
                            opc = pochita.nextInt();
                            switch (opc) {
                                case 1:

                                    break;
                                //fin opc 1
                                case 2:
                                    break;
                                //fin opc 2
                                case 3:
                                    break;
                                //fin opc 3
                                case 4:
                                    break;
                                //fin opc 4
                                case 5:
                                    break;
                                //fin opc 5
                                case 6:
                                    break;
                                //fin opc 6
                                case 7:
                                    break;
                                //fin opc 7

                                default:
                                    throw new AssertionError();
                            }
                            break;
                        //fin opc 4.
                        case 5:
                            System.out.print("---Aereo Espacial---\n\n"
                                    + "1.Modificar Tipo de Combustible\n"
                                    + "3.Modificar Tipo de nave\n"
                                    + "4.Modificar Porcentaje del Tanque\n"
                                    + "5.Modificar Cantidad de KM que puede recorrer\n"
                                    + "6.Asignar Primates\n"
                                    + "Elegir una opcion: ");
                            pochita = new Scanner(System.in);
                            opc = pochita.nextInt();
                            switch (opc) {
                                case 1:

                                    break;
                                //fin opc 1
                                case 2:
                                    break;
                                //fin opc 2
                                case 3:
                                    break;
                                //fin opc 3
                                case 4:
                                    break;
                                //fin opc 4
                                case 5:
                                    break;
                                //fin opc 5
                                case 6:
                                    break;
                                //fin opc 6

                                default:
                                    throw new AssertionError();
                            }
                            break;
                        //fin opc 5
                        default:
                            throw new AssertionError();
                    }
                    break;
                // fin opc 2
                case 3:
                    System.out.println("---LISTAR---\n"
                            + "1 <- Planetas\n"
                            + "2 <- Ingenieros\n"
                            + "3 <- Primates\n"
                            + "4 <- Transporte Normal\n"
                            + "5 <- Transporte Espacial");
                    System.out.println("Ingrese elemento a listar: ");
                    int elemento = pochita.nextInt();
                    switch (elemento) {
                        case 1: {
                            for (int i = 0; i < lista.size(); i++) {
                                if (lista.get(i) instanceof Planeta) {
                                    System.out.println(lista.get(i));
                                }
                            }
                            break;
                        }
                        case 2: {
                            for (int i = 0; i < lista.size(); i++) {
                                if (lista.get(i) instanceof Ingenieros) {
                                    System.out.println(lista.get(i));
                                }
                            }
                            break;
                        }
                        case 3: {
                            for (int i = 0; i < lista.size(); i++) {
                                if (lista.get(i) instanceof Primates) {
                                    System.out.println(lista.get(i));
                                }
                            }
                            break;
                        }
                        case 4: {
                            for (int i = 0; i < lista.size(); i++) {
                                if (lista.get(i) instanceof Normal) {
                                    System.out.println(lista.get(i));
                                }
                            }
                            break;
                        }
                        case 5: {
                            for (int i = 0; i < lista.size(); i++) {
                                if (lista.get(i) instanceof Espacial) {
                                    System.out.println(lista.get(i));
                                }
                            }
                            break;
                        }
                    }
                    break;
                //fin opc 3
                case 4:
                    System.out.println("---ELIMINAR---\n"
                            + "1 <- Planetas\n"
                            + "2 <- Ingenieros\n"
                            + "3 <- Primates\n"
                            + "4 <- Transporte Normal\n"
                            + "5 <- Transporte Espacial");
                    System.out.println("Ingrese elemento a listar: ");
                    int el = pochita.nextInt();
                    switch (el) {
                        case 1: {
                            for (int i = 0;  i < lista.size(); i++) {
                                if (lista.get(i) instanceof Planeta) {
                                    System.out.println(i + " <- " + lista.get(i));
                                }
                            }
                            System.out.println("Ingrese indice del planeta a eliminar: ");
                            int indice = pochita.nextInt();
                            lista.remove(indice);
                            break;
                        }
                        case 2: {
                            for (int i = 0; i <  lista.size(); i++) {
                                if (lista.get(i) instanceof Ingenieros) {
                                    System.out.println(i + " <- " + lista.get(i));
                                }
                            }
                            System.out.println("Ingrese indice del ingeniero a eliminar: ");
                            int indice = pochita.nextInt();
                            lista.remove(indice);
                            break;
                        }
                        case 3: {
                            for (int i = 0; i < lista.size(); i++) {
                                if (lista.get(i) instanceof Primates) {
                                    System.out.println(i + " <- " + lista.get(i));
                                }
                            }
                            System.out.println("Ingrese indice del primate a eliminar: ");
                            int indice = pochita.nextInt();
                            lista.remove(indice);
                            break;
                        }
                        case 4: {
                            for (int i = 0; i < lista.size(); i++) {
                                if (lista.get(i) instanceof Normal) {
                                    System.out.println(i + " <- " + lista.get(i));
                                }
                            }
                            System.out.println("Ingrese indice del transporte normal a eliminar: ");
                            int indice = pochita.nextInt();
                            lista.remove(indice);
                            break;
                        }
                        case 5: {
                            for (int i = 0; i< lista.size(); i++) {
                                if (lista.get(i) instanceof Espacial) {
                                    System.out.println(i + " <- " + lista.get(i));
                                }
                            }
                            System.out.println("Ingrese indice del transporte espacial a eliminar: ");
                            int indice = pochita.nextInt();
                            lista.remove(indice);
                            break;
                        }
                    }
                    break;
                case 5:
                    for (Transporte o : transportes) {
                        if (o.viajar()) {

                        }
                    }
                    break;
                default:
                    throw new AssertionError();
            }
        }

    }

}
