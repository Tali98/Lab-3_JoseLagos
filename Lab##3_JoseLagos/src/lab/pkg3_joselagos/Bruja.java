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
public class Bruja extends Enemigo {
Random r = new Random();

    public Bruja() {
    }

    public Bruja(int hp, int ap, int ad, int eficacia, int pdc, int velocidad, String grito, String nombre, int estatura, int peso, int edad) {
        super(hp, ap, ad, eficacia, pdc, velocidad, "FREEZE", "Bruja", estatura, peso, edad);
        this.setHp(60+r.nextInt(80));
        this.setAp(20+r.nextInt(40));
        this.setAd(5+r.nextInt(10));
        this.setEficacia(10+r.nextInt(30));
        this.setPdc(1);
        this.setVelocidad(3+r.nextInt(7));
        
    }
    
    
    
}
