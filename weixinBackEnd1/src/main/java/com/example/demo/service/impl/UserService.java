package com.example.demo.service.impl;

import com.example.demo.mapper.UserChoiceDAO;
import com.example.demo.model.in.UserChoiceInModel;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by count on 2018/5/23.
 */

@Service
public class UserService implements IUserService {

    @Autowired
    private UserChoiceDAO userChoiceDAO;
    @Override
    public void insertUserChoice(UserChoiceInModel inModel) {
        userChoiceDAO.addUserChoices(inModel.getGender(),inModel.getAge(),inModel.getHobby(),inModel.getJob(),inModel.getDescription(),inModel.getMate());
    }
}
