package com.example.presentaciondev

import android.content.res.Resources
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.presentaciondev.ui.theme.PresentacionDevTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PresentacionDevTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = Color(red = 223, green = 227, blue = 211)) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        verticalArrangement = Arrangement.SpaceBetween,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        // Espacio vacío arriba para empujar partePrincipal al centro
                        Column(
                            modifier = Modifier.weight(1f),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            partePrincipal("Gabriel Fernando Barrantes Cabello", "Desarrollador JAVA")
                        }

                        parteSecundaria()
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PresentacionDevTheme {
        Greeting("Android")
    }
}

@Composable
fun partePrincipal(nombreCompleto: String, titulo: String, modifier: Modifier = Modifier){
    val imagen = painterResource(R.drawable.android_logo)
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = imagen,
            contentDescription = null
        )
        Text(
            text = nombreCompleto,
            fontSize = 24.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = titulo,
            fontSize = 18.sp,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun parteSecundaria(modifier: Modifier = Modifier){
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        cajaDatosContacto(painterResource(R.drawable.telefono_msg), "+51 933734545")
        cajaDatosContacto(painterResource(R.drawable.share), "@gabrielBC16")
        cajaDatosContacto(painterResource(R.drawable.email), "gabrielf.barrantes@gmail.com")
    }
}

@Composable
fun cajaDatosContacto(icono: Painter, texto: String, modifier: Modifier = Modifier){
    Row(modifier = modifier) {
        Icon(
            painter = icono,
            contentDescription = null,
            modifier = Modifier.padding(horizontal = 6.dp)
        )
        Text(
            text = texto,
            fontSize = 12.sp
        )
    }
}