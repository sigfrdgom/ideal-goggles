/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.conn.cc;

import static java.sql.DriverManager.println;
import java.sql.ResultSet;

/**
 *
 * @author sig
 */
public class Materia {
   private int IdParametro;
    private String Nombre;
    private String Valor;

    /**
     * @return the IdParametro
     */
    public int getIdParametro() {
        return IdParametro;
    }

    /**
     * @param IdParametro the IdParametro to set
     */
    public void setIdParametro(int IdParametro) {
        this.IdParametro = IdParametro;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Valor
     */
    public String getValor() {
        return Valor;
    }

    /**
     * @param Valor the Valor to set
     */
    public void setValor(String Valor) {
        this.Valor = Valor;
    }
    
     
}
