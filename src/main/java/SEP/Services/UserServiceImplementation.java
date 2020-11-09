package SEP.Services;


import SEP.Mediator.Client;
import SEP.Mediator.ClientModel;
import SEP.Models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplementation implements UserService
{

    private ClientModel client = new Client();

    @Override
    public User getUser() {
        return client.validateUser();
    }

    @Override
    public void createUser(User User) {

    }


    @Override
    public void updateUser(User user) {

    }

    @Override
    public void removeUser(int id) {

    }
}
