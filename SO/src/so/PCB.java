/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

/**
 *
 * @author haobr
 */
public class PCB {

        int bursttime;
        int interrupciones;
        int prioridad;
        int id;
        int peso;
        int periodoInterrupcion;
        String estado;
        int tiempoArribo;

    public int getBursttime() {
        return bursttime;
    }

    public void setBursttime(int bursttime) {
        this.bursttime = bursttime;
    }

    public int getInterrupciones() {
        return interrupciones;
    }

    public void setInterrupciones(int interrupciones) {
        this.interrupciones = interrupciones;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPeriodoInterrupcion() {
        return periodoInterrupcion;
    }

    public void setPeriodoInterrupcion(int periodoInterrupcion) {
        this.periodoInterrupcion = periodoInterrupcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getTiempoArribo() {
        return tiempoArribo;
    }

    public void setTiempoArribo(int tiempoArribo) {
        this.tiempoArribo = tiempoArribo;
    }
        
}
