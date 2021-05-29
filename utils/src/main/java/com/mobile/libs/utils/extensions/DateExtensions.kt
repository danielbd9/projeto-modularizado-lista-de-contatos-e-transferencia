package com.mobile.libs.utils.extensions

import java.util.*

fun Date.toCalendar(): Calendar = Calendar.getInstance().also {
    it.time = this
}

fun inicioData(date: Date?): Date? {
    return date?.toCalendar()?.apply { iniciarTempo() }?.time
}

fun Calendar.iniciarTempo() {
    set(Calendar.HOUR_OF_DAY, 0)
    set(Calendar.MINUTE, 0)
    set(Calendar.SECOND, 0)
    set(Calendar.MILLISECOND, 0)
}