/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.conn.cc;

import java.sql.ResultSet;

/**
 *
 * @author sig
 */
public class Estudiante {
    Conexion cn=new Conexion();
     public void Agregar(Object p[]) throws Exception{

         try {
            cn.conectar();
            cn.UID("INSERT into Estudiantes(Nombre,Apellido,FechaNacimiento,Sexo) values(\""+p[1]+"\",\""+p[2]+"\",\""+p[3]+"\",\""+p[4]+"\");");
            
            cn.desconectar();   
         } catch (Exception e) {
             System.out.println("no logra ingresar");
             
         }finally{
         cn.desconectar();
         } 
         
     
     }
     
     
   
     public void Modificar(Object t[]) throws Exception{
         try {
         cn.conectar();
         cn.UID("UPDATE Estudiantes set Nombre=\""+t[1]+"\", Apellido=\""+t[2]+"\" ,FechaNacimiento=\""+t[3]+"\" ,Sexo=\""+t[4]+"\" where IdEstudiante="+t[0]+"; ");
         cn.desconectar();   
         } catch (Exception e) {
             System.out.println("No logra modificar");
             
         }finally{
         cn.desconectar();
         }
     }
     
     
     public void Eliminar(Object p) throws  Exception{
         try {
         cn.conectar();
         cn.UID("DELETE FROM Estudiantes WHERE IdEstudiante='" + p + "'");
         cn.desconectar();   
         } catch (Exception e) {
             System.out.println("No logra eliminar");
         }finally{
         cn.desconectar();
         }
     }
     
     
     public ResultSet BuscarEstudiante(String name) throws Exception{
         ResultSet d=null;
         try {
         cn.conectar();
         d=cn.getValores("SELECT * FROM Estudiantes WHERE Nombre='"+name+"'");    
         } catch (Exception e) {
             System.out.println("No logra obtener");
         }finally{
         cn.desconectar();
         }
         return d;
     }
     
     public ResultSet Obtener() throws Exception{
     ResultSet d=null;
         try {
         cn.conectar();
         d=cn.getValores("select * from Estudiantes;");    
         } catch (Exception e) {
             cn.desconectar();
             System.out.println("no logra obtener datos ");  
         }finally{
         
         }
         return d;
     }
     
       public ResultSet mayorRegistro() throws Exception{
         ResultSet mayor = null;
        try{
        cn.conectar();     
        mayor = cn.getValores("SELECT MAX(IdEstudiante) FROM Estudiantes;");
        } catch (Exception e){
            cn.desconectar();
            System.out.println("No puede obtener el maximo");      
        } 
        return mayor;
                
    }
    public ResultSet Obteneri(String p) throws Exception{
     ResultSet d=null;
         try {
         cn.conectar();
         d=cn.getValores("select * from inventario P where P.CodBarra ='"+p+"';");    
         } catch (Exception e) {
             cn.desconectar();
             System.out.println("Se cago en algo :v"); 
         }finally{
         
         }
         return d;
     }
     
   
}


