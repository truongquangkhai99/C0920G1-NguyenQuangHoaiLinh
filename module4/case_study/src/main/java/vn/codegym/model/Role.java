package vn.codegym.model;

import javax.persistence.*;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(name = "ROLE_PK",columnNames = "Role_Name")})
public class Role {

    @Id
    @GeneratedValue
    @Column(name = "role_id",nullable = false)
    private Long roleId;

    @Column(name = "role_name",nullable = false)
    private String roleName;

    public Role() {
    }

    public Role(Long roleId, String roleName) {
        this.roleId = roleId;
        this.roleName = roleName;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
