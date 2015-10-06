import com.fasterxml.jackson.databind.JsonNode;
import controllers.Sistema;
import models.GenericDAO;
import models.Usuario;
import play.Application;
import play.GlobalSettings;
import play.Logger;
import play.db.jpa.JPA;
import play.libs.Json;

import java.util.Iterator;
import java.util.List;

/**
 * Created by caio on 24/03/15.
 */

public class Global extends GlobalSettings {

    private static GenericDAO dao = new GenericDAO();

    @Override
    public void onStart(Application app) {
        Logger.info("inicializada...");

        JPA.withTransaction(new play.libs.F.Callback0() {

            public void invoke() throws Throwable {


                List<Usuario> lu = Sistema.getTodosUsuarios();
                Logger.info("LEN "+lu.size());
//                for(Usuario u: lu){
//                    u.setCorteId(null);
//                    Sistema.mergeUser(u);
//                    dao.flush();
//                }

                if (!Sistema.existeAdmin()) {
                    String fo = "https://cdn4.iconfinder.com/data/icons/meBaze-Freebies/512/user.png";
                    Usuario u = new Usuario("Admin", "admin@admin.com", "oficinag3");
                    dao.persist(u);
                    dao.flush();
                    Logger.info("Inserindo dados no BD.");
                }
            }
        });
    }

    public void onStop(Application app) {
        Logger.info("desligada...");
    }

}