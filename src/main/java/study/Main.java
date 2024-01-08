package study;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        //xml 에 정의한 DB 와 Hibernate 정보로 Persistence 객체를 사용해 EntityFactory 생성
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("study");
        //EntityFactory 를 이용해 EntityManager 객체 생성
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        //EntityManager 객체를 이용해 트렌젝션 생성
        EntityTransaction entityTransaction = entityManager.getTransaction();
        //생성한 트렌젝션 시작
        entityTransaction.begin();

        try{
            Member m = new Member();
            m.setName("yunhwan");
            entityManager.persist(m);
            entityManager.flush();

            //트렌젝션 커밋 -> DB 적용
            entityTransaction.commit();
        }catch (Exception e){
            //로직 수행 중 예외발생시 DB 적용 내용을 되돌림
            entityTransaction.rollback();
        }finally {
            entityManager.close();
        }
        entityManagerFactory.close();
    }
}