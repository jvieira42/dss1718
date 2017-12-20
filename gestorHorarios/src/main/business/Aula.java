/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.business;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jose
 */
public class Aula {
    private int id;
    private Date data;
    private String idTurno;
    private ArrayList<String> presencas;
    
    public Aula() {
        id=0;
        data=null;
        idTurno=null;
        presencas=null;
    }
    
    public Aula(Date data, String idTurno) {
        this.data = data;
        this.idTurno = idTurno;
    }
    
    public int getID() {
        return this.id;
    }
    
    public Date getData() {
        return this.data;
    }
    
    public String getIdTurno() {
        return this.idTurno;
    }
    
    public ArrayList<String> getPresencas() {
        return this.presencas;
    }
    
    public void setID(int id) {
        this.id = id;
    }
    
    public void setData(Date data) {
        this.data=data;
    }
    
    public void setIdTurno(String idTurno) {
        this.idTurno=idTurno;
    }
    
    public void setPresencas(ArrayList<String> presencas) {
        ArrayList<String> n = new ArrayList<>();
        for(String s:presencas) n.add(s);
        this.presencas = n;
    }
}
