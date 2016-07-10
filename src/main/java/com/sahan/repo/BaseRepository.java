package com.sahan.repo;

import java.util.List;

/**
 * Created by sahan on 7/10/2016.
 */
public interface BaseRepository {
    public <T> List<T> viewAllBooks(Class<T> clazz);
}
