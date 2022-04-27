package com.abhi.DAO;
import org.springframework.data.jpa.repository.*;

import com.abhi.entity.User;

public interface UserDAO extends JpaRepository<User,Integer>
{
}
