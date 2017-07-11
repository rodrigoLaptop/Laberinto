/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Rodrigo AB
 */
public class Regla {

    public int fil;
    public int col;
    public float dist;

    public Regla(int f, int c) {
        fil = f;
        col = c;
        dist = 0;
    }

    public Regla(int fil, int col, float dist) {
        this.fil = fil;
        this.col = col;
        this.dist = dist;
    }

    

}
