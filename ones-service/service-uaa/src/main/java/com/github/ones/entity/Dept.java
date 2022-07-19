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
 * @since 2022-07-19 15:30:37
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AcTable(name = "`dept`", comment = "部门表")
@TableName("`dept`")
public class Dept extends BaseEntity implements Serializable {

    @AcColumn(name = "`dept_name`", comment = "部门名称")
    private String deptName;

    @AcColumn(name = "`status`", comment = "0 禁止 1 启用")
    private int status;

    @AcColumn(name = "`sort`", comment = "排序字段")
    private Integer sort;
}
