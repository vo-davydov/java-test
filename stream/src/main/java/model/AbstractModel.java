package model;

import java.io.Serializable;
import java.util.Date;

public abstract class AbstractModel implements Serializable {
  private Long id;
  private Date createDate;
  private Date updateDate;
  private String name;

  public AbstractModel(){

  }

  public AbstractModel(Date createDate, String name) {
    this.createDate = createDate;
    this.name = name;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  public Date getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(Date updateDate) {
    this.updateDate = updateDate;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    AbstractModel that = (AbstractModel) o;

    if (!id.equals(that.id)) {
      return false;
    }
    if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) {
      return false;
    }
    if (updateDate != null ? !updateDate.equals(that.updateDate) : that.updateDate != null) {
      return false;
    }
    return name != null ? name.equals(that.name) : that.name == null;
  }

  @Override
  public int hashCode() {
    int result = id.hashCode();
    result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
    result = 31 * result + (updateDate != null ? updateDate.hashCode() : 0);
    result = 31 * result + (name != null ? name.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "AbstractModel{" +
      "id=" + id +
      ", createDate=" + createDate +
      ", updateDate=" + updateDate +
      ", name='" + name + '\'' +
      '}';
  }
}
