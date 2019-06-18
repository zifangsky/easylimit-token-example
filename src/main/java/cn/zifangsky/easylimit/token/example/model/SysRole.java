package cn.zifangsky.easylimit.token.example.model;

import java.util.Date;
import java.util.Objects;

public class SysRole {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 角色名
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 状态（0:正常；1：删除）
     */
    private Integer status;

    /**
     * 公司id
     */
    private Integer institutionId;

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
     * 角色名
     * @return name 角色名
     */
    public String getName() {
        return name;
    }

    /**
     * 角色名
     * @param name 角色名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 描述
     * @return description 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 描述
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 状态（0:正常；1：删除）
     * @return status 状态（0:正常；1：删除）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态（0:正常；1：删除）
     * @param status 状态（0:正常；1：删除）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 公司id
     * @return institution_id 公司id
     */
    public Integer getInstitutionId() {
        return institutionId;
    }

    /**
     * 公司id
     * @param institutionId 公司id
     */
    public void setInstitutionId(Integer institutionId) {
        this.institutionId = institutionId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SysRole)) return false;
        SysRole role = (SysRole) o;
        return Objects.equals(id, role.id) &&
                Objects.equals(name, role.name) &&
                Objects.equals(description, role.description) &&
                Objects.equals(status, role.status) &&
                Objects.equals(institutionId, role.institutionId) &&
                Objects.equals(creater, role.creater) &&
                Objects.equals(createTime, role.createTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, description, status, institutionId, creater, createTime);
    }
}