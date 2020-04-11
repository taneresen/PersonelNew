
package com.bilisimegitim.personelnew.dao;

import com.bilisimegitim.personelnew.dto.Personel;
import com.bilisimegitim.personelnew.vt.VTBaglanti;
import java.sql.*;


public class PersonelDAO {
    
    public static boolean ekle(Personel p_kisi)
    {
         Connection conn = null;
         PreparedStatement ps = null;
        try 
        {
            
            
            conn = VTBaglanti.baglantiAc();
            String sorgu = "insert into personel (ad,soyad,maas) values(?,?,?)";
            ps = conn.prepareStatement(sorgu);
            
            ps.setString(1, p_kisi.getAd());
            ps.setString(2, p_kisi.getSoyad());
            ps.setDouble(3, p_kisi.getMaas());
            
            
            int sonuc = ps.executeUpdate();
             ps.close();
            
            if (sonuc > 0) 
            {
                return true;
                
            } 
            else 
            {
                return false;
            }
            
        } 
        
        catch (Exception e) 
        {
            
            e.printStackTrace();
            return false;
            
        }
        
        finally
        {
            
            VTBaglanti.baglantiKapat(conn);
        
        }
    
    
    
    
      
    
    }
    
    
    
    
}
