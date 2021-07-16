📌 프로젝트 실행
-
* 메이븐 install
* 프로젝트 실행 


<br/>

📌 주의!
-
* jpa 의 auto ddl-auto 옵션이 validate 입니다. create 로 바꿔주셔야 합니다!



<br/>

📌 테스트
-
* http://localhost:8080/test1 => 정상동작
* http://localhost:8080/test2 => 정상동작
* http://localhost:8080/test3 => !에러 코드!

위 url으로 접속한 뒤에, 콘솔 화면을 확인하시면 됩니다!


📌 문제가 되는 코드 내용
-
* test1 코드는 team 에서 부터 참조한 user(생성자) 와 findByName 으로 repository 에서 찾은 user 의 id는 동일하기에 같은 동일성 보장이 되는 상태입니다.
* test2 번 코드는 user 를 "먼저" 조회하고 team 을 조회 했고 team 에게 권한 검사를 위임 했습니다.
* test3 번 코드는 team 을 "먼저" 조회하고 user 를 조회 했고 team 에게 권한 검사를 위임 했습니다.
