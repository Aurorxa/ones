package com.github.ones.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.github.ones.entity.base.BaseEntity;
import io.gitee.zerowsh.actable.annotation.AcColumn;
import io.gitee.zerowsh.actable.annotation.AcTable;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 用户表
 *
 * @author 许大仙
 * @version 1.0
 * @since 2022-07-19 14:17:21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AcTable(name = "`user`", comment = "用户表")
@TableName("`user`")
public class User extends BaseEntity implements Serializable {

    @AcColumn(name = "`username`", comment = "账户")
    private String username;

    @AcColumn(name = "`real_name`", comment = "真实姓名")
    private String realName;

    @AcColumn(name = "`nick_name`", comment = "昵称")
    private String nickName;

    @AcColumn(name = "`gender`", comment = "性别")
    private String gender;

    @AcColumn(name = "`password`", comment = "密码")
    private String password;

    @AcColumn(name = "`phone`", comment = "手机号码")
    private String phone;

    @AcColumn(name = "`email`", comment = "邮箱")
    private String email;

    @AcColumn(name = "`status`", comment = "0 禁止 1 启用")
    private int status;

    @AcColumn(name = "`avatar`", comment = "头像地址")
    private String avatar;

    @AcColumn(name = "`sort`", comment = "排序字段")
    private Integer sort;

    @AcColumn(name = "`dept_id`", comment = "部门id")
    private String deptId;

}
