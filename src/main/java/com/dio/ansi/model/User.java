package com.dio.ansi.model;


import lombok.*;
import org.hibernate.envers.Audited;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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

public class User {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private UserCategory userCategory;

    private String name;

    @ManyToOne
    private Company company;

    @ManyToOne
    private AccessLevel accessLevel;

    @ManyToOne
    private WorkingJourney workingJourney;

    private BigDecimal tolerance;
    private LocalDateTime journeyStart;
    private LocalDateTime journeyEnd;
}
