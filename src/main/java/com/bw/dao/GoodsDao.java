package com.bw.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.bw.entity.Brand;
import com.bw.entity.Goods;
import com.bw.entity.Kind;

/**
 * @author 作者:SYk
 * @version 创建时间：2019年12月31日 上午9:04:08 类功能说明
 */
public interface GoodsDao {

	List<Goods> findAll(Goods goods);

	@Select("select * from tb_brand")
	List<Brand> findBrand();

	@Select("select * from tb_goodskind")
	List<Kind> findKind();

	@Insert("insert into tb_goods values(#{gname},#{ename},#{tid},#{bid},#{size},#{price},#{num},#{saying},#{imgurl})")
	void add(Goods goods);

	@Select("SELECT * from tb_goods g LEFT JOIN tb_brand b ON g.bid=b.bid LEFT JOIN tb_goodskind t ON g.tid=t.tid WHERE g.gid=#{id}")
	Goods findOne(@Param("id") String id);

	@Delete("delete from tb_goods where gid in(#{id})")
	void del(@Param("id") String id);

	@Update("update tb_goods set gname=#{gname},ename=#{ename},tid=#{tid},bid=#{bid},size=#{size},price=#{price},num=#{num},saying=#{saying},imgur;=#{imgurl} where gid=#{gid}")
	void update(Goods goods);

}
