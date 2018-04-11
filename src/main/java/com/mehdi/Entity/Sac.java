package com.mehdi.Entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by m_che on 11/04/2018.
 */

@Entity
@Component
@Data
public class Sac {

    @Id
    private Long id;
    private String name;
    private String description;
    private int price;


}
