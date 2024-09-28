package com.example.quizkit.ui.component

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quizkit.R

@Composable
fun InputForm(
    title:String,icon:Int,
    disable:Boolean = false,
    colorPaint:Int = R.color.white,
    value:String,
    onChange:(String)->Unit){
    val textInput = ""


    Spacer(modifier = Modifier.height(12.dp))
    Text(
        text = title,
        fontSize = 18.sp,
        fontWeight = FontWeight.Medium
    )
    Spacer(modifier = Modifier.height(8.dp))
    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        value = value.ifBlank { textInput },
        onValueChange = onChange,
        singleLine = true,
        leadingIcon = {
            Icon(
                painter = painterResource(id = icon),
                contentDescription = title,
                tint = colorResource(id = R.color.primary_purple)
            )
        },
        colors = TextFieldDefaults.colors(
            unfocusedContainerColor = colorResource(id = colorPaint),
            unfocusedIndicatorColor = colorResource(id = colorPaint),
            unfocusedTextColor = Color.Black,
            focusedTextColor = Color.Black,
            focusedContainerColor = colorResource(id = colorPaint),
            focusedIndicatorColor = colorResource(id = R.color.primary_purple),
        ),
        placeholder = {
            Text(
                text = title,
                color = Color.Gray,
                fontSize = 16.sp
            )
        },
    )
}


@Composable
fun EmailInputForm(
    title:String,icon:Int,
    colorPaint:Int = R.color.white,
    value:String,
    onChange:(String)->Unit
) {
    var isFocused by remember { mutableStateOf(false) }
    val isValidEmail = value.endsWith("@gmail.com")
    val showError = !isValidEmail && !isFocused

    Spacer(modifier = Modifier.height(12.dp))
    Text(
        text = title,
        fontSize = 18.sp,
        fontWeight = FontWeight.Medium
    )
    Spacer(modifier = Modifier.height(8.dp))

    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .onFocusChanged { focusState ->
                isFocused = focusState.isFocused
            },
        value = value,
        onValueChange = onChange,
        singleLine = true,
        leadingIcon = {
            Icon(
                painter = painterResource(id = icon),
                contentDescription = "Email Icon",
                tint = colorResource(id = R.color.primary_purple)
            )
        },
        colors = TextFieldDefaults.colors(
            unfocusedContainerColor = colorResource(id = colorPaint),
            unfocusedIndicatorColor = colorResource(id = colorPaint),
            unfocusedTextColor = Color.Black,
            focusedTextColor = Color.Black,
            focusedContainerColor = colorResource(id = colorPaint),
            focusedIndicatorColor = colorResource(id = R.color.primary_purple),
        ),
        placeholder = {
            Text(
                text = "Email Address",
                color = Color.Gray,
                fontSize = 16.sp
            )
        },
        isError = showError
    )

    if (showError && value.isNotBlank()) {
        Text(
            text = "Please enter a valid Gmail address",
            color = Color.Red,
            fontSize = 14.sp
        )
    }
}


@Composable
fun PasswordInputForm(
    title:String,icon:Int,
    colorPaint:Int = R.color.white,
    value:String,
    onChange:(String)->Unit
) {
    var isFocused by remember { mutableStateOf(false) }
    val hasUpperCase = value.any { it.isUpperCase() }
    val showError = !hasUpperCase && !isFocused

    Spacer(modifier = Modifier.height(12.dp))
    Text(
        text = title,
        fontSize = 18.sp,
        fontWeight = FontWeight.Medium
    )
    Spacer(modifier = Modifier.height(8.dp))

    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .onFocusChanged { focusState ->
                isFocused = focusState.isFocused
            },
        value = value,
        onValueChange = onChange,
        singleLine = true,
        leadingIcon = {
            Icon(
                painter = painterResource(id = icon ),
                contentDescription = "Password Icon",
                tint = colorResource(id = R.color.primary_purple)
            )
        },
        colors = TextFieldDefaults.colors(
            unfocusedContainerColor = colorResource(id = colorPaint),
            unfocusedIndicatorColor = colorResource(id = colorPaint),
            unfocusedTextColor = Color.Black,
            focusedTextColor = Color.Black,
            focusedContainerColor = colorResource(id = colorPaint),
            focusedIndicatorColor = colorResource(id = R.color.primary_purple),

            ),
        placeholder = {
            Text(
                text = "Password",
                color = Color.Gray,
                fontSize = 16.sp
            )
        },
        isError = showError
    )

    if (showError && value.isNotBlank()) {
        Text(
            text = "Password must contain at least one uppercase letter",
            color = Color.Red,
            fontSize = 14.sp
        )
    }
}
