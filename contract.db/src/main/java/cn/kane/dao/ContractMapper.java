package cn.kane.dao;

import cn.kane.domain.Contract;
import cn.kane.domain.ContractExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ContractMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table listing
     *
     * @mbggenerated Sat May 03 21:27:09 CST 2014
     */
    int countByExample(ContractExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table listing
     *
     * @mbggenerated Sat May 03 21:27:09 CST 2014
     */
    int deleteByExample(ContractExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table listing
     *
     * @mbggenerated Sat May 03 21:27:09 CST 2014
     */
    int deleteByPrimaryKey(Integer listingNumber);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table listing
     *
     * @mbggenerated Sat May 03 21:27:09 CST 2014
     */
    int insert(Contract record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table listing
     *
     * @mbggenerated Sat May 03 21:27:09 CST 2014
     */
    int insertSelective(Contract record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table listing
     *
     * @mbggenerated Sat May 03 21:27:09 CST 2014
     */
    List<Contract> selectByExample(ContractExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table listing
     *
     * @mbggenerated Sat May 03 21:27:09 CST 2014
     */
    Contract selectByPrimaryKey(Integer listingNumber);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table listing
     *
     * @mbggenerated Sat May 03 21:27:09 CST 2014
     */
    int updateByExampleSelective(@Param("record") Contract record, @Param("example") ContractExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table listing
     *
     * @mbggenerated Sat May 03 21:27:09 CST 2014
     */
    int updateByExample(@Param("record") Contract record, @Param("example") ContractExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table listing
     *
     * @mbggenerated Sat May 03 21:27:09 CST 2014
     */
    int updateByPrimaryKeySelective(Contract record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table listing
     *
     * @mbggenerated Sat May 03 21:27:09 CST 2014
     */
    int updateByPrimaryKey(Contract record);
}