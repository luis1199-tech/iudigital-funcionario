package com.iudigital.exceptiones.funcionarios.test;

import com.iudigital.exceptiones.funcionarios.controller.FuncionariosController;
import com.iudigital.exceptiones.funcionarios.dominio.Funcionarios;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void crearFuncionario(FuncionariosController funcionariosController){
        try{
            Scanner sc= new Scanner(System.in);
            
            System.out.println("Digite el codigo IES de la universidad");
            int codigoUniversidad = sc.nextInt();
            System.out.println("Codigo IES de la universidad es:" + codigoUniversidad);
            System.out.println("---------------------------");
            
            
            System.out.println("Digite el nombre del funcionario");
            String nombreFuncionario = sc.next();
            System.out.println("Nombre del funcionario es:" + nombreFuncionario);
            System.out.println("---------------------------");
            
            System.out.println("Digite el apellido del funcionario");
            String apellidoFuncionario = sc.nextLine();
            System.out.println("Apellido del funcionario es:" + apellidoFuncionario);
            System.out.println("---------------------------");
            
            System.out.println("Digite el estado civil del funcionario");
            String estadoCivilFun = sc.nextLine();
            System.out.println("Estado civil del funcionario es:" + estadoCivilFun);
            System.out.println("---------------------------");
            
            System.out.println("Digite el sexo del funcionario");
            String sexoFuncionario = sc.nextLine();
            System.out.println("Sexo del funcionario es:" + sexoFuncionario);
            System.out.println("---------------------------");
            
            System.out.println("Digite la direccion del funcionario");
            String direccionFuncionario = sc.nextLine();
            System.out.println("Direccion del funcionario es:" + direccionFuncionario);
            System.out.println("---------------------------");
            
            System.out.println("Digite el telefono del funcionario");
            String telefonoFuncionario = sc.nextLine();
            System.out.println("Telefono del funcionario es:" + telefonoFuncionario);
            System.out.println("---------------------------");
            
            System.out.println("Digite la fecha de nacimiento del funcionario");
            String nacimientoFuncionario = sc.nextLine();
            System.out.println("Fecha de nacimiento del funcionario es:" + nacimientoFuncionario);
            System.out.println("---------------------------");
            
            System.out.println("Digite el codigo del pariente del funcionario");
            int codigoDelpariente = sc.nextInt();
            System.out.println("Codigo del pariente del funcionario es:" + codigoDelpariente);
            System.out.println("---------------------------");
            
            System.out.println("Digite el numero de identidad del familiar del funcionario");
            int identidadDelfamiliar = sc.nextInt();
            System.out.println("Numero de identidad del familiar del funcionario es:" + identidadDelfamiliar);
            System.out.println("---------------------------");
            
            //seteamos por medio de la clase Funcionario la instaciamos
            
            Funcionarios funcionario = new Funcionarios();
            
            funcionario.setCod_IES_univer_fun(codigoUniversidad);
            funcionario.setNombres_fun(nombreFuncionario);
            funcionario.setApellidos_fun(estadoCivilFun);
            funcionario.setEstados_civil_fun(estadoCivilFun);
            funcionario.setSexo_fun(sexoFuncionario);
            funcionario.setDireccion_fun(direccionFuncionario);
            funcionario.setTelefono_fun(telefonoFuncionario);
            funcionario.setFecha_nacimiento_fun(nacimientoFuncionario);
            funcionario.setId_pariente_fun(codigoDelpariente);
            funcionario.setId_identidad_fun(identidadDelfamiliar);
            
            funcionariosController.crear(funcionario);
            System.out.println("El funcionario se ha creado con exito");
            
            
        }catch(SQLException ex){
            ex.printStackTrace();
        
        }
    
    }
    //me muestra un listado de todos los funcionarios creados
    public static void obtenerFuncionarios(FuncionariosController funcionariosController){
    
        try{
            
            List<Funcionarios> funcionarios = funcionariosController.obtenerFuncionarios();
            if (funcionarios.isEmpty()){
              System.out.println("No hay datos");
            }else{
              funcionarios.forEach(funcionario -> {
              
              System.out.println("id" + funcionario.getId_funcionario());
              System.out.println("identidad de funcionario"+ funcionario.getId_identificacion_fun());
              System.out.println("codigo de la universidad"+ funcionario.getCod_IES_univer_fun());
              System.out.println("nombre del funcionario"+ funcionario.getNombres_fun());
              System.out.println("apellido del funcionario"+ funcionario.getApellidos_fun());
              System.out.println("Estado civil del funcionario"+ funcionario.getEstados_civil_fun());
              System.out.println("Sexo del funcionario"+ funcionario.getSexo_fun());
              System.out.println("Direccion del funcionario"+ funcionario.getDireccion_fun());
              System.out.println("Numero de telefono del funcionario"+ funcionario.getTelefono_fun());
              System.out.println("Fecha de nacimiento del funcionario"+ funcionario.getFecha_nacimiento_fun());
              System.out.println("Codigo del pariente"+ funcionario.getId_pariente_fun());
              System.out.println("identidad del familiar"+ funcionario.getId_identidad_fun());
              System.out.println("---------------------------------------------------------");
                 
              });
            }
        
        }catch(SQLException ex){
            ex.printStackTrace();
        
        
        }
    
    
    }
    
    public static void obtenerFuncionario(FuncionariosController funcionariosController){
       try {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Digite el numero de identificacion del funcionario: ");
            int id_funcionario = sc.nextInt();
            System.out.println("id: " + id_funcionario);
            System.out.println("-------------------------- ");
            
            Funcionarios funcionario = funcionariosController.obtenerFuncionario(id_funcionario);
            System.out.println("Listar funcionario = " + funcionario);
            System.out.println("-------------------------------------------- ");
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    
    }
    //actualizar funcionario por id
    public static void editarFuncionario(FuncionariosController funcionariosController){
          try{
                Scanner sc = new Scanner(System.in);
                
                System.out.println("Digite ID del funcionario: " );
                int id_funcionario = sc.nextInt();
                sc.nextLine();
                System.out.println("id es: " + id_funcionario);
                Funcionarios funcionarioExits = funcionariosController.obtenerFuncionario(id_funcionario);
                if(funcionarioExits == null){
                    System.out.println("No existe el funcionario ");
                    return;
                }
                
                
            System.out.println("Digite el codigo IES de la universidad");
            int codigoUniversidad = sc.nextInt();
            System.out.println("Codigo IES de la universidad es:" + codigoUniversidad);
            System.out.println("---------------------------");
            
            
            System.out.println("Digite el nombre del funcionario");
            String nombreFuncionario = sc.next();
            System.out.println("Nombre del funcionario es:" + nombreFuncionario);
            System.out.println("---------------------------");
            
            System.out.println("Digite el apellido del funcionario");
            String apellidoFuncionario = sc.nextLine();
            System.out.println("Apellido del funcionario es:" + apellidoFuncionario);
            System.out.println("---------------------------");
            
            System.out.println("Digite el estado civil del funcionario");
            String estadoCivilFun = sc.nextLine();
            System.out.println("Estado civil del funcionario es: " + estadoCivilFun);
            System.out.println("---------------------------");
            
            System.out.println("Digite el sexo del funcionario ");
            String sexoFuncionario = sc.nextLine();
            System.out.println("Sexo del funcionario es:" + sexoFuncionario);
            System.out.println("---------------------------");
            
            System.out.println("Digite la direccion del funcionario ");
            String direccionFuncionario = sc.nextLine();
            System.out.println("Direccion del funcionario es: " + direccionFuncionario);
            System.out.println("---------------------------");
            
            System.out.println("Digite el telefono del funcionario ");
            String telefonoFuncionario = sc.nextLine();
            System.out.println("Telefono del funcionario es:" + telefonoFuncionario);
            System.out.println("---------------------------");
            
            System.out.println("Digite la fecha de nacimiento del funcionario");
            String nacimientoFuncionario = sc.nextLine();
            System.out.println("Fecha de nacimiento del funcionario es:" + nacimientoFuncionario);
            System.out.println("---------------------------");
            
            System.out.println("Digite el codigo del pariente del funcionario ");
            int codigoDelpariente = sc.nextInt();
            System.out.println("Codigo del pariente del funcionario es:" + codigoDelpariente);
            System.out.println("---------------------------");
            
            System.out.println("Digite el numero de identidad del familiar del funcionario");
            int identidadDelfamiliar = sc.nextInt();
            System.out.println("Numero de identidad del familiar del funcionario es:" + identidadDelfamiliar);
            System.out.println("---------------------------");
            
                
            Funcionarios funcionario = new Funcionarios();
            funcionario.setCod_IES_univer_fun(codigoUniversidad);
            funcionario.setNombres_fun(nombreFuncionario);
            funcionario.setApellidos_fun(estadoCivilFun);
            funcionario.setEstados_civil_fun(estadoCivilFun);
            funcionario.setSexo_fun(sexoFuncionario);
            funcionario.setDireccion_fun(direccionFuncionario);
            funcionario.setTelefono_fun(telefonoFuncionario);
            funcionario.setFecha_nacimiento_fun(nacimientoFuncionario);
            funcionario.setId_pariente_fun(codigoDelpariente);
            funcionario.setId_identidad_fun(identidadDelfamiliar);
            funcionariosController.actualizarFuncionario(id_funcionario, funcionario);
          
                
            }catch(SQLException ex){
                ex.printStackTrace();
            }
    }
     public static void eliminarFuncionario(FuncionariosController funcionariosController) {
        try {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Digite el ID del funcionario: ");
            int id_funcionario = sc.nextInt();
            System.out.println("El id del funcionario es:" + id_funcionario);
            Funcionarios funcionarioExists = funcionariosController.obtenerFuncionario(id_funcionario);
            if(funcionarioExists == null) {
                System.out.println("No existe Funcionario" );
                return;
            } 
            
            funcionariosController.eliminarFuncionario(id_funcionario);
            System.out.println("Funcionario eliminado");
            obtenerFuncionarios(funcionariosController);
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
  
    
    public static void main(String[] args) {
        //instanciamos la clase funcionarioscontroler para llamar el metodo crear
        FuncionariosController funcionariosController = new FuncionariosController();
        //crearFuncionario(funcionariosController);
        //obtenerFuncionarios(funcionariosController);
        //obtenerFuncionario(funcionariosController);
        //editarFuncionario(funcionariosController);
        //eliminarFuncionario(funcionariosController);
       
        
        
        int opcion = -1;
        Scanner scanner = new Scanner(System.in);
        while(opcion != 0){
            System.out.println("----------------------------------");
            System.out.println("ELIGE UNA OPCIÓN");
            System.out.println("----------------------------------");
            
            System.out.println("1. Listar Funcionario "  );        
            System.out.println("2. Crear Funcionario");
            System.out.println("3. Listar por Id");
            System.out.println("4. Editar Funcionario");
            System.out.println("5. Eliminar Funcionario");
            
            System.out.println("----------------------------------");
            
            opcion = Integer.parseInt(scanner.nextLine());
            switch(opcion){
                case 0:
                    System.out.println("Ha salido de la aplicación ");
                    break;
                case 1:
                    obtenerFuncionarios(funcionariosController);
                    break;
                case 2:
                    crearFuncionario(funcionariosController);
                    break;
                case 3:
                    obtenerFuncionario(funcionariosController);
                    break;
                case 4:
                    editarFuncionario(funcionariosController);
                    break;
                case 5:
                    eliminarFuncionario(funcionariosController);
                    break;
                default:
                    System.out.println("Opción inválida");
            }
            }
        
    }
}
