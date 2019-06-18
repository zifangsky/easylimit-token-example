package cn.zifangsky.easylimit.token.example.model;

public class SysRoleFunction {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 角色id
     */
    private Long roleId;

    /**
     * 资源id
     */
    private Long funcId;

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
     * 角色id
     * @return role_id 角色id
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 角色id
     * @param roleId 角色id
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 资源id
     * @return func_id 资源id
     */
    public Long getFuncId() {
        return funcId;
    }

    /**
     * 资源id
     * @param funcId 资源id
     */
    public void setFuncId(Long funcId) {
        this.funcId = funcId;
    }
}