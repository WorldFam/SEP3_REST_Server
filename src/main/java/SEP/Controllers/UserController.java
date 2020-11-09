package SEP.Controllers;

import SEP.Models.User;
import SEP.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController
{
    @Autowired
    private UserService service;

    @GetMapping("/get")
    public User list(@RequestParam String username, @RequestParam String password) {
        System.out.println("Esti Contact > " + username + password);
        return service.getUser();
    };

    @PostMapping("/post")
    public void post(@RequestBody final User user){
        service.createUser(user);
    };

    @DeleteMapping("/delete")
    public void remove(@RequestParam int id)
    {
        service.removeUser(id);
    };

    @PutMapping("/update")
    public void update(@RequestBody final User user)
    {
        service.updateUser(user);
    };
}
