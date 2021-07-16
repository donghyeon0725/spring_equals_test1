package com.example.spring_equals_test1.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class Team {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    @ManyToOne(fetch = FetchType.LAZY)
    private User creator;


    public Team deletedByUser(User user) {

        System.out.println("user id : " + user.getId() + ", and creator id : " + this.getCreator().getId());

        // 동일성을 비교하는 부분. id 가 동일하기 때문에 이 부분이 같다고 나와야 하는데 다르다고 나옵니다.
        if (this.creator == user) {
            System.out.println("이 유저는 팀의 생성자이기 때문에 삭제할 권한이 있습니다.");
        }

        return this;
    }


    public Long getId() {
        return id;
    }

    public Team setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Team setTitle(String title) {
        this.title = title;
        return this;
    }

    public User getCreator() {
        return creator;
    }

    public Team setCreator(User creator) {
        this.creator = creator;
        return this;
    }
}
