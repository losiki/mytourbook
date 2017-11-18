/*******************************************************************************
 * Copyright (C) 2005, 2017 Wolfgang Schramm and Contributors
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
package net.tourbook.ui.views.calendar;

import net.tourbook.Messages;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

public class CalendarProfile {

	/*
	 * Set default values also here to ensure that a valid value is set. A default value would not
	 * be set when an xml tag is not available.
	 */

// SET_FORMATTING_OFF
	
	// profile
	String					id							= Long.toString(System.nanoTime());
	ProfileDefault			defaultId					= CalendarProfileManager.DEFAULT_PROFILE_DEFAULT_ID;
	String					name						= Messages.Calendar_Profile_Name_Default;
	
	// layout
	boolean					isToggleMonthColor			= false;
	boolean					useDraggedScrolling			= false;
	RGB 					alternateMonthRGB			= CalendarProfileManager.DEFAULT_ALTERNATE_MONTH_RGB;
	RGB						calendarBackgroundRGB		= CalendarProfileManager.DEFAULT_CALENDAR_BACKGROUND_RGB;
	RGB						calendarForegroundRGB		= CalendarProfileManager.DEFAULT_CALENDAR_FOREBACKGROUND_RGB;
	int						weekHeight					= CalendarProfileManager.DEFAULT_WEEK_HEIGHT;
	
	// year columns
	boolean 				isShowYearColumns			= true;
	int						yearColumns					= CalendarProfileManager.DEFAULT_YEAR_COLUMNS;
	int 					yearColumnsSpacing			= CalendarProfileManager.DEFAULT_YEAR_COLUMNS_SPACING;
	ColumnStart				yearColumnsStart			= CalendarProfileManager.DEFAULT_YEAR_COLUMNS_LAYOUT;
	FontData 				yearHeaderFont				= createFont(2.8f, SWT.BOLD);

	// date column
	boolean					isShowDateColumn			= true;
	DateColumnContent		dateColumnContent			= CalendarProfileManager.DEFAULT_DATE_COLUMN_CONTENT;
	FontData				dateColumnFont				= createFont(1.7f, SWT.BOLD);
	int						dateColumnWidth				= CalendarProfileManager.DEFAULT_DATE_COLUMN_WIDTH;
	
	// day date
	boolean					isHideDayDateWhenNoTour		= true;
	boolean					isShowDayDate				= false;
	boolean 				isShowDayDateWeekendColor	= CalendarProfileManager.DEFAULT_IS_SHOW_DAY_DATE_WEEKEND_COLOR;
	FontData				dayDateFont					= createFont(1.2f, SWT.BOLD);
	DayDateFormat			dayDateFormat				= CalendarProfileManager.DEFAULT_DAY_DATE_FORMAT;
	
	// tour background
	TourBackground			tourBackground				= CalendarProfileManager.DEFAULT_TOUR_BACKGROUND;
	CalendarColor			tourBackgroundColor1		= CalendarProfileManager.DEFAULT_TOUR_BACKGROUND_COLOR1;
	CalendarColor			tourBackgroundColor2		= CalendarProfileManager.DEFAULT_TOUR_BACKGROUND_COLOR2;
	int						tourBackgroundWidth			= CalendarProfileManager.DEFAULT_TOUR_BACKGROUND_WIDTH;
	TourBorder 				tourBorder					= CalendarProfileManager.DEFAULT_TOUR_BORDER;
	CalendarColor 			tourBorderColor				= CalendarProfileManager.DEFAULT_TOUR_BORDER_COLOR;
	int		 				tourBorderWidth				= CalendarProfileManager.DEFAULT_TOUR_BORDER_WIDTH;

	// tour content
	boolean 				isShowTourContent			= true;
	boolean					isShowTourValueUnit			= true;
	boolean					isTruncateTourText			= CalendarProfileManager.DEFAULT_IS_TRUNCATE_TOUR_TEXT;
	FormatterData[]			allTourFormatterData		= CalendarProfileManager.DEFAULT_TOUR_FORMATTER_DATA;
	CalendarColor			tourContentColor			= CalendarProfileManager.DEFAULT_TOUR_COLOR;
	FontData				tourContentFont				= createFont(0.9f, SWT.NORMAL);
	CalendarColor 			tourTitleColor				= CalendarProfileManager.DEFAULT_TOUR_COLOR;
	FontData				tourTitleFont				= createFont(1.2f, SWT.BOLD);
	int						tourTruncatedLines			= CalendarProfileManager.DEFAULT_TOUR_TRUNCATED_LINES;
	CalendarColor			tourValueColor				= CalendarProfileManager.DEFAULT_TOUR_COLOR;
	int 					tourValueColumns			= CalendarProfileManager.DEFAULT_TOUR_VALUE_COLUMNS;
	FontData				tourValueFont				= createFont(1.1f, SWT.BOLD);

	// week summary column
	boolean					isShowSummaryColumn			= true;
	boolean 				isShowWeekValueUnit			= true;
	FormatterData[]			allWeekFormatterData		= CalendarProfileManager.DEFAULT_WEEK_FORMATTER_DATA;
	int						weekColumnWidth				= CalendarProfileManager.DEFAULT_SUMMARY_COLUMN_WIDTH;
	CalendarColor			weekValueColor				= CalendarProfileManager.DEFAULT_WEEK_VALUE_COLOR;
	FontData 				weekValueFont				= createFont(1.2f, SWT.BOLD);

