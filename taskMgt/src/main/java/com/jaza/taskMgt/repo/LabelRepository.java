package com.jaza.taskMgt.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.jaza.taskMgt.model.Label;
import com.jaza.taskMgt.model.LabelProjection;
@RepositoryRestResource(collectionResourceRel="label", path="label", excerptProjection = LabelProjection.class)
public interface LabelRepository extends PagingAndSortingRepository<Label, Long>{

	@Query(value="select * from task_mgt.label l INNER JOIN task_mgt.task t ON l.id=t.label_id WHERE l.label_name like ?1 AND t.task_assign_date = NOW()", nativeQuery=true)
	List<Label> findByLabelNameAndAssignTaskDate(@Param("labelName") String labelName);
}
