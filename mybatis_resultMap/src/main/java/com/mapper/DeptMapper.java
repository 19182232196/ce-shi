package com.mapper;

import com.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    Dept getEmpAndDeptByStepW(@Param("deptId") Integer deptId);
    Dept getDeptAndEmpByDeptId(@Param("deptId") Integer deptId);
    Dept getDeptAndEmpByStepQ(@Param("stepId") Integer deptId);
}
