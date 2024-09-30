package com.example.movieapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Result {

    @SerializedName("page")
    @Expose
    private Integer page;

    @SerializedName("total_pages")
    @Expose
    private Integer totalpages;

    @SerializedName("total_results")
    @Expose
    private Integer totalresult;

    @SerializedName("results")
    @Expose
    private List<Movie> result = null;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getTotalpages() {
        return totalpages;
    }

    public void setTotalpages(Integer totalpages) {
        this.totalpages = totalpages;
    }

    public Integer getTotalresult() {
        return totalresult;
    }

    public void setTotalresult(Integer totalresult) {
        this.totalresult = totalresult;
    }

    public List<Movie> getResult() {
        return result;
    }

    public void setResult(List<Movie> result) {
        this.result = result;
    }


}
