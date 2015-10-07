package controllers;

import models.Usuario;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Results;
import views.html.index;

public class Application extends Controller {

    @Transactional
    public static Result index() {
        return ok(index.render());
    }

    /*
        Inicia mapper para render login e registro
     */

    @Transactional
    public static Result login(Integer code, String email) {
        if (code == 666) {
            Usuario u = null;
            u = Sistema.getUsuario(email);
            if (u != null) {
                return ok(Json.toJson(u));
            }
        }
        return Results.badRequest();
    }

    @Transactional
    public static Result register(String email) {
        Usuario u = new Usuario(email, email, "NONE");
        Sistema.addUsuario(u);
        if (u != null) {
            return ok(Json.toJson(u));
        }
        return badRequest();

    }

    @Transactional
    public static Result update(String email, Integer moedas, Integer nivel, Integer pontos) {
        Usuario u = null;
        u = Sistema.getUsuario(email);
        if (u != null) {
            Sistema.updatePlayer(u, moedas, pontos, nivel);
            return ok(Json.parse("{result: 1}"));
        }
        return badRequest();
    }
    @Transactional
    public static Result remove(Long id){
        Sistema.removeUsuario(id);
        return index();
    }
}
