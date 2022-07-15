package com.minhw.common.utils;

import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * @program: DataReporting
 * @description:
 * @author: MinHw or mz
 * @create: 2022-04-05 11:52
 **/
public class PageVo<T> {
    //结果集
    private List<T> list;
    /**
     * 每页多少条数据
     **/
    private int pageSize;
    //第几页
    private int pageNo;
    //查询总记录数
    private long totalRecords;

    /**
     * limit的起点
     * (pageNo - 1) * pageSize}
     */
//    private int count;
//
    public RowBounds getRowBounds() {
//        limit的起点
        Integer offset = (pageNo - 1) * pageSize;
        return new RowBounds(offset, pageSize);
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public long getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(long totalRecords) {
        this.totalRecords = totalRecords;
    }
}
