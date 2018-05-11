/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3_joselagos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author tali_
 */
public class Lab3_JoseLagos {

    static Random r = new Random();
    static Scanner entrada = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mapa = 120;
        int d1 = 0;
        String s1 = "";
        Personaje per = new Personaje();
        Enemigo en = new Enemigo();
        System.out.println("MENU DE D&D");
        System.out.println("1.Iniciar");
        System.out.println("2.Nivel de Dificultad");
        System.out.println("3.Salir");
        int menu = entrada.nextInt();
        switch (menu) {
            case 1:
                System.out.println("Elija la clase de su personaje:");
                System.out.println("1.Mago");
                System.out.println("2.Arquero");
                System.out.println("3.Berzerk");
                System.out.println("4.Picaro");
                int clase = entrada.nextInt();
                switch (clase) {
                    case 1:
                        per = new Mago(d1, d1, d1, d1, d1, d1, d1, s1, s1, d1, d1, s1, s1, s1, d1);
                        break;
                    case 2:
                        per = new Arquero(d1, d1, d1, d1, d1, d1, d1, s1, s1, d1, d1, s1, s1, s1, d1);
                        break;
                    case 3:
                        per = new Berzerk(d1, d1, d1, d1, d1, d1, d1, s1, s1, d1, d1, s1, s1, s1, d1);
                        break;
                    case 4:
                        per = new Picaro(d1, d1, d1, d1, d1, d1, d1, s1, s1, d1, d1, s1, s1, s1, d1);
                        break;
                    default:
                        System.out.println("Por no obedecer sera un Picaro");
                        per = new Picaro();
                }
                System.out.println("Ingrese el nombre de su Personaje:");
                entrada = new Scanner(System.in);
                per.setNombre(entrada.nextLine());
                entrada = new Scanner(System.in);
                System.out.println("Elija el color de piel de su personaje");
                per.setColor_piel(entrada.nextLine());
                entrada = new Scanner(System.in);
                System.out.println("Elija el color de pelo de su personaje");
                per.setColor_pelo(entrada.nextLine());
                while (!per.color_pelo.equals("negro") && !per.color_pelo.equals("cafe") && !per.color_pelo.equals("rubio")) {
                    System.out.println("No se puede ese color");
                    System.out.println("Ingrese un color valido (negro/cafe/rubio");
                    entrada = new Scanner(System.in);
                    per.setColor_pelo(entrada.nextLine());
                }
                System.out.println("Elija su raza");
                int race = 5;
                while (race != 1 && race != 2 && race != 3 && race != 4) {
                    System.out.println("1.Hobbit");
                    System.out.println("2.Elfo");
                    System.out.println("3.Humano");
                    System.out.println("4.Dwarf");
                    race = entrada.nextInt();
                    switch (race) {
                        case 1:
                            per.setRaza("Hobbit");
                            break;
                        case 2:
                            per.setRaza("Elfo");
                            break;
                        case 3:
                            per.setRaza("Humano");
                            break;
                        case 4:
                            per.setRaza("Dwarf");
                            break;
                        default:
                            System.out.println("NO EXISTE ESA RAZA");
                            System.out.println("Vuelva a ingresar una opcion");
                            break;
                    }
                }
                System.out.println("Ingrese la edad");
                entrada = new Scanner(System.in);
                per.setEdad(entrada.nextInt());
                entrada = new Scanner(System.in);
                System.out.println("Ingrese la estatura");
                per.setEstatura(entrada.nextInt());
                entrada = new Scanner(System.in);
                System.out.println("Ingrese su peso");
                per.setPeso(entrada.nextInt());
                entrada = new Scanner(System.in);
                System.out.println(per);
                System.out.println("Ahorita empieza su partida:");
                int a=0;
                while (a<=mapa) {
                    int dice_move = 1+r.nextInt(20);
                    System.out.println("se movera: "+a);
                    
                    
                }

                break;
        }
    }

}
