package com.example.testtaskclearsolutions.service.impl;

import com.example.testtaskclearsolutions.dto.User;
import com.example.testtaskclearsolutions.exception.NotAdultException;
import com.example.testtaskclearsolutions.exception.UserNotFoundException;
import com.example.testtaskclearsolutions.service.UserService;
import com.example.testtaskclearsolutions.util.UserUtil;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void create(List<User> usersList, User user) {

        if (Period.between(user.birthdate, LocalDate.now()).getYears() < 18) {
            throw new NotAdultException("You are too young for this website (¬‿¬)");
        }
        if (usersList.isEmpty()) {
            user.id = 1L;
        } else {
            user.id = usersList.get(usersList.size()-1).id + 1L;
        }
        usersList.add(user);
    }

    @Override
    public void updateSomeFields(Long id, List<User> users, User user) {
        if (UserUtil.checkId(id,users)) {
            throw new UserNotFoundException("We cant find this user (≖_≖ )");
        }

        users.stream().filter(element -> element.getId() == id).map(element -> {

        });

    }

    @Override
    public void updateAllFields(Long id, List<User> users, User user) {
        if (UserUtil.checkId(id,users)) {
            throw new UserNotFoundException("We cant find this user (≖_≖ )");
        }

    }

    @Override
    public void delete(Long id, List<User> users) {
        if (UserUtil.checkId(id,users)) {
            throw new UserNotFoundException("We cant find this user (≖_≖ )");
        }

    }

    @Override
    public void search(List<User> users) {

    }
}
