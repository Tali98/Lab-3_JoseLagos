/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3_joselagos;

import java.util.Random;

/**
 *
 * @author tali_
 */
public class Orco extends Enemigo {

    Random r = new Random();

    public Orco() {
    }

    public Orco(int hp, int ap, int ad, int eficacia, int pdc, int velocidad, String grito, String nombre, int estatura, int peso, int edad) {
        super(hp, ap, ad, eficacia, pdc, velocidad, "RAWRRR de Orco", "Orco", 200, 200, 57);
        this.setHp(70 + r.nextInt(90));
        this.setAp(0);
        this.setAd(30 + r.nextInt(45));
        this.setEficacia(20 + r.nextInt(50));
        this.setPdc(60);
        this.setVelocidad(20);
    }

}
