package SEP.Mediator;

import SEP.Models.User;

public class Client implements ClientModel {

    private RemoteModel remoteModel;

    @Override
    public User validateUser() {
//        return remoteModel.validateUser();
        User u = new User(0,"Albertion","1234567",7);
        return u;
    }
}
