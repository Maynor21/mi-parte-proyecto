
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {


        menu();//Esta funcion llamada menu lo que hace es llamar la funcion menu

    }

    public static void menu()// esta funcion la ocupamos para el menu
    {
        Scanner entrada=new Scanner(System.in);

        int select1;// en esta Variable se guarda el dato que el usuario ingresa a la hora de elegir una opcion


            System.out.println("                  Selecciones una Opcion");
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("> 1-> Ahorcado                                           >");
            System.out.println("> 2-> X-0                                                >");
            System.out.println("> 3-> Battleship                                         >");
            System.out.println("> 4-> Salir                                              >");
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("Eleija un Juego:");
            select1 = entrada.nextInt();//En esta se guarda la opcion que elege

            switch (select1)//Este switch lee el numero de la opcion y lo lleva a la opcion elegida
            {
                case 1:// este case nos lleva al primer juego ahorcado

                    Ahorcado ah=new Ahorcado();// Aqui llamamos a la clase de el juego
                break;

                case 2:// este case nos lleva al segundo X-0
                    x0 Objeto = new x0();

                    Objeto.x0(); // Aqui llamamos a la clase de el juego
                    break;

                case 3:// este case nos lleva al Tercer juego Battleship
                    Battleship batt=new Battleship();//Aqui llamamos a la clase de el juego
                    break;
                case 4:

                    salir();//System.out.println("Gracias Por Jugar !!");

                    break;



            }

    }
    public static void salir()
    {
        System.out.println("Gracias Por Jugar !!");
    }
}

