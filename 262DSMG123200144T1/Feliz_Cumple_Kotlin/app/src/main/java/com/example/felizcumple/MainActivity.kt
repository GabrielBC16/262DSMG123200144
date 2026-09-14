package com.example.felizcumple

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.felizcumple.ui.theme.FelizCumpleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FelizCumpleTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    /*GreetingImage(
                        message = stringResource(R.string.saludo_cumple),
                        from = stringResource(R.string.firma_cumple),
                        modifier = Modifier.padding(8.dp)
                    )*/
                    /*instructivoJetpackPantalla(
                        titulo = stringResource(R.string.jetpack_titulo),
                        parrafo1 = stringResource(R.string.jetpack_parrafo1),
                        parrafo2 = stringResource(R.string.jetpack_parrafo2)
                    )*/
                    /*adminTareasPantalla(
                        textoPrincipal = stringResource(R.string.adminTareas_textoPrincipal),
                        textoSecundario = stringResource(R.string.adminTareas_textoSecundario)
                        )
                }*/
                    composeCuadrantesPantalla()
                }
            }
        }
    }

    @Composable
    fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = modifier
        ) {
            Text(
                text = message,
                fontSize = 100.sp,
                lineHeight = 116.sp,
                textAlign = TextAlign.Center
            )

            Text(
                text = from,
                fontSize = 36.sp,
                modifier = Modifier
                    .padding(16.dp)
                    .align(alignment = Alignment.CenterHorizontally)
            )
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        FelizCumpleTheme {
            GreetingImage(message = "Feliz cumple Gabriel", from = "De Mario")
        }
    }

    @Composable
    fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
        val image = painterResource(R.drawable.androidparty)
        Box(modifier) {
            Image(
                painter = image,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                alpha = 0.5F
            )
            GreetingText(
                message = message,
                from = from,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp)
            )
        }
    }

    @Composable
    fun instructivoJetpackPantalla(
        titulo: String,
        parrafo1: String,
        parrafo2: String,
        modifier: Modifier = Modifier
    ) {
        val imagen = painterResource(R.drawable.bg_compose_background)
        Column(modifier) {
            Image(
                painter = imagen,
                contentDescription = null,
                contentScale = ContentScale.FillWidth
            )
            Text(
                text = titulo,
                fontSize = 24.sp,
                modifier = Modifier.padding(16.dp),
                textAlign = TextAlign.Left
            )
            Text(
                text = parrafo1,
                fontSize = 18.sp,
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(16.dp),
            )
            Text(
                text = parrafo2,
                fontSize = 18.sp,
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(16.dp),
            )

        }
    }

    @Composable
    fun adminTareasPantalla(
        textoPrincipal: String,
        textoSecundario: String,
        modifier: Modifier = Modifier
    ) {
        val imagen = painterResource(R.drawable.ic_task_completed)
        Column(
            modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = imagen,
                contentDescription = null
            )
            Text(
                text = textoPrincipal,
                fontWeight = FontWeight.Bold,
                modifier = modifier.padding(top = 24.dp, bottom = 8.dp)
            )
            Text(
                text = textoSecundario,
                fontSize = 16.sp
            )
        }
    }

    @Composable
    fun cuadranteCard(
        titulo: String,
        descripcion: String,
        colorFondo: Color,
        modifier: Modifier = Modifier
    ) {
        Column(
            modifier = modifier.fillMaxSize()
                .background(colorFondo)
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = titulo,

                fontWeight = FontWeight.Bold
            )
            Text(
                text = descripcion,
                textAlign = TextAlign.Justify
            )
        }
    }

    @Composable
    fun composeCuadrantesPantalla() {
        Column(Modifier.fillMaxWidth()) {
            Row(Modifier.weight(1f)) {
                cuadranteCard(
                    titulo = stringResource(R.string.titulo1),
                    descripcion = stringResource(R.string.descripcion1),
                    colorFondo = Color(0xFFEADDFF),
                    modifier = Modifier.weight(1f)
                )
                cuadranteCard(
                    titulo = stringResource(R.string.titulo2),
                    descripcion = stringResource(R.string.descripcion2),
                    colorFondo = Color(0xFFD0BCFF),
                    modifier = Modifier.weight(1f)
                )
            }
            Row(Modifier.weight(1f)) {
                cuadranteCard(
                    titulo = stringResource(R.string.titulo3),
                    descripcion = stringResource(R.string.descripcion3),
                    colorFondo = Color(0xFFB69DF8),
                    modifier = Modifier.weight(1f)
                )
                cuadranteCard(
                    titulo = stringResource(R.string.titulo4),
                    descripcion = stringResource(R.string.descripcion4),
                    colorFondo = Color(0xFFF6EDFF),
                    modifier = Modifier.weight(1f)
                )
            }
        }
    }
}
