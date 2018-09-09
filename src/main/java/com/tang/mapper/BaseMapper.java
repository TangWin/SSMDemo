package com.tang.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/***
 * 基础Mapper
 * </br>
 * @author:wenz
 * @version:1.0
 * @date:2017年5月26日下午1:16:15
 * @since JDK1.8 Spring4.0.4.RELEASE
 * Copyright (C) 2017 Allrights reserved http://www.wisdom-info.con/
 */
public interface BaseMapper<T> {

	/***
	 *
	 *  获取数据库表中所有对象的集合
	 * @return:List<T> 对象集合
	 * @throws:
	 */
	List<T> getAll();


	/***
	 * 通过ID主键查询出实体对象
	 * @param id  主键
	 * @return  T 实体对象
	 */
	T findById(@Param("id") Integer id);

	/***
	 *
	 * 新增一实例插入到数据库表中
	 * @param t
	 * @throws:
	 */
	int add(T t);


	/***
	 *
	 * 根据主键修改实例对象内容
	 * @param  t
	 * @throws:
	 */
	int modifyById(T t);

	/***
	 *
	 * 删除一实例对象
	 * @param  t
	 * @return:List<Users>
	 * @throws:
	 */
	int delete(T t);


	/***
	 * 通过主键删除对象
	 * @param id  主键
	 */
	int deleteById(@Param("id") Integer id);

}
