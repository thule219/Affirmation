package com.example.affirmation.data

import com.example.affirmation.R
import com.example.affirmation.model.Affirmation

class DataSource {
    fun loadAffirmation():List<Affirmation>{
        return listOf<Affirmation>(
            Affirmation(R .string.affirmation1),
            Affirmation(R .string.affirmation2),
            Affirmation(R .string.affirmation3),
            Affirmation(R .string.affirmation4),
            Affirmation(R .string.affirmation5),


        )
    }
}