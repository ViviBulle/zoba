package com.example.zob

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.zob.ui.theme.ZobTheme
import androidx.compose.ui.Alignment
//import androidx.compose.foundation.layout.Column

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ZobTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    XXXimg(zoby =stringResource(R.string.WelCome_Text), stringResource(R.string.Sender_Text))
                    Salute("V.Oid.s.",)

                }
            }
        }
    }
}

@Composable
fun Salute(name: String) {Text
    Text(text = "Salut $name! ",
        fontSize = 36.sp
    )

}


@Composable
fun XXXimg(zoby: String, de: String, modifieur: Modifier = Modifier){
    val image = painterResource(R.drawable.androidpartied)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
    }

    Column(        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally

    )
    {
        Text(
            text = "$zoby!",
            fontSize = 36.sp,
            modifier = Modifier
                .padding(top = 100.dp)

        )
        Text(
            text = "$de!",
            fontSize = 24.sp,
            modifier = Modifier
                .padding(top = 100.dp, end = 16.dp)
                .align(alignment = Alignment.End)


        )

    }
}


@Composable
fun XXX(zoby: String, de: String){
    Column {
        Text(
            text = "$zoby!"
        )
        Text(
            text = "$de!",
            fontSize = 24.sp
        )
    }
}

// ce qui compte le plus dans la vie, la vie..


@Preview(showBackground = false)
@Composable
fun Defaultyreview() {
    ZobTheme {
        XXXimg(zoby = stringResource(R.string.WelCome_Text), de = stringResource(R.string.Sender_Text));
        Salute(".Oid.s.")
    }
}