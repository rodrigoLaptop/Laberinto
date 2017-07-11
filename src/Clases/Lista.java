/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.LinkedList;

/**
 *
 * @author Rodrigo AB
 */
public class Lista {
    public LinkedList<Regla> LR;

    public Lista(LinkedList<Regla> l) {
        this.LR = l;
    }

    public Lista() {
        LR = new LinkedList<>();
    }

    public void insertarOrd(Regla r) {
        if (LR.isEmpty()) {
            LR.add(r);
        } else {
            if (LR.getFirst().dist > r.dist) {
                LR.addFirst(r);
                return;
            }
            for (int i = 0; i < LR.size(); i++) {
                if (r.dist <= LR.get(i).dist) {
                    LR.add(i, r);
                    return;
                }
            }
            LR.addLast(r);
        }
    }
}
