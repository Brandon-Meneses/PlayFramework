package controllers;

import play.mvc.*;
import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    public Result index() {
        String message = "¡Bienvenido a mi aplicación web con Play Framework!";
        return ok(index.render(message)); // Pass message to the view
    }

    public Result contact() {
        String confirmationMessage = "¡Gracias por tu mensaje! Nos pondremos en contacto contigo pronto.";
        return ok(contact.render(confirmationMessage)); // Pass confirmationMessage to the view
    }


}
