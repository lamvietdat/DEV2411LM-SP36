package com.example.devmaster.lab05.service;

import com.example.devmaster.lab05.models.Content;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ContentService {
    private final List<Content> contents = new ArrayList<>();
    private int nextId = 1;

    public List<Content> getAll() {
        return contents;
    }

    public void addContent(Content content) {
        content.setId(nextId++);
        contents.add(content);
    }

    public void deleteContent(int id) {
        contents.removeIf(content -> content.getId() == id);
    }

    public Content getById(int id) {
        return contents.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void updateContent(Content updatedContent) {
        for (Content content : contents) {
            if (content.getId() == updatedContent.getId()) {
                content.setTitle(updatedContent.getTitle());
                content.setDescription(updatedContent.getDescription());
                break;
            }
        }
    }

}
