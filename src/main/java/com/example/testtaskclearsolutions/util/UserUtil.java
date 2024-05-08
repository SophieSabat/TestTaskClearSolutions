package com.example.testtaskclearsolutions.util;

import com.example.testtaskclearsolutions.dto.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserUtil {

    public static boolean checkId(Long id, List<User> users) {
        Optional<User> optionalUser = users.stream().filter(user -> user.getId() == id).findFirst();
        return optionalUser.isEmpty();
    }
}
