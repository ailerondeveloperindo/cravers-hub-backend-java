package com.cravershub.craver_hub.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customerid", nullable = false)
    private com.cravershub.craver_hub.entity.Customer customerid;

    @Column(name = "fulladdress", nullable = false, length = Integer.MAX_VALUE)
    private String fulladdress;

    @Column(name = "region", length = Integer.MAX_VALUE)
    private String region;

    @Column(name = "regency", length = Integer.MAX_VALUE)
    private String regency;

    @Column(name = "province", length = Integer.MAX_VALUE)
    private String province;

    @Column(name = "district", length = Integer.MAX_VALUE)
    private String district;

    @Column(name = "subdistrict", length = Integer.MAX_VALUE)
    private String subdistrict;

    @Column(name = "postalcode")
    private Integer postalcode;

    @Column(name = "country", length = Integer.MAX_VALUE)
    private String country;

    @Column(name = "longitude")
    private Float longitude;

    @Column(name = "latitude")
    private Float latitude;

    @Column(name = "favourite")
    private Boolean favourite;

    @Column(name = "driverinstruction", length = Integer.MAX_VALUE)
    private String driverinstruction;

    @Column(name = "floor", length = Integer.MAX_VALUE)
    private String floor;

    @Column(name = "buildingname", length = Integer.MAX_VALUE)
    private String buildingname;

    @Column(name = "handsordertocustomer", nullable = false)
    private Boolean handsordertocustomer = false;

    @Column(name = "leaverorderatlocation", nullable = false)
    private Boolean leaverorderatlocation = false;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public com.cravershub.craver_hub.entity.Customer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(com.cravershub.craver_hub.entity.Customer customerid) {
        this.customerid = customerid;
    }

    public String getFulladdress() {
        return fulladdress;
    }

    public void setFulladdress(String fulladdress) {
        this.fulladdress = fulladdress;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegency() {
        return regency;
    }

    public void setRegency(String regency) {
        this.regency = regency;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getSubdistrict() {
        return subdistrict;
    }

    public void setSubdistrict(String subdistrict) {
        this.subdistrict = subdistrict;
    }

    public Integer getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(Integer postalcode) {
        this.postalcode = postalcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Boolean getFavourite() {
        return favourite;
    }

    public void setFavourite(Boolean favourite) {
        this.favourite = favourite;
    }

    public String getDriverinstruction() {
        return driverinstruction;
    }

    public void setDriverinstruction(String driverinstruction) {
        this.driverinstruction = driverinstruction;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getBuildingname() {
        return buildingname;
    }

    public void setBuildingname(String buildingname) {
        this.buildingname = buildingname;
    }

    public Boolean getHandsordertocustomer() {
        return handsordertocustomer;
    }

    public void setHandsordertocustomer(Boolean handsordertocustomer) {
        this.handsordertocustomer = handsordertocustomer;
    }

    public Boolean getLeaverorderatlocation() {
        return leaverorderatlocation;
    }

    public void setLeaverorderatlocation(Boolean leaverorderatlocation) {
        this.leaverorderatlocation = leaverorderatlocation;
    }

}