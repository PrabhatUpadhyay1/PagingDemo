
package com.nsg.pagingdemo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginResponse {

    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("data")
    @Expose
    private String data;
    @SerializedName("test_titles")
    @Expose
    private List<TestTitle> testTitles = null;
    @SerializedName("test_pdf")
    @Expose
    private List<Object> testPdf = null;
    @SerializedName("total")
    @Expose
    private Integer total;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<TestTitle> getTestTitles() {
        return testTitles;
    }

    public void setTestTitles(List<TestTitle> testTitles) {
        this.testTitles = testTitles;
    }

    public List<Object> getTestPdf() {
        return testPdf;
    }

    public void setTestPdf(List<Object> testPdf) {
        this.testPdf = testPdf;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

}
