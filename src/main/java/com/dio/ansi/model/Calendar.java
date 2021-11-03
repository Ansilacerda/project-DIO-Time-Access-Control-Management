package com.dio.ansi.model;


import lombok.*;
import org.hibernate.envers.Audited;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class Calendar {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private DateType dateType;
    private String description;
    private LocalDateTime specialDate;
}