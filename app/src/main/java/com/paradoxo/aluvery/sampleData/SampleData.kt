package com.paradoxo.aluvery.sampleData

import com.paradoxo.aluvery.R
import com.paradoxo.aluvery.model.Product
import java.math.BigDecimal

val sampleProductsEat = listOf(
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

val sampleProductsSweet = listOf(
    Product(
        "KitKat",
        BigDecimal("4.4"),
        R.drawable.kitkat
    ),

    Product(
        name = "Jujubas",
        price = BigDecimal("4.2"),
        image = R.drawable.jujuba
    )
)

val sampleProductsDrink = listOf(
    Product(
        name = "Coca-Cola",
        price = BigDecimal("99.99"),
        image = R.drawable.coca_cola
    ),

    Product(
        name = "Fanta",
        price = BigDecimal("87.99"),
        image = R.drawable.fanta
    )
)