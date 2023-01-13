package shop.mtcoding.orange2.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductRepository {
    public List<Product> findAll(); // findAll = select id값

    public Product findOne(int id);
}