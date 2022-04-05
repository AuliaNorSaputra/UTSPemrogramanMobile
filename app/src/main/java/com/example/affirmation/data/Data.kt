package com.example.affirmation.data

import com.example.affirmation.R
import com.example.affirmation.model.snake

class Data() {

    fun loadAffirmations(): List<snake> {
        return listOf<snake>(
            snake(R.string.snake1,
                R.drawable.sancakembang,
                "Malayopython reticulatus",
                "panjang maksimal melebihi 8.5 meter "),
            snake(R.string.snake2,
                R.drawable.anakonda,
                "Eunectes",
                "panjang maksimal melebihi 8.43 meter"),
            snake(R.string.snake3,
                R.drawable.mamba,
                "Dendroaspis",
                "panjang maksimal melebihi 4.3 meter"),
            snake(R.string.snake4,
                R.drawable.derik,
                "Crotalus sp",
                "panjang maksimal melebihi 1.38 meter"),
            snake(R.string.snake5,
                R.drawable.cobra,
                "Naja",
                "panjang maksimal melebihi 1,8 meter"),
            snake(R.string.snake6,
                R.drawable.beludak,
                "Vipera beruz",
                "diperkirakan lebih dari 1.6 meter"),
            snake(R.string.snake7,
                R.drawable.jali,
                "Ptyas korros",
                "panjang maksimal melebihi 2.5 meter"),
            snake(R.string.snake8,
                R.drawable.laut,
                "Hydrophiinae",
                "panjang maksimal melebihi 2,7 meter"),
            snake(R.string.snake9,
                R.drawable.kadut,
                "Acrochordus granulatus",
                "panjang maksimal melebihi 2.4 meter"),
            snake(R.string.snake10,
                R.drawable.boa,
                "Boa constrictor",
                "panjang maksimal melebihi 3.9 meter")
        )
    }
}