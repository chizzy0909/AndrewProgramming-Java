package objectandclass.clonedemo;

import java.util.Date;

public class House implements Cloneable, Comparable<House> {

  private int id;
  private double area;//基本数据类型
  private java.util.Date whenBuilt;//引用数据类型

  public House(int id, double area) {
    this.id = id;
    this.area = area;
    whenBuilt = new java.util.Date();
  }

  public int getId() {
    return id;
  }

  public double getArea() {
    return area;
  }

  public java.util.Date getWhenBuilt() {
    return whenBuilt;
  }

  //shallow copy
  /*
  @Override
  public Object clone() {
    try {
      return super.clone();
    } catch (CloneNotSupportedException ex) {
      return null;
    }
  }
   */

//deep copy
  @Override
  /** Override the protected clone method defined in
   the Object class, and strengthen its accessibility */
  public Object clone() {
    try {
      House houseClone = (House) super.clone();
      houseClone.whenBuilt = (Date) whenBuilt.clone();
      return houseClone;
    } catch (CloneNotSupportedException ex) {
      return null;
    }
  }

  @Override // Implement the compareTo method defined in Comparable
  public int compareTo(House o) {
    if (area > o.area) {
      return 1;
    } else if (area < o.area) {
      return -1;
    } else {
      return 0;
    }
  }
}
