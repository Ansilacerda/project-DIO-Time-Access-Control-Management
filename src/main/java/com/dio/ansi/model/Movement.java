package com.dio.ansi.model;

import lombok.*;

import javax.persistence.*;
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
public class Movement {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public  class MovementId implements Serializable{
        private long idMovement;
        private long idUser;
    }
    @Id
    @EmbeddedId
    private MovementId movementId;
    private LocalDateTime entryDate;
    private LocalDateTime departureDate;
    private BigDecimal timeCourse;

    @ManyToOne
    private Occurrence occurrence;

    @ManyToOne
    private Calendar calendar;
}
