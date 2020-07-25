package com.yinuo.common;

import java.util.List;

public class PagedGridResult {
    private int page;			// current page
    private int total;			// total page
    private long records;		// total number of records
    private List<?> rows;		// records

    public int getPage() {
        return page;
    }
    public void setPage(int page) {
        this.page = page;
    }
    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    public long getRecords() {
        return records;
    }
    public void setRecords(long records) {
        this.records = records;
    }
    public List<?> getRows() {
        return rows;
    }
    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}
