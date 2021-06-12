
package com.nsg.pagingdemo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TestTitle {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("test_series_id")
    @Expose
    private String testSeriesId;
    @SerializedName("free_flag")
    @Expose
    private String freeFlag;
    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("questions")
    @Expose
    private String questions;
    @SerializedName("marks")
    @Expose
    private String marks;
    @SerializedName("is_completed")
    @Expose
    private Boolean isCompleted;
    @SerializedName("is_test_attempted")
    @Expose
    private Boolean isTestAttempted;
    @SerializedName("pdf_url")
    @Expose
    private String pdfUrl;
    @SerializedName("show_result")
    @Expose
    private String showResult;
    @SerializedName("show_rank")
    @Expose
    private String showRank;
    @SerializedName("show_solutions")
    @Expose
    private String showSolutions;
    @SerializedName("attempt_enabled")
    @Expose
    private String attemptEnabled;
    @SerializedName("exam_theme")
    @Expose
    private String examTheme;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("upcoming_date_time")
    @Expose
    private String upcomingDateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTestSeriesId() {
        return testSeriesId;
    }

    public void setTestSeriesId(String testSeriesId) {
        this.testSeriesId = testSeriesId;
    }

    public String getFreeFlag() {
        return freeFlag;
    }

    public void setFreeFlag(String freeFlag) {
        this.freeFlag = freeFlag;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    public Boolean getIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(Boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    public Boolean getIsTestAttempted() {
        return isTestAttempted;
    }

    public void setIsTestAttempted(Boolean isTestAttempted) {
        this.isTestAttempted = isTestAttempted;
    }

    public String getPdfUrl() {
        return pdfUrl;
    }

    public void setPdfUrl(String pdfUrl) {
        this.pdfUrl = pdfUrl;
    }

    public String getShowResult() {
        return showResult;
    }

    public void setShowResult(String showResult) {
        this.showResult = showResult;
    }

    public String getShowRank() {
        return showRank;
    }

    public void setShowRank(String showRank) {
        this.showRank = showRank;
    }

    public String getShowSolutions() {
        return showSolutions;
    }

    public void setShowSolutions(String showSolutions) {
        this.showSolutions = showSolutions;
    }

    public String getAttemptEnabled() {
        return attemptEnabled;
    }

    public void setAttemptEnabled(String attemptEnabled) {
        this.attemptEnabled = attemptEnabled;
    }

    public String getExamTheme() {
        return examTheme;
    }

    public void setExamTheme(String examTheme) {
        this.examTheme = examTheme;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getUpcomingDateTime() {
        return upcomingDateTime;
    }

    public void setUpcomingDateTime(String upcomingDateTime) {
        this.upcomingDateTime = upcomingDateTime;
    }

}
