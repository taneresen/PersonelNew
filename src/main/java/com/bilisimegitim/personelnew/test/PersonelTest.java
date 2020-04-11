
package com.bilisimegitim.personelnew.test;

import com.bilisimegitim.personelnew.dao.PersonelDAO;
import com.bilisimegitim.personelnew.dto.Personel;


public class PersonelTest {
    
    public static void main(String[] args) {
        
        
        Personel p1 = new Personel();
        p1.setAd("erfrf ");
        p1.setSoyad("yurtseven");
        p1.setMaas(5000);
        
        boolean sonuc = PersonelDAO.ekle(p1);
        
        if (sonuc) {
            System.out.println("Eklendi");
        } else {
            System.out.println("Eklenemedi");
        }
        
        
       
    }
    
}
