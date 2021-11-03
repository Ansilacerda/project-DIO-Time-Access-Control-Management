package com.dio.ansi.model;

import lombok.*;
import org.hibernate.envers.Audited;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited

public class Company {
    @Id
    @GeneratedValue
    private Long id;
    private String description;
    private String address;
    private String cnpj;
    private String district;
    private String city;
    private String state;
    private String telephone;
}
