package com.example.wenda.sevice;

import com.example.wenda.dao.QuestionDAO;
import com.example.wenda.modle.Question;
import com.example.wenda.modle.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionDAO questionDAO;

    public List<Question> getLatestQuestions(int userId, int offset, int limit) {

        return questionDAO.selectLatestQuestions(userId, offset, limit);
    }
}
