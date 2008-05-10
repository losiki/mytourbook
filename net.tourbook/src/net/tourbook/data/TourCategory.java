/*******************************************************************************
 * Copyright (C) 2005, 2008  Wolfgang Schramm and Contributors
 *  
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software 
 * Foundation version 2 of the License.
 *  
 * This program is distributed in the hope that it will be useful, but WITHOUT 
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS 
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with 
 * this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110, USA    
 *******************************************************************************/

package net.tourbook.data;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import net.tourbook.database.TourDatabase;

@Entity
public class TourCategory {

	/*
	 * DON'T USE THE FINAL KEYWORD FOR THE ID because the Id cannot be set
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long						categoryId	= TourDatabase.ENTITY_IS_NOT_SAVED;

	@ManyToMany(cascade = CascadeType.ALL)
	private final Collection<TourData>	tourData	= new ArrayList<TourData>();

	@Basic(optional = false)
	private String						category;

	public TourCategory() {}

	public TourCategory(final String category) {
		this.category = category;
	}

	public String getCategory() {
		return category;
	}

	public long getCategoryId() {
		return categoryId;
	}

	public Collection<TourData> getTourData() {
		return tourData;
	}

	/**
	 * Set the name for the tour tag
	 * 
	 * @param tourTagName
	 */
	public void setCategory(final String tourTagName) {
		this.category = tourTagName;
	}

}
