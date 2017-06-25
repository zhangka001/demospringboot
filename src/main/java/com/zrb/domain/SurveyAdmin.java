package com.zrb.domain;

public class SurveyAdmin {
    private Integer adminId;

    private String adminName;

    private String adminPwd;

    private String resCodeArr;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public String getAdminPwd() {
        return adminPwd;
    }

    public void setAdminPwd(String adminPwd) {
        this.adminPwd = adminPwd == null ? null : adminPwd.trim();
    }

    public String getResCodeArr() {
        return resCodeArr;
    }

    public void setResCodeArr(String resCodeArr) {
        this.resCodeArr = resCodeArr == null ? null : resCodeArr.trim();
    }
}