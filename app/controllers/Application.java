package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import models.Usuario;
import play.Logger;
import play.data.DynamicForm;
import play.data.Form;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
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
    public static Result loginNoGame(Integer code) {
        if (code == 666) {
            DynamicForm r = Form.form().bindFromRequest();
            String email, senha;
            email = r.get("email");
            senha = r.get("senha");
            Usuario u = null;
            u = Sistema.getUsuario(email);
            if (u != null) {
                return ok(Json.parse(Sistema.getPlayer(u)));
            }
        }
        return Results.badRequest();
    }

    @Transactional
    public static Result logintwo(Integer code, String email){
        if(code == 666){
            Usuario u = null;
            u = Sistema.getUsuario(email);
            if (u != null) {
                return ok(Json.parse(Sistema.getPlayer(u)));
            }
        }
        return Results.badRequest();
    }

    @Transactional
    public static Result registerNoGame() {
        DynamicForm r = Form.form().bindFromRequest();
        String email, senha, nome;
        nome = r.get("nome");
        email = r.get("email");
        senha = r.get("senha");
        Usuario u = new Usuario(nome, email, senha);
        Sistema.addUsuario(u);
        return ok(Json.parse(u.getPlayer()));
    }

    @Transactional
    public static Result updatePlayer() {
        DynamicForm r = Form.form().bindFromRequest();
        String player = r.get("player");
        JsonNode json = Json.parse(player);
        String email = json.findPath("nome").toString();
        Usuario u = Sistema.getUsuario(email);
        Sistema.updatePlayer(u, player);
        return ok(Json.parse("{result: 1}"));
    }

    @Transactional
    public static Result update(){
        JsonNode json = request().body().asJson();
        if(json == null) {
            return badRequest("Expecting Json data");
        } else {
            String email = json.findPath("nome").toString();
            if(email == null) {
                return badRequest("Missing parameter [name]");
            } else {
                Usuario u = Sistema.getUsuario(email);
                Sistema.updatePlayer(u,json.toString());
                return ok(email);
            }
        }
    }
}
