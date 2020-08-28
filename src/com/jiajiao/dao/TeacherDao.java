package com.jiajiao.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jiajiao.bean.Teacher;

public interface TeacherDao {

	/**
	 * 根据授课科目大类查找教师列表信息
	 * 
	 * @param keMuDaLei
	 * @return
	 */
	public List<Teacher> findTeacherListByKeMuDaLei(String keMuDaLei);

	/**
	 * 查询出按登录最近6位是中小学授课的教员列表信息
	 * 
	 * @return
	 */
	public List<Teacher> findTeacherListIsZhongXiaoXue(@Param("isMobile")int isMobile);

	/**
	 * 查询出按登录最近6位是乐器授课的教员列表信息
	 * 
	 * @return
	 */
	public List<Teacher> findTeacherListIsYueQi(@Param("isMobile")int isMobile);

	public List<Teacher> findTeacherListIsQiLei(@Param("isMobile")int isMobile);

	/**
	 * 根据手机号查找教师信息
	 * 
	 * @param phone
	 * @return
	 */
	public Teacher findByPhone(String phone);

	/**
	 * 注册教员账号，设置isCheck为0 ，必须isCheck为1才可以授课接单
	 * 
	 * @param phone
	 * @param pwd
	 * @return
	 */
	public int insertByPhoneAndPwd(String phone, String pwd);

	/**
	 * 根据手机号和密码查找教师信息
	 * 
	 * @param phone
	 * @param pwd
	 * @return
	 */
	public Teacher findByPhoneAndPwd(String phone, String pwd);

	/**
	 * 通过手机号修改最近登录时间
	 * 
	 * @param phone
	 * @return
	 */
	public int updateLastLoginTimeByPhone(String phone);

	/**
	 * 修改教员信息
	 * 
	 * @param teacher
	 * @return
	 */
	public int updateTeacher(Teacher teacher);

	public int changePwdByTeacherId(String pwd, int teacherId);

	public int updatePersonImg(String personImg, int teacherId);

	public int PagefindAllTeacherListCout();

	public List<Teacher> PagefindAllTeachersList(int pageSize, int currentPage);

	public Teacher findByTeacherId(int tId);

	public List<Teacher> findAllTeacherList();

	public int changeTeacherUse(int id, int i);

	public int changeTeacherCheck(int id, int i);

	public int pageFindTeacherListCount(@Param("course")String course, @Param("areaId")String areaId,
			@Param("teacherType")int teacherType, @Param("gender")int gender);

	public List<Teacher> PagefindTeachersList(@Param("course")String course, @Param("areaId")String areaId,
			@Param("teacherType")int teacherType, @Param("gender")int gender,
			@Param("pageSize")int pageSize, @Param("currentPage")int currentPage);

	public int updateIDImg(String idPhoto, int teacherId);

	public int countTeacherTotal();

	public int calSuccessJJ(int tId);

	public int countBanTeacherTotal();

	public int countPendingTeacherTotal();

	public List<Teacher> pagefindTeachersListByCondition(@Param("course")String course, @Param("areaId")String areaId,
			@Param("teacherType")int teacherType, @Param("gender")int gender,
			@Param("pageSize")int pageSize, @Param("currentPage")int currentPage);

	public int insertByPhoneAndPwd2(String mobile, String pwd, String teacherType);

	public int mUpdatePersonal(Teacher teacher);

	public int mUpdateEducate(Teacher teacher);

	public int mUpdateTeaching(Teacher teacher);
}
