package com.jaza.taskMgt.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.jaza.taskMgt.model.Task;
/**
 * @author dheeraj.yadav
 *
 */

@RepositoryRestResource(collectionResourceRel="task", path="task")
public interface TaskRepository extends PagingAndSortingRepository<Task, Long>{
	
	@Query(value="select * from task WHERE task_assign_date BETWEEN NOW() AND DATE_ADD(NOW(), INTERVAL 2 DAY)", nativeQuery=true)
	List<Task> findByNextTwoDaysTask();
	
	@Query("select t from Task t  WHERE t.priority=?1")
	List<Task> findByPriority(@Param("priority")Integer priority);
}