// SET_FORMATTING_ON

	/**
	 * @param relSize
	 * @param style
	 * @return
	 */
	static FontData createFont(final float relSize, final int style) {

		final Display display = Display.getDefault();

		// !!! getFontData() MUST be created for EVERY font otherwise they use all the SAME font !!!
		final FontData[] fontData = display.getSystemFont().getFontData();

		for (final FontData element : fontData) {

			element.setHeight((int) (element.getHeight() * relSize));
			element.setStyle(style);

			break;
		}

		return fontData[0];
	}

	void dump() {

		final StringBuilder sb = new StringBuilder();
		sb.append(""); //$NON-NLS-1$
		sb.append(""); //$NON-NLS-1$

		final CalendarProfile profile = this;

// SET_FORMATTING_OFF

        sb.append("\n"); //$NON-NLS-1$
        sb.append("\n"); //$NON-NLS-1$
        sb.append("\n"); //$NON-NLS-1$
        sb.append("// SET_FORMATTING_OFF"); //$NON-NLS-1$
        sb.append("\n"); //$NON-NLS-1$
        sb.append("\n"); //$NON-NLS-1$
        sb.append("//                                     " + profile.name + "\n"); //$NON-NLS-1$ //$NON-NLS-2$
        sb.append("\n"); //$NON-NLS-1$
        sb.append("profile.defaultId                     = ProfileDefault." + defaultId                   + ";\n"); //$NON-NLS-1$ //$NON-NLS-2$
        sb.append("\n"); //$NON-NLS-1$
        sb.append("// layout                                                                                  \n"); //$NON-NLS-1$
        sb.append("profile.isToggleMonthColor            = " + isToggleMonthColor                         + ";\n"); //$NON-NLS-1$ //$NON-NLS-2$
        sb.append("profile.useDraggedScrolling           = " + useDraggedScrolling                        + ";\n"); //$NON-NLS-1$ //$NON-NLS-2$
        sb.append("profile.alternateMonthRGB             = " + dump_RGB(profile.alternateMonthRGB)        + ";\n"); //$NON-NLS-1$ //$NON-NLS-2$
        sb.append("profile.calendarBackgroundRGB         = " + dump_RGB(profile.calendarBackgroundRGB)    + ";\n"); //$NON-NLS-1$ //$NON-NLS-2$
        sb.append("profile.calendarForegroundRGB         = " + dump_RGB(profile.calendarForegroundRGB)    + ";\n"); //$NON-NLS-1$ //$NON-NLS-2$
        sb.append("profile.weekHeight                    = " + weekHeight                                 + ";\n"); //$NON-NLS-1$ //$NON-NLS-2$
        sb.append("                                                                                           \n"); //$NON-NLS-1$
        sb.append("// year columns                                                                            \n"); //$NON-NLS-1$
        sb.append("profile.isShowYearColumns             = " + isShowYearColumns                          + ";\n"); //$NON-NLS-1$ //$NON-NLS-2$
        sb.append("profile.yearColumns                   = " + yearColumns                                + ";\n"); //$NON-NLS-1$ //$NON-NLS-2$
        sb.append("profile.yearColumnsSpacing            = " + yearColumnsSpacing                         + ";\n"); //$NON-NLS-1$ //$NON-NLS-2$
        sb.append("profile.yearColumnsStart              = ColumnStart." + yearColumnsStart               + ";\n"); //$NON-NLS-1$ //$NON-NLS-2$
        sb.append("profile.yearHeaderFont                = " + dump_Font(yearHeaderFont)                  + ";\n"); //$NON-NLS-1$ //$NON-NLS-2$
        sb.append("                                                                                           \n"); //$NON-NLS-1$
        sb.append("// date column                                                                             \n"); //$NON-NLS-1$
        sb.append("profile.isShowDateColumn              = " + isShowDateColumn                           + ";\n"); //$NON-NLS-1$ //$NON-NLS-2$
        sb.append("profile.dateColumnContent             = DateColumnContent." + dateColumnContent        + ";\n"); //$NON-NLS-1$ //$NON-NLS-2$
        sb.append("profile.dateColumnFont                = " + dump_Font(dateColumnFont)                  + ";\n"); //$NON-NLS-1$ //$NON-NLS-2$
        sb.append("profile.dateColumnWidth               = " + dateColumnWidth                            + ";\n"); //$NON-NLS-1$ //$NON-NLS-2$
        sb.append("                                                                                           \n"); //$NON-NLS-1$
        sb.append("// day date                                                                                \n"); //$NON-NLS-1$
        sb.append("profile.isHideDayDateWhenNoTour       = " + isHideDayDateWhenNoTour                    + ";\n"); //$NON-NLS-1$ //$NON-NLS-2$
        sb.append("profile.isShowDayDate                 = " + isShowDayDate                              + ";\n"); //$NON-NLS-1$ //$NON-NLS-2$
        sb.append("profile.isShowDayDateWeekendColor     = " + isShowDayDateWeekendColor                  + ";\n"); //$NON-NLS-1$ //$NON-NLS-2$
        sb.append("profile.dayDateFont                   = " + dump_Font(dayDateFont)                     + ";\n"); //$NON-NLS-1$ //$NON-NLS-2$
        sb.append("profile.dayDateFormat                 = DayDateFormat." + dayDateFormat                + ";\n"); //$NON-NLS-1$ //$NON-NLS-2$
        sb.append("                                                                                           \n"); //$NON-NLS-1$
        sb.append("// tour background                                                                         \n"); //$NON-NLS-1$
        sb.append("profile.tourBackground                = TourBackground." + tourBackground              + ";\n"); //$NON-NLS-1$ //$NON-NLS-2$
        sb.append("profile.tourBackgroundColor1          = CalendarColor." + tourBackgroundColor1         + ";\n"); //$NON-NLS-1$ //$NON-NLS-2$
        sb.append("profile.tourBackgroundColor2          = CalendarColor." + tourBackgroundColor2         + ";\n"); //$NON-NLS-1$ //$NON-NLS-2$
        sb.append("profile.tourBackgroundWidth           = " + tourBackgroundWidth                        + ";\n"); //$NON-NLS-1$ //$NON-NLS-2$
        sb.append("profile.tourBorder                    = TourBorder." + tourBorder                      + ";\n"); //$NON-NLS-1$ //$NON-NLS-2$
        sb.append("profile.tourBorderColor               = CalendarColor." + tourBorderColor              + ";\n"); //$NON-NLS-1$ //$NON-NLS-2$
        sb.append("profile.tourBorderWidth               = " + tourBorderWidth                            + ";\n"); //$NON-NLS-1$ //$NON-NLS-2$
        sb.append("                                                                                           \n"); //$NON-NLS-1$
        sb.append("// tour content                                                                            \n"); //$NON-NLS-1$
        sb.append("profile.isShowTourContent             = " + isShowTourContent                          + ";\n"); //$NON-NLS-1$ //$NON-NLS-2$
        sb.append("profile.isShowTourValueUnit           = " + isShowTourValueUnit                        + ";\n"); //$NON-NLS-1$ //$NON-NLS-2$
        sb.append("profile.isTruncateTourText            = " + isTruncateTourText                         + ";\n"); //$NON-NLS-1$ //$NON-NLS-2$
//      sb.append("profile.allTourFormatterData          = " + allTourFormatterData         		      + ";\n");
        sb.append("profile.tourContentColor              = CalendarColor." + tourContentColor             + ";\n"); //$NON-NLS-1$ //$NON-NLS-2$
        sb.append("profile.tourContentFont               = " + dump_Font(tourContentFont)                 + ";\n"); //$NON-NLS-1$ //$NON-NLS-2$
        sb.append("profile.tourTitleColor                = CalendarColor." + tourTitleColor               + ";\n"); //$NON-NLS-1$ //$NON-NLS-2$
        sb.append("profile.tourTitleFont                 = " + dump_Font(tourTitleFont)                   + ";\n"); //$NON-NLS-1$ //$NON-NLS-2$
        sb.append("profile.tourTruncatedLines            = " + tourTruncatedLines                         + ";\n"); //$NON-NLS-1$ //$NON-NLS-2$
        sb.append("profile.tourValueColor                = CalendarColor." + tourValueColor               + ";\n"); //$NON-NLS-1$ //$NON-NLS-2$
        sb.append("profile.tourValueColumns              = " + tourValueColumns                           + ";\n"); //$NON-NLS-1$ //$NON-NLS-2$
        sb.append("profile.tourValueFont                 = " + dump_Font(tourValueFont)                   + ";\n"); //$NON-NLS-1$ //$NON-NLS-2$
        sb.append("                                                                                           \n"); //$NON-NLS-1$
        sb.append("// week summary column                                                                     \n"); //$NON-NLS-1$
        sb.append("profile.isShowSummaryColumn           = " + isShowSummaryColumn                        + ";\n"); //$NON-NLS-1$ //$NON-NLS-2$
        sb.append("profile.isShowWeekValueUnit           = " + isShowWeekValueUnit                        + ";\n"); //$NON-NLS-1$ //$NON-NLS-2$
//      sb.append("profile.allWeekFormatterData          = " + allWeekFormatterData                       + ";\n");
        sb.append("profile.weekColumnWidth               = " + weekColumnWidth                            + ";\n"); //$NON-NLS-1$ //$NON-NLS-2$
        sb.append("profile.weekValueColor                = CalendarColor." + weekValueColor               + ";\n"); //$NON-NLS-1$ //$NON-NLS-2$
        sb.append("profile.weekValueFont                 = " + dump_Font(weekValueFont)                   + ";\n"); //$NON-NLS-1$ //$NON-NLS-2$
        sb.append("\n"); //$NON-NLS-1$
        sb.append("// SET_FORMATTING_ON"); //$NON-NLS-1$
        sb.append("\n"); //$NON-NLS-1$
        sb.append("\n"); //$NON-NLS-1$
        sb.append("\n"); //$NON-NLS-1$

// SET_FORMATTING_ON

		System.out.print(sb.toString());
	}

	private String dump_Font(final FontData fontData) {

		final Display display = Display.getDefault();

		// !!! getFontData() MUST be created for EVERY font otherwise they use all the SAME font !!!
		final FontData[] allSystemFontData = display.getSystemFont().getFontData();
		final FontData systemFontData = allSystemFontData[0];

		final float fontHeight = (float) fontData.getHeight() / (float) systemFontData.getHeight() + 0.05f;

		final int fontStyle = fontData.getStyle();
		String fontStyleText;

		if (fontStyle == SWT.BOLD) {
			fontStyleText = "SWT.BOLD"; //$NON-NLS-1$
		} else if (fontStyle == SWT.ITALIC) {
			fontStyleText = "SWT.ITALIC"; //$NON-NLS-1$
		} else {
			fontStyleText = "SWT.NORMAL"; //$NON-NLS-1$
		}

		return String.format("CalendarProfile.createFont(%.1ff, %s)", fontHeight, fontStyleText); //$NON-NLS-1$
	}

	private String dump_RGB(final RGB rgb) {

		return "new RGB (" + rgb.red + ", " + rgb.green + ", " + rgb.blue + ")"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	}

	@Override
	public boolean equals(final Object obj) {

		if (this == obj) {
			return true;
		}

		if (obj == null) {
			return false;
		}

		if (getClass() != obj.getClass()) {
			return false;
		}

		final CalendarProfile other = (CalendarProfile) obj;

		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}

		return true;
	}

	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());

		return result;
	}

	@Override
	public String toString() {
		return "CalendarProfile [name=" + name + "]"; //$NON-NLS-1$ //$NON-NLS-2$
	}

}
