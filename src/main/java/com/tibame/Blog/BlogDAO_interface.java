package com.tibame.Blog;

import java.util.List;


public interface BlogDAO_interface {

    public void insert(BlogVO blogVO);

    public void update(BlogVO blogVO);

    public void delete(Integer blogId); // 刪除 主鍵 PK

    public BlogVO findByPrimaryKey(Integer blogId); // 查詢，靠主鍵查，回傳 BlogVO

    public List<BlogVO> getAll();

    // 萬用複合查詢(傳入參數型態 Map)(回傳 List)
    // public List<BlogVO> getAll(Map<String, String[]> map);
}