package demo.pv10springdatarepositories;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

    @Modifying(clearAutomatically = true)
    @Transactional
    @Query("update Recipe set spiceLevel=?2 where type=?1")
    int updateSpiceLevel(String type, String spiceLevel);


//    public int updateSpiceLevel(String type, String spiceLevel){
//        String jpql = "update Recipe set spiceLevel=:s where type=:t";
//        jakarta.persistence.Query query = entityManager.createQuery(jpql);
//        query.setParameter("t", type);
//        query.setParameter("s", spiceLevel);
//        return query.executeUpdate();
//
//    }


    @Query(value = "select count(*) from recipes", nativeQuery = true)
    int nativeQuery();

    @Modifying
    @Transactional
    @Query(value =
         "delete from recipes where recipe_id in ("
        + "  SELECT recipe_id FROM ( SELECT recipe_id, @i \\:= @i+1 AS num from recipes"
        + "    JOIN (SELECT @i \\:= 0) AS var where @i < :batchSize and CREATED_DATE_TIME < :createDateTime)"
        + "      path_details)", nativeQuery = true)
    int deleteNativeQuery(@Param("batchSize") int batchSize, @Param("createDateTime") Date createDateTime);

    @Modifying
    @Transactional
    @Query(value = "delete from recipes where recipe_id < 1000 and created_date_time < :cdatetime limit :size",
        nativeQuery = true)
    int deleteNativeQuerySimple(@Param("size") int size, @Param("cdatetime") Date cdatetime);

    @Modifying
    @Transactional
    @Query(value = "delete from recipes where recipe_id < 1000 and created_date_time < :cdatetime limit :size",
        nativeQuery = true)
    int deleteNativeQuerySimpleLocalDateTime(@Param("size") int size, @Param("cdatetime") LocalDateTime cdatetime);

}
