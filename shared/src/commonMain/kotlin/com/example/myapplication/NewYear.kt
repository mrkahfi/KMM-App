package com.example.myapplication

import kotlinx.datetime.*

fun daysUtilNewYear() : Int {
    val today = Clock.System.todayIn(TimeZone.currentSystemDefault())
    var closesNewYear = LocalDate(today.year + 1, 1, 1)
    return today.daysUntil(closesNewYear)
}