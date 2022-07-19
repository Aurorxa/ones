package com.github.ones.entity.base;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.gitee.zerowsh.actable.annotation.AcColumn;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 许大仙
 * @version 1.0
 * @since 2022-07-19 14:30:05
 */
@Data
public abstract class BaseEntity implements Serializable {

    @TableId
    @AcColumn(name = "`id`", comment = "主键")
    private String id;

    @TableLogic
    @AcColumn(name = "`been_deleted`", comment = "逻辑删除 0表示逻辑未删除 1表示逻辑删除 default 0")
    @TableField(value = "`been_deleted`", fill = FieldFill.INSERT)
    private Integer beenDeleted;

    @TableField(value = "`created`", fill = FieldFill.INSERT)
    @AcColumn(name = "`created`", comment = "创建时间")
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date created;

    @TableField(value = "`create_by`")
    @AcColumn(name = "`create_by`", comment = "创建者")
    private String createBy;

    @TableField(value = "`updated`", fill = FieldFill.UPDATE)
    @AcColumn(name = "`updated`", comment = "修改时间")
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updated;

    @TableField(value = "`update_by`")
    @AcColumn(name = "`update_by`", comment = "更新者")
    private String updateBy;

    @AcColumn(name = "`remark`", comment = "备注")
    @TableField(value = "`remark`")
    private String remark;
}
