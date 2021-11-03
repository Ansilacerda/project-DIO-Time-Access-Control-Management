package com.dio.ansi.model;

import lombok.*;
import org.hibernate.envers.Audited;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class CompTime {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public  class CompTimeId implements Serializable{
        private long idCompTime;
        private long idMovement;
        private long idUser;

    }

    @Id
    @EmbeddedId
    private CompTimeId compTimeId;
    private LocalDateTime dateWork;
    private BigDecimal quantityHours;
    private BigDecimal balanceHours;

}
