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
public class Elfo_Oscuro extends Enemigo {

    Random r = new Random();

    public Elfo_Oscuro() {
    }

    public Elfo_Oscuro(int hp, int ap, int ad, int eficacia, int pdc, int velocidad, String grito, String nombre, int estatura, int peso, int edad) {
        super(hp, ap, ad, eficacia, pdc, velocidad, "Im Black", "Elfo Oscuro", estatura, peso, edad);
        this.setHp(60 + r.nextInt(120));
        this.setAp(0);
        this.setAd(30 + r.nextInt(50));
        this.setEficacia(50 + r.nextInt(65));
        this.setPdc(0+ r.nextInt(100));
        this.setVelocidad(20);
    }

}
