package org.springframework.samples.mvc.views;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "CALCULATIONHISTORY")
public class Calculation {

    @Id
    @SequenceGenerator(name = "GEN_CALCULATIONS", sequenceName = "ID_GENERATOR", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GEN_CALCULATIONS")
    private int id;

    @Column(name = "FIRST_NUMBER", nullable = false)
    private float firstNumber;

    @Column(name = "OPERATION", nullable = false)
    private String operation;

    @Column(name = "SECOND_NUMBER", nullable = false)
    private float secondNumber;

    @Column(name = "APOTELESMA", nullable = false)
    private float apotelesma;

    @Column(name = "HMEROMHNIA_", nullable = false)
    private String hmeromhnia_;

    @Temporal(TemporalType.DATE)
    @Column(name = "HMEROMHNIA__")
    private Date hmeromhnia__;

    @Temporal(TemporalType.DATE)
    @Column(name = "HMEROMHNIA")
    private Date hmeromhnia;

    @Column(name = "WRA_")
    private String wra_;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "HMEROM")
    private Date hmerom;

    public int getID() { return id; }
    public void setID(int id) { this.id = id; }

    public float getFirstNumber() { return firstNumber; }
    public void setFirstNumber(float firstNumber) { this.firstNumber = firstNumber; }

    public String getOperation() { return operation; }
    public void setOperation(String operation) { this.operation = operation; }

    public float getSecondNumber() { return secondNumber; }
    public void setSecondNumber(float secondNumber) { this.secondNumber = secondNumber; }

    public float getApotelesma() { return apotelesma; }
    public void setApotelesma(float apotelesma) { this.apotelesma = apotelesma; }

    public String getHmeromhnia_() { return hmeromhnia_; }
    public void setHmeromhnia_(String hmeromhnia_) { this.hmeromhnia_ = hmeromhnia_; }

    public Date getHmeromhnia__() { return hmeromhnia__; }
    public void setHmeromhnia__(Date hmeromhnia__) { this.hmeromhnia__ = hmeromhnia__; }

    public Date getHmeromhnia() { return hmeromhnia; }
    public void setHmeromhnia(Date hmeromhnia) { this.hmeromhnia = hmeromhnia; }

    public String getWra_() { return wra_; }
    public void setWra_(String wra_) { this.wra_ = wra_; }

    public Date getHmerom() { return hmerom; }
    public void setHmerom(Date hmerom) { this.hmerom = hmerom; }
}
