package  com.jaza.taskMgt.model;


import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 * @author dheeraj.yadav
 *
 */

@Entity
@Table(name = "task")
public class Task {
	@Id
	@Column(name = "id", updatable = false, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long Id;

	@Column(name = "label_id", nullable = false)
	protected Long labelId;
	
	@Column(name = "task_name", nullable = false)
	protected String taskName;
	
	@Column(name = "task_description", nullable = false)
	protected String taskDescription;

	@Temporal(TemporalType.DATE)
	@Column(name = "task_assign_date", nullable = false)
	protected Date taskAsignDate;
	
    @Column(name="del_flag",nullable= false)
    protected boolean delFlag;
	
	@Column(name="priority", nullable= false)
	protected Integer priority;
	
	
	
	public Task() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public Date getTaskAsignDate() {
		return taskAsignDate;
	}

	public void setTaskAsignDate(Date taskAsignDate) {
		this.taskAsignDate = taskAsignDate;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public boolean isDelFlag() {
		return delFlag;
	}

	public void setDelFlag(boolean delFlag) {
		this.delFlag = delFlag;
	}

	public Long getLabelId() {
		return labelId;
	}

	public void setLabelId(Long labelId) {
		this.labelId = labelId;
	}




	
	

}
