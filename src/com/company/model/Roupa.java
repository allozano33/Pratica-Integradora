package com.company.model;

import java.util.HashMap;
import java.util.List;

public class Roupa {
     public String  marca;
     public String  modelo;

     public Roupa(String marca, String modelo) {
          this.marca = marca;
          this.modelo = modelo;
     }

     public String getMarca() {
          return marca;
     }

     public void setMarca(String marca) {
          this.marca = marca;
     }

     public String getModelo() {
          return modelo;
     }

     public void setModelo(String modelo) {
          this.modelo = modelo;
     }
}

