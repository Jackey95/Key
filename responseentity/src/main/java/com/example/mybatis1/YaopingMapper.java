package com.example.mybatis1;

import com.example.mybatis1.yaoping;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
@Mapper
public interface YaopingMapper {

        //查询所有药品
        @Select("select * from drugs")
        public List<yaoping> findAllDrugs ();
        //根据id号查找药品
        @Select("select * from drugs where drug_id=#{drug_id}")
        public yaoping findDrugById(int drug_id);
        //添加一个药品
        @Insert("insert into drugs values (null, #{drug_name}, #(manufacturer}, #{dosage},#{price},#{expiration_date}")
        public void addDrugs (yaoping drug) ;
        //修改药品
        @Update("update drug set name=#{name},drug_name= #{drug_name},manufacturer= #(manufacturer},dosage=#{dosage},price=#{price},expiration_date=#{expiration_date}")
        public void updateDrugs (yaoping drug) ;
        //删除一本书
        @Delete("delete from book where drug_id=#{drug_id}")
        public void deleteDrugs(int drug_id);
}
