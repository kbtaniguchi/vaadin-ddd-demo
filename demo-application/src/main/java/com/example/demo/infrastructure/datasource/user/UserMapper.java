package com.example.demo.infrastructure.datasource.user;

import com.example.demo.domain.model.user.UserRegister;
import com.example.demo.domain.model.user.profile.UserId;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("SELECT EXISTS (SELECT * FROM user_admin.users WHERE user_id = #{userId.value})")
    boolean exists(@Param("userId") UserId userId);

    @Select("SELECT nextval('user_admin.seq_transaction_id')")
    long nextTransactionId();

    void storeNewUser(@Param("userRegister") UserRegister userRegister);

    void storeTransaction(@Param("userRegister") UserRegister userRegister, @Param("transactionId") long transactionId);

    void storeProfile(@Param("userRegister") UserRegister userRegister, @Param("transactionId") long transactionId);

    void storeLastTransaction(@Param("userRegister") UserRegister userRegister, @Param("transactionId") long transactionId);

    void deleteLastTransaction(@Param("userRegister") UserRegister userRegister);

    void storeDeleteUserId(@Param("userId") UserId userId);
}
