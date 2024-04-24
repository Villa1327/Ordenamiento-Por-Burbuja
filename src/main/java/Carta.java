/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Villa
 */
public class Carta {
    public int Valor;
    public String Palo;

    public Carta() {
    }

    public Carta(int Valor, String Palo) {
        this.Valor = Valor;
        this.Palo = Palo;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }

    public void setPalo(String Palo) {
        this.Palo = Palo;
    }

    public int getValor() {
        return Valor;
    }

    public String getPalo() {
        return Palo;
    }
    
    
}
