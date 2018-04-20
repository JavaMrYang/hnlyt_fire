package com.hdkj.lyt.hnlyt_fire.repository;

import com.hdkj.lyt.hnlyt_fire.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface UserRepository extends JpaRepository<User,String> {
    @Query(value = "select * from tb_user where name=?1 and status!=?2",nativeQuery = true)
    User findByNameAndStatus(String name,String status);

    @Query(value = "select phone from tb_user where name=?1",nativeQuery = true)
    String findByPhone(String phone);

    @Query(value = "select count(1) from tb_user u where u.appType=?1 or substring(u.appType,5-?1,1)='1' ",nativeQuery = true)
    int countUserByAppType(int appType);

    List<User> findAll(Specification<User> spec);

    Page<User> findAll(Specification<User> spec, Pageable page);

    User save(User user);

    @Query(value = "select * from tb_User u where (SUBSTRING (u.appType,1+?1,1)='1' or u.appType=?1) and (SUBSTRING (u.validate,1+?1,1)='1' or u.validate='1') and u.character!=0  ",nativeQuery = true)
    Page<User> findListByCondition(String appType, Specification<User> spec, Pageable page);

    @Query(value = "select * from tb_user where name=?1",nativeQuery = true)
    User findByName(String name);

    @Query(value = "update tb_user set status='-1' where name=?1",nativeQuery = true)
    @Modifying
    void updateStatusByName(String name);

    @Query(value = "update tb_user set appType=?1 where name=?2",nativeQuery = true)
    @Modifying
    void updateAppTypeByName(String appType,String name);

    @Query(value = "update tb_user set validate=?1 where name=?2",nativeQuery = true)
    @Modifying
    void updateValidateByName(String appType,String name);

    @Query(value = "select * from tb_user where status!='-1'",nativeQuery = true)
    Page<User> findListValidateByCondition(Specification<User> spec,Pageable pageable);

    @Query(value = "select name from tb_user where (SUBSTRING(appType,?1,1)='1'or appType=?1)",nativeQuery = true)
    List<String> findListByGroupIdAndCodition(int appType,Specification<User> specification);

    @Query(value = "select a1.name from tb_user a1 where city in(?1,'省')",nativeQuery = true)
    List<String> findNameByCity(String city);
}
