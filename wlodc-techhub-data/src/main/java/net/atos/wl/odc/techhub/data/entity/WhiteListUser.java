/*
 * Copyright (C) 2018 Worldline ODC.
 */
package net.atos.wl.odc.techhub.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * JPA Entity holding the ids of whitelist users.
 * 
 * @author a120065
 */
@Entity
@Table(name = "white_list_user")
@NamedQueries({
        @NamedQuery(name = "net.atos.wl.odc.techhub.data.entity.WhiteListUser.fetchUserByUserId", query = "SELECT wlu FROM WhiteListUser wlu where wlu.userId = :userId")})
public class WhiteListUser extends PersistableEntity {

    /**
     * Generated serial version Id.
     */
    private static final long serialVersionUID = -2077818611517887308L;

    @Column(name = "user_id", nullable = false)
    private String userId;

    /**
     * Getter for userId.
     *
     * @return the userId
     */
    public final String getUserId() {
        return userId;
    }

    /**
     * Setter for userId.
     *
     * @param userId
     *            the userId to set
     */
    public final void setUserId(String userId) {
        this.userId = userId;
    }
}
