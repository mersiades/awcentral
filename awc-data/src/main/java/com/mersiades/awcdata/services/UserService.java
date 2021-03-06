package com.mersiades.awcdata.services;

import com.mersiades.awcdata.models.GameRole;
import com.mersiades.awcdata.models.User;

public interface UserService extends CrudService<User, String> {
    User addGameroleToUser(String userId, GameRole gameRole) throws Exception;

    User findOrCreateUser(String userId, String displayName, String email);

    void removeGameroleFromUser(String userId, String gameId);
}
