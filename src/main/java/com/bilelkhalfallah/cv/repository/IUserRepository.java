package com.bilelkhalfallah.cv.repository;

import com.bilelkhalfallah.cv.model.User;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepository extends CrudRepository<User,Long> {
}
