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
 * @since 2022-07-19 14:53:21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AcTable(name = "`role`", comment = "角色表")
@TableName("`role`")
public class Role extends BaseEntity implements Serializable {

    @AcColumn(name = "`role_name`", comment = "角色名称")
    private String roleName;

    @AcColumn(name = "`role_code`", comment = "角色编码，以 ROLE_xxx 的形式命名")
    private String roleCode;

    @AcColumn(name = "`sort`", comment = "排序字段")
    private Integer sort;

    @AcColumn(name = "`status`", comment = "状态 0 禁用 1 启用")
    private int status;

}
