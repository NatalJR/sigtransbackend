package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.User;
import br.sigtrans.sigtrans.service.UserService;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UserResource extends GumgaAPI<User, String> {

    @Autowired
    private UserService userService;

    @Autowired
    public UserResource(@Qualifier("userService") GumgaService<User, String> service) {
        super(service);
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public void handleLoginGetRequest (HttpServletResponse response,
                                       HttpServletRequest request) {
        System.out.println("TESTE");
        try {
            response.sendRedirect(request.getContextPath() + "/WEB-INF/user-login.html");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String handleLoginPostRequest (User user, Model model,
                                          HttpServletRequest request) {

        System.out.println("Teste");
        List<User> loggedUsers = userService.buscaUsuarioPorEmailAddressGQuery(user.getEmailAddress());
        User loggedUser = loggedUsers.get(0);
        if (loggedUser != null) {
            request.getSession(true)
                    .setAttribute("user", loggedUser);
            System.out.println("Deu certo");
            return "redirect:/deucerto";
        } else {
            model.addAttribute("error", "Not a valid user");
            return "user-login";
        }
    }


}
