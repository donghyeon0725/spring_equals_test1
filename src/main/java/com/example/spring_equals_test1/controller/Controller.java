package com.example.spring_equals_test1.controller;

import com.example.spring_equals_test1.domain.Team;
import com.example.spring_equals_test1.domain.User;
import com.example.spring_equals_test1.repository.TeamRepository;
import com.example.spring_equals_test1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/test1")
    @Transactional
    public void test1() {
        Team team = teamRepository.findByTitle("1조");

        User user = userRepository.findByName("김덕철");

        if (team.getCreator() == user) {
            System.out.println("이 유저는 팀의 생성자이기 때문에 팀을 삭제할 권한이 있습니다");
            System.out.println("저는 이 유저가 팀을 삭제할 수 있는지 권한을 확인하는 로직은 Team Entity에 있는 것이 맞다고 생각이 들어서 아래와 같이 코드를 변경하였습니다.");
        }
    }


    @GetMapping("/test2")
    @Transactional
    public void test2() {
        System.out.println("User 를 먼저 불러오고, Team을 불러왔을 때는 동일성을 보장받습니다.");
        User user = userRepository.findByName("김덕철");

        Team team = teamRepository.findByTitle("1조");

        user.delete(team);
    }

    @GetMapping("/test3")
    @Transactional
    public void test3() {
        System.out.println("그런데, Team을 먼저 불러오고 User 를 불러올 때에는 동일성을 보장 받지 못 합니다. 동일한 순서로 불러온 test1 번 코드는 정상 동작 합니다.");
        Team team = teamRepository.findByTitle("1조");

        User user = userRepository.findByName("김덕철");

        user.delete(team);
    }
}
