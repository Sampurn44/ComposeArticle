package com.example.composearticle

import android.os.Bundle
import android.provider.Settings.Global.getString
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    FinalFunctiontobeadded()
                }
            }
        }
    }
}
/*getString(R.string.Heading1),
                        getString(R.string.shortdesc),
                        getString(R.string.londesc)*/
@Composable
fun FinalFunctiontobeadded(){
    ComposeWithImage(
        title = stringResource(R.string.Heading1),
        shortDescription = stringResource(R.string.shortdesc),
        longDescription = stringResource(R.string.londesc),
        imagePainter = painterResource(R.drawable.bg_compose_background)
    )
}
@Composable
fun ComposeWithImage(title: String,
                     shortDescription: String,
                     longDescription: String,
                     imagePainter: Painter,
                     modifier: Modifier = Modifier,){
    val image = painterResource(id = R.drawable.bg_compose_background)
    Column(modifier=modifier){
        Image(painter = image, contentDescription =null)
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(align = Alignment.CenterHorizontally)
                .padding(start = 16.dp,end=16.dp, bottom = 16.dp, top = 16.dp)
        )
        Text(
            text = shortDescription,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(start = 16.dp,end=16.dp)
        )
        Text(
            text = longDescription,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(start = 16.dp,end=16.dp, bottom = 16.dp, top = 16.dp)
        )
    }
    }

@Preview(showBackground = true)
@Composable
fun ComposeWithImagePreview() {
    ComposeArticleTheme {
        FinalFunctiontobeadded()
    }
}