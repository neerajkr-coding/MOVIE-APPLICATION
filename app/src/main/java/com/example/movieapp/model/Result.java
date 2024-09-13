package com.example.movieapp.model;

import java.util.List;

public class Result {

    private Integer page;
    private Integer totalpages;
    private Integer totalresult;
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
