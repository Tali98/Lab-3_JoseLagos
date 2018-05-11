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
public class Personaje {
    protected int hp;
    protected int ap;
    protected int ad;
    protected int eficacia;
    protected int pdc;
    protected int suerte;
    protected int velocidad;

    public Personaje() {
    }

    public Personaje(int hp, int ap, int ad, int eficacia, int pdc, int suerte, int velocidad) {
        this.hp = hp;
        this.ap = ap;
        this.ad = ad;
        this.eficacia = eficacia;
        this.pdc = pdc;
        this.suerte = suerte;
        this.velocidad = velocidad;
    }
    
}
