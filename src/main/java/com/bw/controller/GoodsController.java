package com.bw.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.bw.entity.Brand;
import com.bw.entity.Goods;
import com.bw.entity.Kind;
import com.bw.service.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * @author 作者:SYk
 * @version 创建时间：2019年12月31日 上午9:00:06 类功能说明
 */
@Controller
public class GoodsController {

	@Autowired
	private GoodsService gService;

	@RequestMapping("findAll.do")
	public ModelAndView findAll(@RequestParam(defaultValue = "1") int pageNow, Goods goods) {
		PageHelper.startPage(pageNow, 3);
		ModelAndView mv = new ModelAndView("show");
		List<Goods> list = gService.findAll(goods);
		PageInfo<Goods> page = new PageInfo<Goods>(list);
		mv.addObject("list", list);
		mv.addObject("page", page);
		return mv;
	}

	@RequestMapping("toAdd.do")
	public String toAdd() {
		return "add";
	}

	@RequestMapping("findBrand.do")
	@ResponseBody
	public List<Brand> findBrand() {
		List<Brand> list = gService.findBrand();
		return list;
	}

	@RequestMapping("findKind.do")
	@ResponseBody
	public List<Kind> findKind() {
		List<Kind> list = gService.findKind();
		return list;
	}

	@RequestMapping("add.do")
	public void add(Goods goods, MultipartFile file) throws Exception {
		System.out.println(goods);
		if (null != file && !file.isEmpty()) {
			String path = "F:/upload/";
			String oldFileName = file.getOriginalFilename();
			String filename = UUID.randomUUID() + oldFileName.substring(oldFileName.lastIndexOf("."));
			File file2 = new File(path, filename);
			file.transferTo(file2);
			goods.setImgurl(filename);
		}
		gService.add(goods);
	}

	@RequestMapping("update.do")
	public boolean update(Goods goods, MultipartFile file) throws Exception {
		System.out.println(goods);
		if (file != null && !file.isEmpty()) {
			String path = "F:/upload/";
			String oldfilename = file.getOriginalFilename();
			String filename = UUID.randomUUID() + oldfilename.substring(oldfilename.lastIndexOf("."));
			File file2 = new File(path, filename);
			file.transferTo(file2);
			goods.setImgurl(filename);
		}
		gService.update(goods);
		return true;
	}

	@RequestMapping("reshow.do")
	@ResponseBody
	public ModelAndView reshow(@RequestParam("id") String id) {
		ModelAndView mv = new ModelAndView("update");
		Goods goods = gService.findOne(id);
		mv.addObject("goods", goods);
		return mv;
	}

	@RequestMapping("del.do")
	public String del(@RequestParam("id") String id) {
		String[] split = id.split(",");
		if (split != null) {
			for (String string : split) {
				gService.del(string);
			}
		}
		return "redirect:findAll.do";

	}

}
