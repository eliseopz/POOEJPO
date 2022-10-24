/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author const
 */
public class ListaEmpleados {
    String cargo;
    String name;
    String salario;

    public ListaEmpleados() {
    }

    public ListaEmpleados(String cargo, String name, String salario) {
        this.cargo = cargo;
        this.name = name;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "ListaEmpleados{" + "cargo=" + cargo + ", name=" + name + ", salario=" + salario + '}';
    }
    
    
}
