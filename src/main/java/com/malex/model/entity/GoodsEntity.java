//package com.malex.model.entity;
//
//import com.malex.model.Category;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.validation.constraints.NotNull;
//
//@Entity
//@Table(name = "GOODS")
//public class GoodsEntity {
//
//    @Id
//    @GeneratedValue
//    private Long id;
//    @NotNull
//    private String name;
//    @NotNull
//    private Long count;
//    @NotNull
//    private Category category;
//    @NotNull
//    private Double price;
//    @NotNull
//    private String producer;
//
//    public GoodsEntity() {
//    }
//
//    public Long getBank_id() {
//        return id;
//    }
//
//    public void setBank_id(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Long getCount() {
//        return count;
//    }
//
//    public void setCount(Long count) {
//        this.count = count;
//    }
//
//    public Category getCategory() {
//        return category;
//    }
//
//    public void setCategory(Category category) {
//        this.category = category;
//    }
//
//    public Double getPrice() {
//        return price;
//    }
//
//    public void setPrice(Double price) {
//        this.price = price;
//    }
//
//    public String getProducer() {
//        return producer;
//    }
//
//    public void setProducer(String producer) {
//        this.producer = producer;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        GoodsEntity that = (GoodsEntity) o;
//
//        if (id != null ? !id.equals(that.id) : that.id != null) return false;
//        if (name != null ? !name.equals(that.name) : that.name != null) return false;
//        if (count != null ? !count.equals(that.count) : that.count != null) return false;
//        if (category != that.category) return false;
//        if (price != null ? !price.equals(that.price) : that.price != null) return false;
//        return producer != null ? producer.equals(that.producer) : that.producer == null;
//
//    }
//
//    @Override
//    public int hashCode() {
//        int result = id != null ? id.hashCode() : 0;
//        result = 31 * result + (name != null ? name.hashCode() : 0);
//        result = 31 * result + (count != null ? count.hashCode() : 0);
//        result = 31 * result + (category != null ? category.hashCode() : 0);
//        result = 31 * result + (price != null ? price.hashCode() : 0);
//        result = 31 * result + (producer != null ? producer.hashCode() : 0);
//        return result;
//    }
//
//}
