/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.mongo.demo.dto;

import java.util.List;

/**
 *
 * @author Jose Guillermo Yanez
 */

/**
 *
 * @author Jose Guillermo Yanez
 */
public class Vales2 {
    private int page;
    private int per_page;
    private int total;
    private int total_pages;
    private List<ValesItems2> data;

    public Vales2(int page, int per_page, int total, int total_pages, List<ValesItems2> data) {
        this.page = page;
        this.per_page = per_page;
        this.total = total;
        this.total_pages = total_pages;
        this.data = data;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPer_page() {
        return per_page;
    }

    public void setPer_page(int per_page) {
        this.per_page = per_page;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    public List<ValesItems2> getData() {
        return data;
    }

    public void setData(List<ValesItems2> data) {
        this.data = data;
    }

}