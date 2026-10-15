package com.example.gestaoestado.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType

@Composable
fun CaixaDeEntrada (
    modifier: Modifier = Modifier,
    label : String,
    placeholder: String,
    keyboard: KeyboardType,
    value : String,
    atualizarValor  : (String) -> Unit
) {

    OutlinedTextField(
        modifier = modifier
            .fillMaxWidth(),
        label = { Text(text = label) },
        singleLine = true,
        placeholder = { Text(text = placeholder) },
        keyboardOptions = KeyboardOptions(keyboardType = keyboard),
        value = value,
        onValueChange = { atualizarValor(it) },
    )

}