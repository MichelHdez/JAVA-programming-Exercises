package com.Bandwidth;

import com.Bandwidth.Bandwidth.Bandwidth;

public class Main {
        public static void main(String[] args) {
            Bandwidth bw = new Bandwidth(100);
            bw.available = 0; // INSERTAR CÓDIGO AQUÍ
            System.out.println(bw.getAvailable()); // Esto imprimirá 0
        }
    }
