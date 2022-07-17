package com.baiguo.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user")
public class UserDO {
    @Id
    private Integer id;

    /**
     * 用户名称
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 性别：0未知；1男；2女
     */
    private Integer gender;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 用户昵称
     */
    private String nickname;

    /**
     * 用户手机号
     */
    private String mobile;

    /**
     * 用户头像图片
     */
    private String avatar;

    /**
     * 微信登录openid
     */
    @Column(name = "weixin_openid")
    private String weixinOpenid;

    /**
     * 微信登录会话KEY
     */
    @Column(name = "session_key")
    private String sessionKey;

    /**
     * 0可用；1禁用；2注销
     */
    private Integer status;

    /**
     * 创建时间
     */
    @Column(name = "add_time")
    private Date addTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 逻辑删除
     */
    private Integer deleted;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户名称
     *
     * @return username - 用户名称
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名称
     *
     * @param username 用户名称
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取用户密码
     *
     * @return password - 用户密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置用户密码
     *
     * @param password 用户密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取性别：0未知；1男；2女
     *
     * @return gender - 性别：0未知；1男；2女
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置性别：0未知；1男；2女
     *
     * @param gender 性别：0未知；1男；2女
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 获取生日
     *
     * @return birthday - 生日
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置生日
     *
     * @param birthday 生日
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取用户昵称
     *
     * @return nickname - 用户昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置用户昵称
     *
     * @param nickname 用户昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取用户手机号
     *
     * @return mobile - 用户手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置用户手机号
     *
     * @param mobile 用户手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取用户头像图片
     *
     * @return avatar - 用户头像图片
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 设置用户头像图片
     *
     * @param avatar 用户头像图片
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * 获取微信登录openid
     *
     * @return weixin_openid - 微信登录openid
     */
    public String getWeixinOpenid() {
        return weixinOpenid;
    }

    /**
     * 设置微信登录openid
     *
     * @param weixinOpenid 微信登录openid
     */
    public void setWeixinOpenid(String weixinOpenid) {
        this.weixinOpenid = weixinOpenid;
    }

    /**
     * 获取微信登录会话KEY
     *
     * @return session_key - 微信登录会话KEY
     */
    public String getSessionKey() {
        return sessionKey;
    }

    /**
     * 设置微信登录会话KEY
     *
     * @param sessionKey 微信登录会话KEY
     */
    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    /**
     * 获取0可用；1禁用；2注销
     *
     * @return status - 0可用；1禁用；2注销
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置0可用；1禁用；2注销
     *
     * @param status 0可用；1禁用；2注销
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取创建时间
     *
     * @return add_time - 创建时间
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * 设置创建时间
     *
     * @param addTime 创建时间
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取逻辑删除
     *
     * @return deleted - 逻辑删除
     */
    public Integer getDeleted() {
        return deleted;
    }

    /**
     * 设置逻辑删除
     *
     * @param deleted 逻辑删除
     */
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }
}