package com.example.compose_box

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose_box.ui.theme.ComposeBoxTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //ComposeBox()
            StackBox()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeBoxTheme {
        //ComposeBox()
        StackBox()
    }
}

@Composable
fun ComposeBox() {
    Box(
        modifier = Modifier
            .size(300.dp, 300.dp)
            .background(Color.Cyan)
            .padding(10.dp)
    ) {
        Box(
            modifier = Modifier
                .size(10.dp, 10.dp)
                .background(Color.Black)
                .align(Alignment.TopStart)
        )

        Box(
            modifier = Modifier
                .size(10.dp, 10.dp)
                .background(Color.Black)
                .align(Alignment.TopCenter)
        )

        Box(
            modifier = Modifier
                .size(10.dp, 10.dp)
                .background(Color.Black)
                .align(Alignment.TopEnd)
        )

        Box(
            modifier = Modifier
                .size(10.dp, 10.dp)
                .background(Color.Red)
                .align(Alignment.CenterStart)
        )

        Box(
            modifier = Modifier
                .size(10.dp, 10.dp)
                .background(Color.Red)
                .align(Alignment.Center)
        )

        Box(
            modifier = Modifier
                .size(10.dp, 10.dp)
                .background(Color.Red)
                .align(Alignment.CenterEnd)
        )

        Box(
            modifier = Modifier
                .size(10.dp, 10.dp)
                .background(Color.Magenta)
                .align(Alignment.BottomStart)
        )

        Box(
            modifier = Modifier
                .size(10.dp, 10.dp)
                .background(Color.Magenta)
                .align(Alignment.BottomCenter)
        )

        Box(
            modifier = Modifier
                .size(10.dp, 10.dp)
                .background(Color.Magenta)
                .align(Alignment.BottomEnd)
        )

    }
}

@Composable
fun StackBox(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Yellow)
    ) {
        Box(modifier = Modifier
            .size(200.dp, 200.dp)
            .background(Color.Green)
            .align(Alignment.Center)
        ){
            Box(modifier = Modifier
                .size(180.dp, 180.dp)
                .background(Color.Red)
                .align(Alignment.Center)
            ){
                Box(modifier = Modifier
                    .size(160.dp, 160.dp)
                    .background(Color.Black)
                    .align(Alignment.Center)
                ){
                    Box(modifier = Modifier
                        .size(140.dp, 140.dp)
                        .background(Color.Cyan)
                        .align(Alignment.Center)
                    )
                }
            }
        }
    }



}