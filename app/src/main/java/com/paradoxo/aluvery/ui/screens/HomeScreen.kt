package com.paradoxo.aluvery.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.paradoxo.aluvery.R
import com.paradoxo.aluvery.model.Product
import com.paradoxo.aluvery.sampleData.sampleProducts
import com.paradoxo.aluvery.ui.components.ProdutcsSection
import java.math.BigDecimal

@Composable
fun HomeScreen() {
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(
                rememberScrollState()
            )
            .background(MaterialTheme.colorScheme.secondaryContainer),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Spacer(Modifier)
        ProdutcsSection("Promoções", sampleProducts)
        ProdutcsSection(
            "Doces", listOf(
                Product(
                    "Chocolate Kitkat", BigDecimal("4.20"), R.drawable.placeholder
                )))
        ProdutcsSection(
            "Bebidas", sampleProducts
        )
        Spacer(Modifier)
    }
}

@Preview(showSystemUi = true)
@Composable
fun HomeScreenPrewviw() {
    HomeScreen()
}