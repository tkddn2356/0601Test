package week7.repository;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import week7.domain.User;

import java.util.List;

@Repository
public interface UserMapper {
    @Select(value="select * from users")
    List<User> getUserList();
}
