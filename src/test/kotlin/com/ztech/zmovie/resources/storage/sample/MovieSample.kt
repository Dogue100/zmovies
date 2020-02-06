package com.ztech.zmovie.resources.storage.sample

import com.ztech.zmovie.domain.entities.Movie
import com.ztech.zmovie.domain.entities.Rate
import java.text.SimpleDateFormat

fun movieSample() =   Movie(
    title = "ET",
    director = "Steven Spielberg",
    releaseDate =  SimpleDateFormat("yyyy-MM-dd").parse("1982-5-23"),
    actors = listOf("Drew Barrymore", "Henry Thomas"),
    rate = Rate.SEM_CENSURA
)