package com.thesidh.zmovie.storage.sample

import com.thesidh.zmovie.domain.entities.Rate
import com.thesidh.zmovie.storage.mongodb.entities.MovieDocument
import java.text.SimpleDateFormat

fun movieDocumentSample() = MovieDocument(
    id = "ET",
    director = "Steven Spielberg",
    releaseDate = SimpleDateFormat("yyyy-MM-dd").parse("1982-5-23"),
    actors = listOf("Drew Barrymore", "Henry Thomas"),
    rate = Rate.SEM_CENSURA
)