package com.example.api_project_retrofit.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BaseModel {

    @SerializedName("page")
    private int page ;

    @SerializedName("total_results")
    private int total_results ;

    @SerializedName("total_pages")
    private int total_pages ;

    @SerializedName("results")
    private List<Result> results ;

    public BaseModel() {
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotal_results() {
        return total_results;
    }

    public void setTotal_results(int total_results) {
        this.total_results = total_results;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;


    }
}
