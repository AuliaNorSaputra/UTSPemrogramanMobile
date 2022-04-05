package com.example.affirmation.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

class snake (
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int,
    val latin: String,
    val panjang: String
    )