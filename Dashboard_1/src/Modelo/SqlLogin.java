/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author AUXINVTIC
 */
public class SqlLogin extends Conexion{
    
       
    public ArrayList<Usuario>  existeUsuario(String user, String pass){
        ArrayList userLog = new ArrayList();
        Usuario usuario;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        int ban = 0;
        
        String sql = "SELECT id_usuario, nombre, username, password, rol FROM usuarios WHERE username=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, user);
            rs = ps.executeQuery();
            if(rs.next()){
                if(pass.equals(rs.getString(4))){
                    usuario = new Usuario();
                    usuario.setId(rs.getString(1));
                    usuario.setNombre(rs.getString(2));
                    usuario.setUsername(rs.getString(3));
                    usuario.setPassword(rs.getString(4));  
                    usuario.setCargo(rs.getString(5));
                    userLog.add(usuario);
                    ban = 1;
                }            
            }
            
        } catch (SQLException ex) {
            System.err.print(ex);
            return null;
        }
        if(ban == 1){
            return userLog;
        }else{
            return null;
        }
        
    }
    
    public String encriptar(String texto, String llave){

        String secretKey = llave; //llave para encriptar datos
        String base64EncryptedString = "";

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digestOfPassword = md.digest(secretKey.getBytes("utf-8"));
            byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);

            SecretKey key = new SecretKeySpec(keyBytes, "DESede");
            Cipher cipher = Cipher.getInstance("DESede");
            cipher.init(Cipher.ENCRYPT_MODE, key);

            byte[] plainTextBytes = texto.getBytes("utf-8");
            byte[] buf = cipher.doFinal(plainTextBytes);
            byte[] base64Bytes = Base64.encodeBase64(buf);
            base64EncryptedString = new String(base64Bytes);

        } catch (Exception ex) {
            System.err.println(ex);
        }
        return base64EncryptedString;
}

    public String Desencriptar(String textoEncriptado, String llave){

        String secretKey = llave; //llave para desenciptar datos
        String base64EncryptedString = "";

        try {
            byte[] message = Base64.decodeBase64(textoEncriptado.getBytes("utf-8"));
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digestOfPassword = md.digest(secretKey.getBytes("utf-8"));
            byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);
            SecretKey key = new SecretKeySpec(keyBytes, "DESede");

            Cipher decipher = Cipher.getInstance("DESede");
            decipher.init(Cipher.DECRYPT_MODE, key);

            byte[] plainText = decipher.doFinal(message);

            base64EncryptedString = new String(plainText, "UTF-8");

        } catch (Exception ex) {
            System.err.println(ex);
        }
        return base64EncryptedString;
    }
  

}