package cn.zifangsky.easylimit.token.example.model;

import java.util.Date;
import java.util.Objects;

public class SysFunction {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 自身唯一标识ID
     */
    private String myselfId;

    /**
     * 父级资源项ID ,取myselfid值
     */
    private String parentId;

    /**
     * 权限名称
     */
    private String name;

    /**
     * 资源类型： 1.菜单   2.按钮
     */
    private Integer type;

    /**
     * 层级：1.一级导航菜单  2.二级导航菜单  3.功能按钮
     */
    private Integer level;

    /**
     * 权限路径
     */
    private String pathUrl;

    /**
     * 图标路径
     */
    private String iconUrl;

    /**
     * 排序
     */
    private Integer sequenceNum;

    /**
     * 状态（0:正常；1：删除）
     */
    private Integer state;

    /**
     * 资源项描述
     */
    private String description;

    /**
     * 公司id
     */
    private String institutionId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    private String creater;

    /**
     * 主键
     * @return id 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 自身唯一标识ID
     * @return myself_id 自身唯一标识ID
     */
    public String getMyselfId() {
        return myselfId;
    }

    /**
     * 自身唯一标识ID
     * @param myselfId 自身唯一标识ID
     */
    public void setMyselfId(String myselfId) {
        this.myselfId = myselfId == null ? null : myselfId.trim();
    }

    /**
     * 父级资源项ID ,取myselfid值
     * @return parent_id 父级资源项ID ,取myselfid值
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * 父级资源项ID ,取myselfid值
     * @param parentId 父级资源项ID ,取myselfid值
     */
    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    /**
     * 权限名称
     * @return name 权限名称
     */
    public String getName() {
        return name;
    }

    /**
     * 权限名称
     * @param name 权限名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 资源类型： 1.菜单   2.按钮
     * @return type 资源类型： 1.菜单   2.按钮
     */
    public Integer getType() {
        return type;
    }

    /**
     * 资源类型： 1.菜单   2.按钮
     * @param type 资源类型： 1.菜单   2.按钮
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 层级：1.一级导航菜单  2.二级导航菜单  3.功能按钮
     * @return level 层级：1.一级导航菜单  2.二级导航菜单  3.功能按钮
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 层级：1.一级导航菜单  2.二级导航菜单  3.功能按钮
     * @param level 层级：1.一级导航菜单  2.二级导航菜单  3.功能按钮
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 权限路径
     * @return path_url 权限路径
     */
    public String getPathUrl() {
        return pathUrl;
    }

    /**
     * 权限路径
     * @param pathUrl 权限路径
     */
    public void setPathUrl(String pathUrl) {
        this.pathUrl = pathUrl == null ? null : pathUrl.trim();
    }

    /**
     * 图标路径
     * @return icon_url 图标路径
     */
    public String getIconUrl() {
        return iconUrl;
    }

    /**
     * 图标路径
     * @param iconUrl 图标路径
     */
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl == null ? null : iconUrl.trim();
    }

    /**
     * 排序
     * @return sequence_num 排序
     */
    public Integer getSequenceNum() {
        return sequenceNum;
    }

    /**
     * 排序
     * @param sequenceNum 排序
     */
    public void setSequenceNum(Integer sequenceNum) {
        this.sequenceNum = sequenceNum;
    }

    /**
     * 状态（0:正常；1：删除）
     * @return state 状态（0:正常；1：删除）
     */
    public Integer getState() {
        return state;
    }

    /**
     * 状态（0:正常；1：删除）
     * @param state 状态（0:正常；1：删除）
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 资源项描述
     * @return description 资源项描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 资源项描述
     * @param description 资源项描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 公司id
     * @return institution_id 公司id
     */
    public String getInstitutionId() {
        return institutionId;
    }

    /**
     * 公司id
     * @param institutionId 公司id
     */
    public void setInstitutionId(String institutionId) {
        this.institutionId = institutionId == null ? null : institutionId.trim();
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SysFunction)) return false;
        SysFunction that = (SysFunction) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(myselfId, that.myselfId) &&
                Objects.equals(parentId, that.parentId) &&
                Objects.equals(name, that.name) &&
                Objects.equals(type, that.type) &&
                Objects.equals(level, that.level) &&
                Objects.equals(pathUrl, that.pathUrl) &&
                Objects.equals(iconUrl, that.iconUrl) &&
                Objects.equals(sequenceNum, that.sequenceNum) &&
                Objects.equals(state, that.state) &&
                Objects.equals(description, that.description) &&
                Objects.equals(institutionId, that.institutionId) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(creater, that.creater);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, myselfId, parentId, name, type, level, pathUrl, iconUrl, sequenceNum, state, description, institutionId, createTime, creater);
    }
}