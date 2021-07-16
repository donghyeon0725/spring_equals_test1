package com.example.spring_equals_test1.listener;

import com.example.spring_equals_test1.domain.Team;
import com.example.spring_equals_test1.domain.User;
import com.example.spring_equals_test1.repository.TeamRepository;
import com.example.spring_equals_test1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DataSetting implements ApplicationListener<ContextRefreshedEvent>{

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

        // 유저 김덕철
        User user = User.builder().name("김덕철").build();

        // 팀 1조. 생성자는 김덕철
        Team team = Team.builder().title("1조").creator(user).build();

        userRepository.save(user);
        teamRepository.save(team);
    }
}



