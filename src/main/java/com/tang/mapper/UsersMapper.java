package com.tang.mapper;

import com.tang.model.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author TW
 */
public interface UsersMapper {

    /***
     *
     *  获取数据库表中所有对象的集合
     * @return:List<T> 对象集合
     * @throws:
     */
    List<Users> getAll();


    /***
     * 通过ID主键查询出实体对象
     * @param id  主键
     * @return  T 实体对象
     */
    Users findById(@Param("id") Integer id);

    /***
     *
     * 新增一实例插入到数据库表中
     * @param t
     * @throws:
     */
    int add(Users t);

    int insertSelective(Users t);


    /***
     *
     * 根据主键修改实例对象内容
     * @param  t
     * @throws:
     */
    int modifyById(Users t);


    int updateByPrimaryKey(Users t);


    /***
     *
     * 删除一实例对象
     * @param  t
     * @return:List<Users>
     * @throws:
     */
    int delete(Users t);

    int deleteById(Users t);




}
