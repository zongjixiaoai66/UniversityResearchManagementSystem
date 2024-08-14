package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 学校管理员
 *
 * @author 
 * @email
 */
@TableName("xuexiaoguanliyuan")
public class XuexiaoguanliyuanEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XuexiaoguanliyuanEntity() {

	}

	public XuexiaoguanliyuanEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 账户
     */
    @ColumnInfo(comment="账户",type="varchar(200)")
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @ColumnInfo(comment="密码",type="varchar(200)")
    @TableField(value = "password")

    private String password;


    /**
     * 学校管理员编号
     */
    @ColumnInfo(comment="学校管理员编号",type="varchar(200)")
    @TableField(value = "xuexiaoguanliyuan_uuid_number")

    private String xuexiaoguanliyuanUuidNumber;


    /**
     * 学校管理员姓名
     */
    @ColumnInfo(comment="学校管理员姓名",type="varchar(200)")
    @TableField(value = "xuexiaoguanliyuan_name")

    private String xuexiaoguanliyuanName;


    /**
     * 学校管理员手机号
     */
    @ColumnInfo(comment="学校管理员手机号",type="varchar(200)")
    @TableField(value = "xuexiaoguanliyuan_phone")

    private String xuexiaoguanliyuanPhone;


    /**
     * 学校管理员身份证号
     */
    @ColumnInfo(comment="学校管理员身份证号",type="varchar(200)")
    @TableField(value = "xuexiaoguanliyuan_id_number")

    private String xuexiaoguanliyuanIdNumber;


    /**
     * 学校管理员头像
     */
    @ColumnInfo(comment="学校管理员头像",type="varchar(200)")
    @TableField(value = "xuexiaoguanliyuan_photo")

    private String xuexiaoguanliyuanPhoto;


    /**
     * 性别
     */
    @ColumnInfo(comment="性别",type="int(11)")
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 电子邮箱
     */
    @ColumnInfo(comment="电子邮箱",type="varchar(200)")
    @TableField(value = "xuexiaoguanliyuan_email")

    private String xuexiaoguanliyuanEmail;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 设置：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }
    /**
	 * 设置：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }
    /**
	 * 设置：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：学校管理员编号
	 */
    public String getXuexiaoguanliyuanUuidNumber() {
        return xuexiaoguanliyuanUuidNumber;
    }
    /**
	 * 设置：学校管理员编号
	 */

    public void setXuexiaoguanliyuanUuidNumber(String xuexiaoguanliyuanUuidNumber) {
        this.xuexiaoguanliyuanUuidNumber = xuexiaoguanliyuanUuidNumber;
    }
    /**
	 * 获取：学校管理员姓名
	 */
    public String getXuexiaoguanliyuanName() {
        return xuexiaoguanliyuanName;
    }
    /**
	 * 设置：学校管理员姓名
	 */

    public void setXuexiaoguanliyuanName(String xuexiaoguanliyuanName) {
        this.xuexiaoguanliyuanName = xuexiaoguanliyuanName;
    }
    /**
	 * 获取：学校管理员手机号
	 */
    public String getXuexiaoguanliyuanPhone() {
        return xuexiaoguanliyuanPhone;
    }
    /**
	 * 设置：学校管理员手机号
	 */

    public void setXuexiaoguanliyuanPhone(String xuexiaoguanliyuanPhone) {
        this.xuexiaoguanliyuanPhone = xuexiaoguanliyuanPhone;
    }
    /**
	 * 获取：学校管理员身份证号
	 */
    public String getXuexiaoguanliyuanIdNumber() {
        return xuexiaoguanliyuanIdNumber;
    }
    /**
	 * 设置：学校管理员身份证号
	 */

    public void setXuexiaoguanliyuanIdNumber(String xuexiaoguanliyuanIdNumber) {
        this.xuexiaoguanliyuanIdNumber = xuexiaoguanliyuanIdNumber;
    }
    /**
	 * 获取：学校管理员头像
	 */
    public String getXuexiaoguanliyuanPhoto() {
        return xuexiaoguanliyuanPhoto;
    }
    /**
	 * 设置：学校管理员头像
	 */

    public void setXuexiaoguanliyuanPhoto(String xuexiaoguanliyuanPhoto) {
        this.xuexiaoguanliyuanPhoto = xuexiaoguanliyuanPhoto;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }
    /**
	 * 设置：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：电子邮箱
	 */
    public String getXuexiaoguanliyuanEmail() {
        return xuexiaoguanliyuanEmail;
    }
    /**
	 * 设置：电子邮箱
	 */

    public void setXuexiaoguanliyuanEmail(String xuexiaoguanliyuanEmail) {
        this.xuexiaoguanliyuanEmail = xuexiaoguanliyuanEmail;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Xuexiaoguanliyuan{" +
            ", id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", xuexiaoguanliyuanUuidNumber=" + xuexiaoguanliyuanUuidNumber +
            ", xuexiaoguanliyuanName=" + xuexiaoguanliyuanName +
            ", xuexiaoguanliyuanPhone=" + xuexiaoguanliyuanPhone +
            ", xuexiaoguanliyuanIdNumber=" + xuexiaoguanliyuanIdNumber +
            ", xuexiaoguanliyuanPhoto=" + xuexiaoguanliyuanPhoto +
            ", sexTypes=" + sexTypes +
            ", xuexiaoguanliyuanEmail=" + xuexiaoguanliyuanEmail +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
