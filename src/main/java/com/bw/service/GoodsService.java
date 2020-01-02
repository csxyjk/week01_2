package com.bw.service;

import java.util.List;

import com.bw.entity.Brand;
import com.bw.entity.Goods;
import com.bw.entity.Kind;

/**
 * @author 作者:SYk
 * @version 创建时间：2019年12月31日 上午9:00:37 类功能说明
 */
public interface GoodsService {

	List<Goods> findAll(Goods goods);

	List<Brand> findBrand();

	List<Kind> findKind();

	void add(Goods goods);

	Goods findOne(String id);

	void del(String id);

	void update(Goods goods);

}
