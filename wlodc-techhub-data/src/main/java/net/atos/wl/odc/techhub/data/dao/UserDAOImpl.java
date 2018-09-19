/*
 * Copyright (C) 2018 Worldline ODC.
 */
package net.atos.wl.odc.techhub.data.dao;

import org.springframework.stereotype.Repository;

import net.atos.wl.odc.techhub.data.entity.User;

/**
 * User DAO Implementation.
 * 
 * @author a120065
 */
@Repository
public class UserDAOImpl extends AbstractJpaDAO<User> implements UserDAO {

    /**
     * Default constructor.
     */
    public UserDAOImpl() {
        this.setClazz(User.class);
    }
}