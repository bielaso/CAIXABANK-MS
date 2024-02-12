package escoliapiamataro.com.CAIXABANKDS.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "USER_BANKING")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_ENTITY")
    private Integer idEntity;

    @Column(name = "COLUMN_STRING")
    private String columnString;

    @Column(name ="COLUMN_DATE")
    private Date columnDate;

}
