package com.cn.hx.wwj.web.pooh.module.service.system.doll;

import java.util.List;

import com.cn.hx.wwj.common.web.entity.Page;
import com.cn.hx.wwj.common.web.util.PageData;
import com.cn.hx.wwj.web.pooh.module.entity.system.Doll;

/** 
 * 说明： 娃娃机处理类接口
 * 创建人：FH Q313596790
 * 创建时间：2017-10-27
 * @version
 */
public interface DollManager{

	/**新增
	 * @param pd
	 * @throws Exception
	 */
	public void save(PageData pd)throws Exception;
	
	/**删除
	 * @param pd
	 * @throws Exception
	 */
	public void delete(PageData pd)throws Exception;
	
	/**修改
	 * @param pd
	 * @throws Exception
	 */
	public void edit(PageData pd)throws Exception;
	
	/**列表
	 * @param page
	 * @throws Exception
	 */
	public List<PageData> list(Page page)throws Exception;
	
	/**列表(全部)
	 * @param pd
	 * @throws Exception
	 */
	public List<PageData> listAll(PageData pd)throws Exception;
	
	/**通过id获取数据
	 * @param pd
	 * @throws Exception
	 */
	public PageData findById(PageData pd)throws Exception;
	
	/**批量删除
	 * @param ArrayDATA_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] ArrayDATA_IDS)throws Exception;

	/**
	 * 通过SN号来查询是否存在次娃娃机
	 * @param SN
	 * @return
	 * @throws Exception
	 */
	public Doll getDollBySN(String SN )throws Exception;

	/**
	 * 获取状态码获得娃娃机房间信息
	 * @param state
	 * @return
	 * @throws Exception
	 */
	public Doll getDollByState(String state)throws Exception;

	/**
	 * 根据id获取娃娃机房间信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Doll getDollByID(String id)throws Exception;

	/**
	 * 获取所有娃娃机的信息
	 * @return
	 * @throws Exception
	 */
	public List<Doll>  getAllDoll()throws Exception;

	/**
	 * 通过SN注册娃娃机
	 * @param sn
	 * @return
	 * @throws Exception
	 */
	public int regDollBySN(String sn)throws Exception;

	/**
	 * 通过网关表获取娃娃机在线的信息
	 * @return
	 * @throws Exception
	 */
	public List<Doll>  getDollBySessionOnLine()throws Exception;


}

