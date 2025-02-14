package com.cravershub.craver_hub.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "driver")
public class Driver {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", length = Integer.MAX_VALUE)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "vehicletypeid", nullable = false)
    private com.cravershub.craver_hub.entity.Vehicletype vehicletypeid;

    @Column(name = "vehiclename", nullable = false, length = Integer.MAX_VALUE)
    private String vehiclename;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public com.cravershub.craver_hub.entity.Vehicletype getVehicletypeid() {
        return vehicletypeid;
    }

    public void setVehicletypeid(com.cravershub.craver_hub.entity.Vehicletype vehicletypeid) {
        this.vehicletypeid = vehicletypeid;
    }

    public String getVehiclename() {
        return vehiclename;
    }

    public void setVehiclename(String vehiclename) {
        this.vehiclename = vehiclename;
    }

}