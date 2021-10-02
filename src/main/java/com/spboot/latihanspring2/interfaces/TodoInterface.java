package com.spboot.latihanspring2.interfaces;

import com.spboot.latihanspring2.models.Todo;
import java.util.List;

public interface TodoInterface {
    List<Todo> getAll();
    void store(Todo todo);
}