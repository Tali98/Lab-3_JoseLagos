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
public class Troll extends Enemigo {

    Random r = new Random();

    public Troll() {
    }

    public Troll(int hp, int ap, int ad, int eficacia, int pdc, int velocidad, String grito, String nombre, int estatura, int peso, int edad) {
        super(hp, ap, ad, eficacia, pdc, velocidad, "RAAWRRR", "Troll", 500, 250, 5);
        this.setHp(50 + r.nextInt(80));
        this.setAp(0);
        this.setAd(30 + r.nextInt(50));
        this.setEficacia(50 + r.nextInt(65));
        this.setPdc(15+r.nextInt(20));
        this.setVelocidad(10);
    }

}
