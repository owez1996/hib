/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starter;

import entity.Studentyi;
import java.util.List;
import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author 18760
 */
public class Main {

    public static void main(String[] args) {
     SessionFactory sf = HibernateUtil1.getSessionFactory();
        Session s = sf.openSession();
        
       Query query = s.createQuery("from  Studentyi s ");
       List<Studentyi> sts = (List<Studentyi>) query.list();
 
       for (Studentyi st : sts){
        System.out.println(st.getImya()+ " "+ st.getFamiliya()+ " "+ st.getOtchestvo() + " " + st.getGruppyi().getNazvanie());
        } 
       s.close();
    }

}

//     SessionFactory sf = HibernateUtil1.getSessionFactory();
//        Session s = sf.openSession();
//        
//       Query query = s.createQuery("from  Studentyi s");
//       List<Studentyi> sts = (List<Studentyi>) query.list();
// 
//       for (Studentyi st : sts){
//        System.out.println(st);
//        } 
//       s.close();


//     SessionFactory sf = HibernateUtil1.getSessionFactory();
//        Session s = sf.openSession();
//        
//       Query query = s.createQuery("from  Studentyi s");
//       List<Studentyi> sts = (List<Studentyi>) query.list();
// 
//       for (Studentyi st : sts){
//        System.out.println(st.getImya()+ " "+ st.getFamiliya()+ " "+ st.getOtchestvo() + " " + st.getGruppyi().getNazvanie());
//        } 
//       s.close();
//    }