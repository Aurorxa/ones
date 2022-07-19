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
 * @since 2022-07-19 15:18:41
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AcTable(name = "`permission`", comment = "权限表")
@TableName("`permission`")
public class Permission extends BaseEntity implements Serializable {

    @AcColumn(name = "`menu_id`", comment = "菜单id，作为外键")
    private String menuId;

    @AcColumn(name = "`permission_name`", comment = "权限名称")
    private String permissionName;

    @AcColumn(name = "`permission_code`", comment = "权限标识")
    private String permissionCode;

    @AcColumn(name = "`sort`", comment = "排序字段")
    private Integer sort;

    @AcColumn(name = "`status`", comment = "0 禁止 1 启用")
    private int status;

}
