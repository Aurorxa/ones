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
 * @since 2022-07-19 15:22:30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AcTable(name = "`user_role`", comment = "用户角色表")
@TableName("`user_role`")
public class UserRole extends BaseEntity implements Serializable {

    @AcColumn(name = "`user_id`", comment = "用户id")
    private String userId;

    @AcColumn(name = "`role_id`", comment = "角色id")
    private String roleId;

}
