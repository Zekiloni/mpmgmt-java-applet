/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobileplanmgmt.domain.model;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Zekiloni
 */
@Entity
@Table(name = "mobile_plans")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MobilePlan implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", unique = true, nullable = false)
    private String name; 
    
    @Column(name = "description")
    private String description;
    
    @Column(name = "data_limit")
    private int dataLimit;
    
    @Column(name = "minutes_limit")
    private int minutesLimit;
    
    @Column(name = "monthly_fee")
    private Double monthlyFee;
    
    @Column(name = "created_at", nullable = false)
    private OffsetDateTime createdAt;
    
    @Column(name = "updated_at", nullable = true)
    private OffsetDateTime updatedAt;
    
    @OneToMany(mappedBy = "mobilePlan")
    private List<Subscription> subscriptions;
    
    public long getActiveSubscriptions() {
        return this.subscriptions.stream()
                .filter(Subscription::getIsActive)
                .count();
    }
}
