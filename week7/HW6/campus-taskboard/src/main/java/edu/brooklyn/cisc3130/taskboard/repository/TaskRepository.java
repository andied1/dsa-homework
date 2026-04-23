package edu.brooklyn.cisc3130.taskboard.repository;

import edu.brooklyn.cisc3130.taskboard.model.Task;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable; //For pagination support
import org.springframework.data.jpa.repository.JpaRepository; //Provides CRUD operations
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {
    
    // Find all completed tasks
    List<Task> findByCompletedTrue();
    
    // Find all incomplete tasks
    List<Task> findByCompletedFalse();
    
    // Find tasks by priority
    List<Task> findByPriority(Task.Priority priority);
    
    // Find tasks by title containing (case-insensitive)
    List<Task> findByTitleContainingIgnoreCase(String title);
    
    // Find completed tasks by priority
    List<Task> findByCompletedAndPriority(Boolean completed, Task.Priority priority);
    
    // Custom query using JPQL
    @Query("SELECT t FROM Task t WHERE t.title LIKE %:keyword% OR t.description LIKE %:keyword%") //Custom SQL/JPQL queries
    List<Task> searchTasks(@Param("keyword") String keyword);

    //Custom query, for long description
    @Query("SELECT t FROM Task t WHERE LENGTH(t.description) > :length")
    List<Task> findTasksWithLongDescriptions(@Param("length") int length);

    //Custom query, for no description
    @Query("SELECT t FROM Task t WHERE t.description IS NULL OR t.description = ''")
    List<Task> findTasksWithoutDescription();
    
    // Paginated query for completed tasks
    Page<Task> findByCompletedTrue(Pageable pageable);
    
    // Count tasks by priority
    long countByPriority(Task.Priority priority);
}