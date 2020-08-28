package com.jiajiao.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jiajiao.bean.Admin;
import com.jiajiao.dao.AdminDao;
import com.jiajiao.service.AdminService;
import com.jiajiao.utils.MD5Utils;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {

	@Resource
	private AdminDao adminDao;

	@Override
	public Admin login(Admin admin) {

		return adminDao.getByUsernameAndPwd(admin.getUsername(), MD5Utils.MD5(admin
				.getPassword()));
	}

}
