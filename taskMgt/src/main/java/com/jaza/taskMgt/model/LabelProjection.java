package com.jaza.taskMgt.model;

import java.util.List;

import org.springframework.data.rest.core.config.Projection;

/**
 * @author dheeraj.yadav
 *
 */


@Projection(name = "labelProjection", types = { Label.class } )
public interface LabelProjection {
	public Long getId();
	public String getLabelName();
	public String getLabelDescription();
	public boolean isDelFlag();
	public List<Task> getTaskList();
}
