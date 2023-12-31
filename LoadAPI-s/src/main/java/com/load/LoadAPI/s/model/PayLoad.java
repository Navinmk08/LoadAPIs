package com.load.LoadAPI.s.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name="pay_load_info")
public class PayLoad
{
    private String loadingPoint;
    private String uploadingPoint;
    private String productType;
    private String truckType;
    private Integer noOfTrucks;
    private Integer weight;
    private String comment;
    @Id
    private String shipperId;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    private Date date;



    public PayLoad() {
    }

    public PayLoad(String loadingPoint, String uploadingPoint, String productType, String truckType, Integer noOfTrucks, Integer weight, String comment, String shipperId, Date date) {
        this.loadingPoint = loadingPoint;
        this.uploadingPoint = uploadingPoint;
        this.productType = productType;
        this.truckType = truckType;
        this.noOfTrucks = noOfTrucks;
        this.weight = weight;
        this.comment = comment;
        this.shipperId = shipperId;
        this.date = date;
    }

    public String getLoadingPoint() {
        return loadingPoint;
    }

    public void setLoadingPoint(String loadingPoint) {
        this.loadingPoint = loadingPoint;
    }

    public String getUploadingPoint() {
        return uploadingPoint;
    }

    public void setUploadingPoint(String uploadingPoint) {
        this.uploadingPoint = uploadingPoint;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getTruckType() {
        return truckType;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    public Integer getNoOfTrucks() {
        return noOfTrucks;
    }

    public void setNoOfTrucks(Integer noOfTrucks) {
        this.noOfTrucks = noOfTrucks;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getShipperId() {
        return shipperId;
    }

    public void setShipperId(String shipperId) {
        this.shipperId = shipperId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
