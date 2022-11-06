package com.iudigital.exceptiones.funcionarios.dominio;



public class Funcionarios {
    
    private int id_funcionario;
    private int id_identificacion_fun;
    private int cod_IES_univer_fun;
    private String nombres_fun;
    private String apellidos_fun;
    private String estados_civil_fun;
    private String sexo_fun;
    private String direccion_fun;
    private String telefono_fun;
    private String fecha_nacimiento_fun;
    private int id_pariente_fun;
    private int id_identidad_fun;

    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public int getId_identificacion_fun() {
        return id_identificacion_fun;
    }

    public void setId_identificacion_fun(int id_identificacion_fun) {
        this.id_identificacion_fun = id_identificacion_fun;
    }

    public int getCod_IES_univer_fun() {
        return cod_IES_univer_fun;
    }

    public void setCod_IES_univer_fun(int cod_IES_univer_fun) {
        this.cod_IES_univer_fun = cod_IES_univer_fun;
    }

    public String getNombres_fun() {
        return nombres_fun;
    }

    public void setNombres_fun(String nombres_fun) {
        this.nombres_fun = nombres_fun;
    }

    public String getApellidos_fun() {
        return apellidos_fun;
    }

    public void setApellidos_fun(String apellidos_fun) {
        this.apellidos_fun = apellidos_fun;
    }

    public String getEstados_civil_fun() {
        return estados_civil_fun;
    }

    public void setEstados_civil_fun(String estados_civil_fun) {
        this.estados_civil_fun = estados_civil_fun;
    }

    public String getSexo_fun() {
        return sexo_fun;
    }

    public void setSexo_fun(String sexo_fun) {
        this.sexo_fun = sexo_fun;
    }

    public String getDireccion_fun() {
        return direccion_fun;
    }

    public void setDireccion_fun(String direccion_fun) {
        this.direccion_fun = direccion_fun;
    }

    public String getTelefono_fun() {
        return telefono_fun;
    }

    public void setTelefono_fun(String telefono_fun) {
        this.telefono_fun = telefono_fun;
    }

    public String getFecha_nacimiento_fun() {
        return fecha_nacimiento_fun;
    }

    public void setFecha_nacimiento_fun(String fecha_nacimiento_fun) {
        this.fecha_nacimiento_fun = fecha_nacimiento_fun;
    }

    public int getId_pariente_fun() {
        return id_pariente_fun;
    }

    public void setId_pariente_fun(int id_pariente_fun) {
        this.id_pariente_fun = id_pariente_fun;
    }

    public int getId_identidad_fun() {
        return id_identidad_fun;
    }

    public void setId_identidad_fun(int id_identidad_fun) {
        this.id_identidad_fun = id_identidad_fun;
    }

    
    
    
    @Override
    public String toString() {
        return nombres_fun + "" + apellidos_fun ;
    }


}
