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
    protected String grito;
    protected String nombre;
    protected int estatura;
    protected int peso;
    protected String color_piel;
    protected String color_pelo;
    protected String raza;
    protected int edad;

    public Personaje() {
    }

    public Personaje(int hp, int ap, int ad, int eficacia, int pdc, int suerte, int velocidad, String grito, String nombre, int estatura, int peso, String color_piel, String color_pelo, String raza, int edad) {
        this.hp = hp;
        this.ap = ap;
        this.ad = ad;
        this.eficacia = eficacia;
        this.pdc = pdc;
        this.suerte = suerte;
        this.velocidad = velocidad;
        this.grito = grito;
        this.nombre = nombre;
        this.estatura = estatura;
        this.peso = peso;
        this.color_piel = color_piel;
        this.color_pelo = color_pelo;
        this.raza = raza;
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

    public int getSuerte() {
        return suerte;
    }

    public void setSuerte(int suerte) {
        this.suerte = suerte;
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

    public String getColor_piel() {
        return color_piel;
    }

    public void setColor_piel(String color_piel) {
        this.color_piel = color_piel;
    }

    public String getColor_pelo() {
        return color_pelo;
    }

    public void setColor_pelo(String color_pelo) {
        this.color_pelo = color_pelo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Personaje{" + "hp=" + hp + ", ap=" + ap + ", ad=" + ad + ", eficacia=" + eficacia + ", pdc=" + pdc + ", suerte=" + suerte + ", velocidad=" + velocidad + ", grito=" + grito + ", nombre=" + nombre + ", estatura=" + estatura + ", peso=" + peso + ", color_piel=" + color_piel + ", color_pelo=" + color_pelo + ", raza=" + raza + ", edad=" + edad + '}';
    }
    

    
    
}
