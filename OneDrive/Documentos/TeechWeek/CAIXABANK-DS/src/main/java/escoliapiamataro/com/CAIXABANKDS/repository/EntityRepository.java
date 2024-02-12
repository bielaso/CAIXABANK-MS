package escoliapiamataro.com.CAIXABANKDS.repository;

import escoliapiamataro.com.CAIXABANKDS.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface EntityRepository extends JpaRepository<UserEntity, Integer> {


}
