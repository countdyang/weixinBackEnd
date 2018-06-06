package com.example.demo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserChoiceDAO {

	/**
	 * 将用户问卷答案写入数据库中
	 */
	@Insert(" INSERT INTO useranswer.useranswer(gender,age,hobby,job,description,mate) VALUES (#{gender},#{age},#{hobby},#{job},#{description},#{mate})")
	public void addUserChoices(@Param("gender") String gender,@Param("age") int age,@Param("hobby") String hobby,@Param("job") String job, @Param("description") String description,@Param("mate") String mate);

}
