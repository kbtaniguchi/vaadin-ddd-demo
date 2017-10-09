package com.example.demo.infrastructure.datasource.user.summary;

import com.example.demo.domain.model.user.summary.UserSummary;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserSummaryMapper {
    List<UserSummary> findLatestAll();
}
