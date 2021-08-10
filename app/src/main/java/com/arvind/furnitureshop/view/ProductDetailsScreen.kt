package com.arvind.furnitureshop.view

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.arvind.furnitureshop.R
import com.arvind.furnitureshop.component.TopBarWithBack
import com.arvind.furnitureshop.ui.theme.*

@Preview(showBackground = true)
@Composable
fun ProductDetailsScreen() {
    Box(Modifier.verticalScroll(rememberScrollState())) {
        Column {
            TopBarWithBack(
                title = "Product",
                onBackClick = {

                },
            )
            Column {
                Content()
            }
        }
    }
}

@Composable
fun Content() {
    Column() {
        ProductItemsImage()
        ProductContent()
        ProductAbout()
        Spacer(modifier = Modifier.padding(24.dp))
        ProductAddtoCart()

    }
}

@Composable
fun ProductContent() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp)
    ) {
        Column() {
            Text(
                text = "Osmond Armchair",
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                color = paledark,
            )
            Text(
                text = "Chair",
                fontSize = 14.sp,
                color = texttitlewhite,
            )
        }

        Card(
            modifier = Modifier
                .width(130.dp)
                .height(100.dp),
            elevation = 10.dp
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "$240",
                    fontSize = 18.sp,
                    color = paledark,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold
                )
            }
        }

    }
}


@Composable
fun ProductItemsImage() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .fillMaxHeight()
        ) {
            Image(
                painter = painterResource(id = R.drawable.furniture_3),
                contentDescription = "Product Image",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
            )
        }
    }
}

@Composable
fun ProductAbout() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(16.dp)

    ) {

        Box(
            modifier = Modifier
                .size(30.dp)
                .clip(shape = CircleShape)
                .background(orangedark)
        )
        Box(
            modifier = Modifier
                .size(30.dp)
                .clip(shape = CircleShape)
                .background(greendark)
        )
        Box(
            modifier = Modifier
                .size(30.dp)
                .clip(shape = CircleShape)
                .background(orangelight)
        )
    }
    Spacer(modifier = Modifier.padding(5.dp))
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(16.dp)
    ) {
        Text(
            text = "In a best traditions, constructed of hardwood\n" +
                    "with padding of high-resilient foam.Created\n" +
                    "by awarded winning duo of Manchesti\n" +
                    "Bermadi and Fresco Duli brothers.",
            fontSize = 18.sp,
            color = texttitlewhite,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun ProductAddtoCart() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(addtocart),
        contentAlignment = Alignment.BottomCenter
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Card(
                modifier = Modifier
                    .offset(16.dp, (-40).dp)
                    .fillMaxWidth(0.2f)
                    .height(70.dp),
                shape = RoundedCornerShape(20.dp)
            ) {
                IconButton(
                    onClick = { },
                    Modifier.background(paleBlack)
                ) {
                    Icon(
                        imageVector = Icons.Outlined.ShoppingCart,
                        contentDescription = "",
                        tint = white
                    )

                }
            }
            ClickableText(
                text = AnnotatedString("+ Add to Cart"),
                Modifier.offset(16.dp, (-30).dp),
                onClick = { offset ->
                }
            )


        }
    }
}


