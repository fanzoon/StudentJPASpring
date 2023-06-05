package com.example.studentjpaspring.services;

import com.example.studentjpaspring.models.Group;

import java.util.List;

public interface GroupService {
    List<Group> getAllGroup();

    Group getGroupById(Long groupId);
}

