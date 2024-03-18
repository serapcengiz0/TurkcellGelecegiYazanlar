package com.turkcell.rentacar.entities.concretes;

import com.turkcell.rentacar.core.entities.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data//getter+setter @Getter + @Setter
@Entity //bir veritabanı varlığı olduğunu gösterir
@Table(name="brands")//Tablonun ismide brands olsun
public class Brand extends BaseEntity {
    private String name;

}
