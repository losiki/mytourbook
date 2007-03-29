/*******************************************************************************
 * Copyright (C) 2005, 2007  Wolfgang Schramm
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
package net.tourbook.ui;

/**
 * The viewer is able to show a tour chart
 */
public interface ITourChartViewer {

	/**
	 * Show the tour chart for the given tour id, when the tour id is -1, the
	 * tour chart should be hidden
	 * 
	 * @param tourId
	 */
	public void showTourChart(long tourId);

	/**
	 * Open the tour in the editor
	 * 
	 * @param tourId
	 */
	public void openTourChart(long tourId);

	/**
	 * Set in the viewer the active year which was selected in the statistic
	 * 
	 * @param activeYear
	 */
	public void setActiveYear(int activeYear);

	/**
	 * show the tour chart container
	 */
	public void showTourChart(boolean isVisible);

}
