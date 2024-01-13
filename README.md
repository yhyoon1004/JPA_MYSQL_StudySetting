이 레포지토리는 "자바 ORM 표준 JPA 프로그래밍 - 기본편" 강의를 듣던 중 강의의 H2 Database에 접속하고 확인하는 것이 불편해 Mysql Datatbase를 사용해서 공부할 수 있게 만든 소스이다.   

   
maven 프로젝트이고 스펙은 다음과 같다

language
- java / 17   

  
dependency   
- org.hibernate / 5.6.15.Final
- com.mysql / 8.2.0
- javax.xml.bind / 2.4.0-b180830.0359 | persistence.xml 을 못읽어오는 경우가 있어 추가

프로젝트 설치시 mysql DB 설정 주의 사항
- 사용할 mysql 계정의 비밀번호 8자리 이상인지 확인해야한다. (최신 버전의 mysql은 비밀번호를 8자리 이상으로 설정해야 된다.)
- mysql 외부/내부 ip  접근 권한을 설정했는 지 확인해야한다.


