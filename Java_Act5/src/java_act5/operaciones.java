/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_act5;

/**
 *
 * @author julia
 */
public class operaciones {

    private float x;
    private float y;

    public operaciones(float x, float y) {
        this.setX(x);
        this.setY(y);
    }

    public float suma() {
        float resultado = this.getX() + this.getY();

        return resultado;
    }

    public float resta() {
        float resultado = this.getX() - this.getY();

        return resultado;
    }

    public float multiplicacion() {
        float resultado = this.getX() * this.getY();

        return resultado;
    }

    public float division() {
        float resultado = this.getX() / this.getY();

        return resultado;
    }

    public float modulo() {
        float resultado = this.getX() % this.getY();

        return resultado;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
}
