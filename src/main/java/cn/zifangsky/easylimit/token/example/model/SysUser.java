package cn.zifangsky.easylimit.token.example.model;

import java.util.Date;

public class SysUser {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 登录名
     */
    private String username;

    /**
     * 姓名
     */
    private String name;

    /**
     * 密码
     */
    private String password;

    /**
     * 密码加密方式
     */
    private String encryptMode;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 0：后台用户；1：前台用户
     */
    private Integer userType;

    /**
     * 机构id
     */
    private Integer institutionId;

    /**
     * 用户状态（0:可用；1:锁定；2:未开通）
     */
    private Integer status;

    /**
     * 删除状态：0正常；1删除
     */
    private Boolean isDel;

    /**
     * 
     */
    private String loginIp;

    /**
     * 上次登录时间
     */
    private Date loginTime;

    /**
     * 创建人
     */
    private String creater;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 主键id
     * @return id 主键id
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键id
     * @param id 主键id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 登录名
     * @return username 登录名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 登录名
     * @param username 登录名
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 姓名
     * @return name 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 姓名
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 密码
     * @return password 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 密码
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 密码加密方式
     * @return encrypt_mode 密码加密方式
     */
    public String getEncryptMode() {
        return encryptMode;
    }

    /**
     * 密码加密方式
     * @param encryptMode 密码加密方式
     */
    public void setEncryptMode(String encryptMode) {
        this.encryptMode = encryptMode == null ? null : encryptMode.trim();
    }

    /**
     * 手机号
     * @return phone 手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 手机号
     * @param phone 手机号
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 邮箱
     * @return email 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 邮箱
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 0：后台用户；1：前台用户
     * @return user_type 0：后台用户；1：前台用户
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * 0：后台用户；1：前台用户
     * @param userType 0：后台用户；1：前台用户
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    /**
     * 机构id
     * @return institution_id 机构id
     */
    public Integer getInstitutionId() {
        return institutionId;
    }

    /**
     * 机构id
     * @param institutionId 机构id
     */
    public void setInstitutionId(Integer institutionId) {
        this.institutionId = institutionId;
    }

    /**
     * 用户状态（0:可用；1:锁定；2:未开通）
     * @return status 用户状态（0:可用；1:锁定；2:未开通）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 用户状态（0:可用；1:锁定；2:未开通）
     * @param status 用户状态（0:可用；1:锁定；2:未开通）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 删除状态：0正常；1删除
     * @return is_del 删除状态：0正常；1删除
     */
    public Boolean getIsDel() {
        return isDel;
    }

    /**
     * 删除状态：0正常；1删除
     * @param isDel 删除状态：0正常；1删除
     */
    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    /**
     * 
     * @return login_ip 
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * 
     * @param loginIp 
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    /**
     * 上次登录时间
     * @return login_time 上次登录时间
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * 上次登录时间
     * @param loginTime 上次登录时间
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * 创建人
     * @return creater 创建人
     */
    public String getCreater() {
        return creater;
    }

    /**
     * 创建人
     * @param creater 创建人
     */
    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}