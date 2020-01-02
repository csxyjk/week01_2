package com.bw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.dao.GoodsDao;
import com.bw.entity.Brand;
import com.bw.entity.Goods;
import com.bw.entity.Kind;

/**
 * @author 作者:SYk
 * @version 创建时间：2019年12月31日 上午9:00:48 类功能说明
 */
@Service
public class GoodsServiceImpl implements GoodsService {

	@Autowired
	private GoodsDao gDao;

	@Override
	public List<Goods> findAll(Goods goods) {
		// TODO Auto-generated method stub
		return gDao.findAll(goods);
	}

	@Override
	public List<Brand> findBrand() {
		// TODO Auto-generated method stub
		return gDao.findBrand();
	}

	@Override
	public List<Kind> findKind() {
		// TODO Auto-generated method stub
		return gDao.findKind();
	}

	@Override
	public void add(Goods goods) {
		// TODO Auto-generated method stub
		gDao.add(goods);
	}
	@Override
	public Goods findOne(String id) {
		// TODO Auto-generated method stub
		return gDao.findOne(id);
	}
	@Override
	public void del(String id) {
		// TODO Auto-generated method stub
		gDao.del(id);
	}
	@Override
	public void update(Goods goods) {
		// TODO Auto-generated method stub
		gDao.update(goods);
	}
}
