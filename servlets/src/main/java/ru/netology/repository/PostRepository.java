package ru.netology.repository;

import ru.netology.exception.NotFoundException;
import ru.netology.model.Post;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;


public class PostRepository {
  private final Map<Long, Post> posts = new ConcurrentHashMap<>();
  private final AtomicLong currentId = new AtomicLong(1); // начинаем с 1

  public List<Post> all() {
    // Возвращаем копию, чтобы нельзя было менять извне
    return new ArrayList<>(posts.values());
  }

  public Optional<Post> getById(long id) {
    return Optional.ofNullable(posts.get(id));
  }

  public Post save(Post post) {
    if (post.getId() == 0) {
      // Создаём новый пост
      long newId = currentId.getAndIncrement();
      post.setId(newId);
      posts.put(newId, post);
    } else {
      // Обновляем существующий
      if (!posts.containsKey(post.getId())) {
        throw new NotFoundException("Post with id " + post.getId() + " not found");
      }
      posts.put(post.getId(), post);
    }
    return post;
  }

  public void removeById(long id) {
    posts.remove(id); // remove безопасен даже если ключа нет
  }
}