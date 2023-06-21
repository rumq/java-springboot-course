package demo.pv10springdatarepositories;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

    @Modifying(clearAutomatically = true)
    @Transactional
    @Query("update Recipe set spiceLevel=?2 where type=?1")
    int updateSpiceLevel(String type, String spiceLevel);

    List<Recipe> findByType(String type);


//    public int updateSpiceLevel(String type, String spiceLevel){
//        String jpql = "update Recipe set spiceLevel=:s where type=:t";
//        jakarta.persistence.Query query = entityManager.createQuery(jpql);
//        query.setParameter("t", type);
//        query.setParameter("s", spiceLevel);
//        return query.executeUpdate();
//
//    }

}
