package com.example.demo.infrastructure.datasource.user;

import com.example.demo.domain.model.fudamentals.audit.Version;
import com.example.demo.domain.model.user.profile.UserId;
import com.example.demo.domain.model.user.profile.UserProfile;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("SELECT EXISTS (SELECT * FROM user_admin.users WHERE user_id = #{userId.value})")
    boolean exists(@Param("userId") UserId userId);

    @Select("SELECT nextval('user_admin.seq_transaction_id')")
    long nextTransactionId();

    Version latestVersion(@Param("userId") UserId userId);

    void storeNewUser(@Param("userId") UserId userId);

    void storeTransaction(@Param("userId") UserId userId,
                          @Param("transactionId") long transactionId);

    void storeProfile(@Param("userProfile") UserProfile userProfile,
                      @Param("transactionId") long transactionId);

    void storeLastTransaction(@Param("userId") UserId userId,
                              @Param("transactionId") long transactionId,
                              @Param("version") Version version);

    void deleteLastTransaction(@Param("userId") UserId userId);

    void storeDeleteUserId(@Param("userId") UserId userId);
}
