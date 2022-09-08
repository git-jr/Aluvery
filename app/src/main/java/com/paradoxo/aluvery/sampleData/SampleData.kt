package com.paradoxo.aluvery.sampleData

import com.paradoxo.aluvery.R
import com.paradoxo.aluvery.model.Product
import java.math.BigDecimal

val sampleProducts = listOf(
    Product(
        name = "Hamburger",
        price = BigDecimal("12.99"),
        image = R.drawable.burger
    ),

    Product(
        name = "Pizza",
        price = BigDecimal("19.99"),
        image = R.drawable.pizza
    ),

    Product(
        name = "Batata frita",
        price = BigDecimal("7.99"),
        image = R.drawable.fries
    )
)