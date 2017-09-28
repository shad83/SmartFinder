package com.xc.mapper;

import com.xc.entity.Person;
import com.xc.entity.PersonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.person
     *
     * @mbggenerated Sun May 28 11:49:57 JST 2017
     */
    int countByExample(PersonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.person
     *
     * @mbggenerated Sun May 28 11:49:57 JST 2017
     */
    int deleteByExample(PersonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.person
     *
     * @mbggenerated Sun May 28 11:49:57 JST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.person
     *
     * @mbggenerated Sun May 28 11:49:57 JST 2017
     */
    int insert(Person record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.person
     *
     * @mbggenerated Sun May 28 11:49:57 JST 2017
     */
    int insertSelective(Person record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.person
     *
     * @mbggenerated Sun May 28 11:49:57 JST 2017
     */
    List<Person> selectByExample(PersonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.person
     *
     * @mbggenerated Sun May 28 11:49:57 JST 2017
     */
    Person selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.person
     *
     * @mbggenerated Sun May 28 11:49:57 JST 2017
     */
    int updateByExampleSelective(@Param("record") Person record, @Param("example") PersonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.person
     *
     * @mbggenerated Sun May 28 11:49:57 JST 2017
     */
    int updateByExample(@Param("record") Person record, @Param("example") PersonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.person
     *
     * @mbggenerated Sun May 28 11:49:57 JST 2017
     */
    int updateByPrimaryKeySelective(Person record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.person
     *
     * @mbggenerated Sun May 28 11:49:57 JST 2017
     */
    int updateByPrimaryKey(Person record);
}