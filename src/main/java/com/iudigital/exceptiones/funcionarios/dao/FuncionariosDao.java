package com.iudigital.exceptiones.funcionarios.dao;

import com.iudigital.exceptiones.funcionarios.dominio.Funcionarios;
import com.iudigital.exceptiones.funcionarios.util.ConnectionUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class FuncionariosDao {
    private static final String GET_FUNCIONARIOS = "select * from funcionarios";
    
    private static final String CREATE_FUNCIONARIO = "insert into"
                                                   + "funcionarios (id_identificacion_fun, cod_IES_univer_fun, nombres_fun, apellidos_fun, estados_civil_fun, sexo_fun, direccion_fun, telefono_fun, fecha_nacimiento_fun, id_pariente_fun, id_identidad_fun)"
                                                   + "VALUES( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    
    private static final String GET_FUNCIONARIO_BY_ID = "select * from funcionarios where id_funcionario = ?";
    
    private static final String UPDATE_FUNCIONARIO = "update funcionarios set id_identificacion_fun = ?, cod_IES_univer_fun = ?, nombres_fun = ?, apellidos_fun = ?" 
                                                     + "estados_civil_fun = ?, sexo_fun = ?, direccion_fun = ?, telefono_fun = ?" 
                                                     + "fecha_nacimiento_fun = ?, id_pariente_fun = ?, id_identidad_fun = ? where id_identificacion_fun = ?";
    
    private static final String DELETE_FUNCIONARIO = "delete from funcionarios where id_funcionario = ?";
    
    //Creacion de objetos para los crear, eliminar, listar, actualizar y finalizar excepciones
    public void crear(Funcionarios funcionario) throws SQLException{
        Connection connection = null;
        PreparedStatement  preparedStatement = null;
        
        try{
        connection = ConnectionUtil.getConnection();
        preparedStatement = connection.prepareCall(CREATE_FUNCIONARIO);
        preparedStatement.setInt(1, funcionario.getId_identificacion_fun());
        preparedStatement.setInt(2, funcionario.getCod_IES_univer_fun());
        preparedStatement.setString(3, funcionario.getNombres_fun());
        preparedStatement.setString(4, funcionario.getApellidos_fun());
        preparedStatement.setString(5, funcionario.getEstados_civil_fun());
        preparedStatement.setString(6, funcionario.getSexo_fun());
        preparedStatement.setString(7, funcionario.getDireccion_fun());
        preparedStatement.setString(8, funcionario.getTelefono_fun());
        preparedStatement.setString(9, funcionario.getFecha_nacimiento_fun());
        preparedStatement.setInt(10, funcionario.getId_pariente_fun());
        preparedStatement.setInt(11, funcionario.getId_identidad_fun());
        preparedStatement.executeUpdate();
        
        }finally{
            if (preparedStatement != null){
                preparedStatement.close();
                
            }
            if (connection != null){
                connection.close();
         
            }
        }
        
    }
    //listar funcionarios o ingresar un funcionario
    public List<Funcionarios> obtenerFuncionarios() throws SQLException{
        //crear tres objetos para metodo listar
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Funcionarios> funcionarios = new ArrayList<>();
         
        //se crea finallly para cerrar los objetos despues ser ejecutados y cumplir su tarea
        try{
            connection = ConnectionUtil.getConnection();//coneccion con la base de datos
            preparedStatement = connection.prepareCall(GET_FUNCIONARIOS);//ingresar un funcionario
            
            //obtener el resultado
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                Funcionarios funcionario = new Funcionarios();
                funcionario.setId_funcionario(resultSet.getInt("Ingrese id"));
                funcionario.setId_identificacion_fun(resultSet.getInt("numero de identificacion"));
                funcionario.setCod_IES_univer_fun(resultSet.getInt("codigo IES de la universidad"));
                funcionario.setNombres_fun(resultSet.getString(" nombres del funcionario"));
                funcionario.setApellidos_fun(resultSet.getString("Apellido del funcionario"));
                funcionario.setEstados_civil_fun(resultSet.getString("estado civil"));
                funcionario.setSexo_fun(resultSet.getString("genero"));
                funcionario.setDireccion_fun(resultSet.getString("Direccion donde vive"));
                funcionario.setTelefono_fun(resultSet.getString("Telefono"));
                funcionario.setFecha_nacimiento_fun(resultSet.getString("Fecha de nacimiento"));
                funcionario.setId_pariente_fun(resultSet.getInt("codigo de la tabla roles"));
                funcionario.setId_identidad_fun(resultSet.getInt("codigo del familiar"));
               
            }
              return funcionarios;
        }finally{
            if (connection != null){
                connection.close();
            }
            if(preparedStatement != null){
               preparedStatement.close();
            
            }
            if (resultSet != null){
                resultSet.close();
            
            }
        
        }
    }
    //obtener un funcionario por id 
    public Funcionarios obtenerFuncionario(int id_funcionario)throws SQLException{
       Connection connection = null;
       PreparedStatement preparedStatement = null;
       ResultSet resultSet = null;
       Funcionarios funcionario = null;
       
       //Se usa para finalizar los objetos
       try{
            connection = ConnectionUtil.getConnection();//coneccion con la base de datos
            preparedStatement = connection.prepareCall(GET_FUNCIONARIO_BY_ID);//obtener un funcionario por id
            preparedStatement.setInt(1, id_funcionario);
            resultSet = preparedStatement.executeQuery();//obtener el resultado por id
            
            if (resultSet.next()){
                funcionario = new Funcionarios();
                funcionario.setId_funcionario(resultSet.getInt("Id"));
                funcionario.setId_identificacion_fun(resultSet.getInt("numero de identificacion"));
                funcionario.setCod_IES_univer_fun(resultSet.getInt("codigo IES de la universidad"));
                funcionario.setNombres_fun(resultSet.getString(" nombres del funcionario"));
                funcionario.setApellidos_fun(resultSet.getString("Apellido del funcionario"));
                funcionario.setEstados_civil_fun(resultSet.getString("estado civil"));
                funcionario.setSexo_fun(resultSet.getString("genero"));
                funcionario.setDireccion_fun(resultSet.getString("Direccion donde vive"));
                funcionario.setTelefono_fun(resultSet.getString("Telefono"));
                funcionario.setFecha_nacimiento_fun(resultSet.getString("Fecha de nacimiento"));
                funcionario.setId_pariente_fun(resultSet.getInt("codigo del de la tabla roles"));
                funcionario.setId_identidad_fun(resultSet.getInt("codigo del familiar"));
            }
                return funcionario;
       }finally{
         if (connection != null){
                connection.close();
            }
            if(preparedStatement != null){
               preparedStatement.close();
            
            }
            if (resultSet != null){
                resultSet.close();
            
            }
       
       }
       
    }
       //metodo actualizar funcionario
    public void actualizarFuncionario(int id_funcionario, Funcionarios funcionario) throws SQLException{
              Connection connection = null;
              PreparedStatement preparedStatement = null;
              
              try{
        connection = ConnectionUtil.getConnection();
        preparedStatement = connection.prepareCall(UPDATE_FUNCIONARIO);
        
        
        preparedStatement.setInt(1, funcionario.getId_identificacion_fun());
        preparedStatement.setInt(2, funcionario.getCod_IES_univer_fun());
        preparedStatement.setString(3, funcionario.getNombres_fun());
        preparedStatement.setString(4, funcionario.getApellidos_fun());
        preparedStatement.setString(5, funcionario.getEstados_civil_fun());
        preparedStatement.setString(6, funcionario.getSexo_fun());
        preparedStatement.setString(7, funcionario.getDireccion_fun());
        preparedStatement.setString(8, funcionario.getTelefono_fun());
        preparedStatement.setString(9, funcionario.getFecha_nacimiento_fun());
        preparedStatement.setInt(10, funcionario.getId_pariente_fun());
        preparedStatement.setInt(11, funcionario.getId_identidad_fun());
        preparedStatement.setInt(12, id_funcionario);
        preparedStatement.executeLargeUpdate();
        
        
              }finally{
              if (connection != null){
                connection.close();
            }
              if(preparedStatement != null){
               preparedStatement.close();
            
            }
             
        }
    }
    //metodo para eliminar un funcionario
 public void eliminarFuncionario(int id_identificacion_fun)throws SQLException{
          Connection connection = null;
          PreparedStatement preparedStatement = null;
          
          try{
          connection = ConnectionUtil.getConnection();//coneccion con la base de datos
          preparedStatement = connection.prepareCall(DELETE_FUNCIONARIO);//Eliminar un funcionario
          preparedStatement.setInt(1, id_identificacion_fun);
          preparedStatement.executeUpdate();
          
          
          }finally{
           if (connection != null){
                connection.close();
            }
           if(preparedStatement != null){
               preparedStatement.close();
            
            }
          
          }
 
 }
  
}
