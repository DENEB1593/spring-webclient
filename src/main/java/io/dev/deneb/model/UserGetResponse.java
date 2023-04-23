package io.dev.deneb.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;


public class UserGetResponse {
  private int page;
  private int perPage;
  private int total;
  private List<User> data;

  public UserGetResponse() { }

  public UserGetResponse(
      int page,
      int perPage,
      int total,
      List<User> data) {
    this.page = page;
    this.perPage = perPage;
    this.total = total;
    this.data = data;
  }

  public int getPage() {
    return page;
  }

  public void setPage(int page) {
    this.page = page;
  }

  public int getPerPage() {
    return perPage;
  }

  public void setPerPage(int perPage) {
    this.perPage = perPage;
  }

  public int getTotal() {
    return total;
  }

  public void setTotal(int total) {
    this.total = total;
  }

  public List<User> getData() {
    return data;
  }

  public void setData(List<User> data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this)
        .append("page", page)
        .append("perPage", perPage)
        .append("total", total)
        .append("data", data)
        .toString();
  }
}
