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
프로젝트를 실행한 뒤, 아래 url으로 접속한 뒤에, 콘솔 화면을 확인하시면 됩니다!

* http://localhost:8080/test1 => 정상동작
* http://localhost:8080/test2 => 정상동작
    * Team.java 의 deletedByUser 메서드 부분의 if 문이 정상 동작합니다.
* http://localhost:8080/test3 => !에러 코드!
    * Team.java 의 deletedByUser 메서드 부분의 if 문이 정상 동작하지 않습니다.

