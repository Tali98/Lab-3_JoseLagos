/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3_joselagos;

/**
 *
 * @author tali_
 */
public class Arquero extends Personaje {

    public Arquero() {
        super();
    }

    public Arquero(int hp, int ap, int ad, int eficacia, int pdc, int suerte, int velocidad, String grito, String nombre, int estatura, int peso, String color_piel, String color_pelo, String raza, int edad) {
        super(150, 0, 50, 85, 60, 20, 15, "BOOM HEADSHOT GET WRECKED", nombre, estatura, peso, color_piel, color_pelo, raza, edad);
    }
    

}