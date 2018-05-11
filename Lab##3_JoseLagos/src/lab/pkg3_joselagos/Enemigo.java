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
public class Enemigo {
    protected int hp;
    protected int ap;
    protected int ad;
    protected int eficacia;
    protected int pdc;
    protected int velocidad;
    protected String grito;
    protected String nombre;
    protected int estatura;
    protected int peso;
    protected int edad;

    public Enemigo() {
    }

    public Enemigo(int hp, int ap, int ad, int eficacia, int pdc, int velocidad, String grito, String nombre, int estatura, int peso, int edad) {
        this.hp = hp;
        this.ap = ap;
        this.ad = ad;
        this.eficacia = eficacia;
        this.pdc = pdc;
        this.velocidad = velocidad;
        this.grito = grito;
        this.nombre = nombre;
        this.estatura = estatura;
        this.peso = peso;
        this.edad = edad;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAp() {
        return ap;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

    public int getAd() {
        return ad;
    }

    public void setAd(int ad) {
        this.ad = ad;
    }

    public int getEficacia() {
        return eficacia;
    }

    public void setEficacia(int eficacia) {
        this.eficacia = eficacia;
    }

    public int getPdc() {
        return pdc;
    }

    public void setPdc(int pdc) {
        this.pdc = pdc;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getGrito() {
        return grito;
    }

    public void setGrito(String grito) {
        this.grito = grito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Enemigo{" + "hp=" + hp + ", ap=" + ap + ", ad=" + ad + ", eficacia=" + eficacia + ", pdc=" + pdc + ", velocidad=" + velocidad + ", grito=" + grito + ", nombre=" + nombre + ", estatura=" + estatura + ", peso=" + peso + ", edad=" + edad + '}';
    }
    
}
