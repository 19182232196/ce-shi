package com.pojo;

public class Dept {

    private Integer deptId;
    private Integer deptname;

    public Dept(Integer deptId, Integer deptname) {
        this.deptId = deptId;
        this.deptname = deptname;
    }

    public Dept() {
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getDeptname() {
        return deptname;
    }

    public void setDeptname(Integer deptname) {
        this.deptname = deptname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptId=" + deptId +
                ", deptname=" + deptname +
                '}';
    }
}
