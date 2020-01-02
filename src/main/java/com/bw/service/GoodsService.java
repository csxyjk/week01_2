package com.bw.service;

import java.util.List;

import com.bw.entity.Brand;
import com.bw.entity.Goods;
import com.bw.entity.Kind;

/**
 * @author ����:SYk
 * @version ����ʱ�䣺2019��12��31�� ����9:00:37 �๦��˵��
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
