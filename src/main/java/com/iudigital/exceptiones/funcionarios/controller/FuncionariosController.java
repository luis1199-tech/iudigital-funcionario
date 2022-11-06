package com.iudigital.exceptiones.funcionarios.controller;

import com.iudigital.exceptiones.funcionarios.dao.FuncionariosDao;
import com.iudigital.exceptiones.funcionarios.dominio.Funcionarios;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author User
 */
public class FuncionariosController {
    //se crea el objeto funcionariosDao para utizarlo con la clase FuncionarioDao
    private FuncionariosDao funcionariosDao;//se crea una variable de clase
    
    public FuncionariosController(){
        /*
        *
        */
        
        funcionariosDao = new FuncionariosDao();//se instacia clase Funcionariodao para utilizar los metodos de la clase funcionariosdao
    
    
    }
    
    public void crear(Funcionarios funcionario) throws SQLException {
         funcionariosDao.crear(funcionario);
    
    }
    public List<Funcionarios> obtenerFuncionarios() throws SQLException{
         return funcionariosDao.obtenerFuncionarios();
    
    }
    public Funcionarios obtenerFuncionario(int id_funcionario) throws SQLException{
         return funcionariosDao.obtenerFuncionario(id_funcionario);
    }
    
    public void actualizarFuncionario(int id_funcionario, Funcionarios funcionario) throws SQLException {
          funcionariosDao.actualizarFuncionario(id_funcionario, funcionario);
    }
    public void eliminarFuncionario(int id_funcionario) throws SQLException{
          funcionariosDao.eliminarFuncionario(id_funcionario);
    }
}
