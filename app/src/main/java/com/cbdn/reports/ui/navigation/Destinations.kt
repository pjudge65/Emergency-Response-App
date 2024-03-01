package com.cbdn.reports.ui.navigation

import androidx.annotation.StringRes
import com.cbdn.reports.R

enum class Destinations(
    @StringRes val title: Int
    ) {
    StartScreen(
        title = R.string.start_screen
    ),
    TruckLandingPage(
      title = R.string.truck_landing_page
    ),
    InputEmergency(
        title=R.string.input_emergency
    ),
    AppMenu(
        title = R.string.app_name
    ),
    LogInPage(
        title = R.string.admin_login
    ),
    NewReport(
        title = R.string.submit_new_header
    ),
    FinishReport(
        title = R.string.finish_report
    ),
    SearchReports(
        title = R.string.search_reports
    ),
//    ViewStatistics(
//        title = R.string.view_statistics
//    )
}