package SEP.Services;

import SEP.Models.User;

import java.util.List;

public interface UserService {
    User getUser();
    void createUser(User User);
    void updateUser(User user);
    void removeUser(int id);
}
