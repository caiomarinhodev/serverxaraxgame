package controllers;

import models.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Caio on 15/04/2015.
 */
public class Sistema {

    private static GenericDAO dao = new GenericDAO();

    /*
    Aqui fica tudo relacionado a Usuario
     */

    public static boolean addUsuario(Usuario u){
        dao.persist(u);
        dao.flush();
        return true;
    }

    public static Usuario getUsuario(Long id){
        return dao.findByEntityId(Usuario.class,id);
    }

    public static boolean removeUsuario(Long id){
        Usuario u = dao.findByEntityId(Usuario.class,id);
        if(u!=null){
            dao.remove(u);
            dao.flush();
            return true;
        }
        return false;
    }

    public static boolean existeAdmin(){
        Usuario u = getUsuario("admin");
        if(u!=null){
            return true;
        }
        return false;
    }


    public static Usuario getUsuario(String email){
        List<Usuario> l = dao.findByAttributeName(Usuario.class.getName(),"email",email);
        if(l.size()>0){
            return l.get(0);
        }
        return null;
    }

    public static List<Usuario> getTodosUsuarios(){
        return dao.findAllByClassName(Usuario.class.getName());
    }

    public static void updatePlayer(Usuario u, Integer moedas, Integer pontos, Integer nivel){
        u.setMoedas(moedas);
        u.setNivel(nivel);
        u.setPontos(pontos);
        dao.merge(u);
        dao.flush();
    }

    /*
    Finish tudo relacionado a Usuario
     */


}