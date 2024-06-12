package com.example.aluvery.sampledata

import com.example.aluvery.R
import com.example.aluvery.product.Product
import java.math.BigDecimal

val sampleProducts = listOf(

    Product(
        name = "Hamburguer",
        price = BigDecimal("24.89"),
        image = R.drawable.hamburger_3483290_640
    ),

    Product
        (
        name = "Pizza",
        price = BigDecimal("20.00"),
        image = R.drawable.pizza_3010062_640
    ),

    Product(
        name = "Batata Frita",
        price = BigDecimal("12.99"),
        image = R.drawable.french_fries_843303_640
    )
)