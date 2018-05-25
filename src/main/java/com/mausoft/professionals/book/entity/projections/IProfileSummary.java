package com.mausoft.professionals.book.entity.projections;

import java.io.Serializable;

public interface IProfileSummary extends Serializable {
	public String getFirstName();
	public String getLastName();
	public String getEmail();
	public String getPhone();
	public String getDescription();
	public String getLegend();
	public String getPicture();
	public String getPictureXs();
}
