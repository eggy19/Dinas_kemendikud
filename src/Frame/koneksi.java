/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;
    import java.sql.*;
/**
 *
 * @author Abdul Aziz Tsabit A
 */
public class koneksi {
    private Connection con;
    public Connection buka_koneksi(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_lomba_smk","root","");
            System.out.println("terhubung ");
        } catch (Exception e) {
            System.out.println("gagal terhubung");
        }return con;
        
    }
}
