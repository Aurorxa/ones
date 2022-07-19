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
 * @since 2022-07-19 15:01:11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AcTable(name = "`menu`", comment = "菜单表")
@TableName("`menu`")
public class Menu extends BaseEntity implements Serializable {

    @AcColumn(name = "`menu_name`", comment = "菜单名称")
    private String menuName;

    @AcColumn(name = "`parent_id`", comment = "父菜单id")
    private String parentId;

    @AcColumn(name = "`url`", comment = "后端 Controller 相对地址")
    private String url;

    @AcColumn(name = "`path`", comment = "前端的路由地址")
    private String path;

    @AcColumn(name = "`component`", comment = "前端路由组件")
    private String component;

    @AcColumn(name = "`status`", comment = "状态：0 隐藏 1 显示")
    private Integer status;

    @AcColumn(name = "`type`", comment = "菜单类型：0 菜单 1 目录 2 外链")
    private Integer type;

    @AcColumn(name = "`icon`", comment = "图标")
    private String icon;

    @AcColumn(name = "`sort`", comment = "排序字段")
    private Integer sort;

}
