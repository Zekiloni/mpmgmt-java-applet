/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mobileplanmgmt.domain.service;

import java.util.List;

/**
 *
 * @author Zekiloni
 */
public interface EntityService <T, K> {
    T create(T entity);
    void delete(K entityId);
    T update(T entity);
    T getById(K entityId);
    List<T> getAll();
}
