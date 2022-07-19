package com.github.ones.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.github.ones.entity.base.BaseEntity;
import io.gitee.zerowsh.actable.annotation.AcColumn;
import io.gitee.zerowsh.actable.annotation.AcTable;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @author 许大仙
 * @version 1.0
 * @since 2022-07-19 15:23:47
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AcTable(name = "`role_permission`", comment = "角色权限表")
@TableName("`role_permission`")
public class RolePermission extends BaseEntity implements Serializable {

    @AcColumn(name = "`role_id`", comment = "角色id")
    private String roleId;

    @AcColumn(name = "`permission_id`", comment = "权限id")
    private String permissionId;
}
