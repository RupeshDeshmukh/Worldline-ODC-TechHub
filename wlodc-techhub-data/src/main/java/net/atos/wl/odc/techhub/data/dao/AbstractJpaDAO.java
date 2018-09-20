/*
 * Copyright (C) 2018 Worldline ODC.
 */
package net.atos.wl.odc.techhub.data.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import net.atos.wl.odc.techhub.common.enums.State;
import net.atos.wl.odc.techhub.data.entity.PersistableEntity;

/**
 * Abstract JPA DAO within common JPA configuration to be applied across all
 * DAO's.
 * 
 * @param <T>
 *            JPA Entity
 * @author a120065
 */
public abstract class AbstractJpaDAO<T extends PersistableEntity> implements GenericDAO<T> {

    private Class<T> clazz;

    @PersistenceContext
    EntityManager entityManager;

    /**
     * {@inheritDoc}
     */
    @Override
    public void create(final T entity) {
        this.entityManager.persist(entity);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public T read(final Integer id) {
        return this.entityManager.find(this.clazz, id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public T update(final T entity) {
        return this.entityManager.merge(entity);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void delete(final T entity) {

        // Do the soft delete rather than hard delete.
        if (entity != null) {
            entity.setRecordState(State.DELETED);

            this.update(entity);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void deleteById(final int entityId) {

        // Find entity by given Id.
        final T entity = this.read(entityId);

        // Delete the entity.
        this.delete(entity);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings("unchecked")
    public List<T> findAll() {
        return this.entityManager.createQuery("from " + this.clazz.getName()).getResultList();
    }

    /**
     * Setter for Clazz.
     * 
     * @param clazzToSet
     */
    public final void setClazz(final Class<T> clazzToSet) {
        this.clazz = clazzToSet;
    }

    /**
     * Method to check if id exist for the entity if yes then use merge else use
     * persist.
     * 
     * @param entity
     *            T.
     * @return T.
     */
    public T persistOrMerge(T entity) {
        if (entity.getId() == null) {
            this.entityManager.persist(entity);
            return entity;
        } else {
            return this.entityManager.merge(entity);
        }
    }
}
